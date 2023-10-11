package svj.leetcode.string;

public class LongestSubsting {

    static class Counter {
        int a= 0;
        int b= 0;
        public Counter(int a, int b){
            this.a= a;
            this.b= b;
        }
    }

    public static String longestBalancedString(String inp){
        Counter result= getCharCount(inp);
        if(result.a==0 && result.b== 0)
            return "";
        if(result.a== result.b){
            return getMaxSubStr(inp, result.a, result.b);
        }
        return getBalancedSubstr(inp, result.a, result.b);
    }

    private static String getMaxSubStr(String inp, int a, int b) {
        String str1= getBalancedSubstr(inp.substring(0, inp.length()-1), inp.charAt(inp.length()-1)=='a'? a-1: a, inp.charAt(inp.length()-1)=='b'? b-1:b);
        String str2= getBalancedSubstr(inp.substring(1, inp.length()), inp.charAt(0)=='a'? a-1: a, inp.charAt(0)=='b'? b-1:b);
        if(str1.length()> str2.length()) return str1;
        else return str2;
    }

    public static Counter getCharCount(String inp){
        Counter result= new Counter(0, 0);
        for(Character ch: inp.toCharArray()) {
            if (ch == 'a')
                result.a++;
            else
                result.b++;
        }
        return result;
    }

    private static String getBalancedSubstr(String substring, int a, int b) {
        if(a> b){
            if(substring.charAt(0)=='a' && substring.charAt(substring.length()-1)== 'a')
                return getMaxSubStr(substring, a, b);
            else if(substring.charAt(substring.length()-1)=='a')
                return getBalancedSubstr(substring.substring(0, substring.length()-1), a-1, b);
            else
                return getBalancedSubstr(substring.substring(1, substring.length()), a-1, b);
        }else if(a< b){
            if(substring.charAt(0)=='b' && substring.charAt(substring.length()-1)== 'b')
                return getMaxSubStr(substring, a, b);
            else if(substring.charAt(substring.length()-1)=='b')
                return getBalancedSubstr(substring.substring(0, substring.length()-1), a, b-1);
            else
                return getBalancedSubstr(substring.substring(1, substring.length()), a, b-1);
        }
        else
            return substring;
    }
}
