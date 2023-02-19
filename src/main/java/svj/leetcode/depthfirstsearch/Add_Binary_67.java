package svj.leetcode.depthfirstsearch;

public class Add_Binary_67 {
    public String addBinary(String a, String b) {
        // lets keep a with longer string
        if(a.length()< b.length()){
            return addBinary(b, a);
        }
        StringBuffer result= new StringBuffer();
        int counter= 1, carry= 0, aLen= a.length(), bLen= b.length();
        for(; counter<= bLen; counter++){
            if(a.charAt(aLen-counter)== '1'){
                if(b.charAt(bLen-counter)=='1'){
                    result.append(carry);
                    carry= 1;
                }else{
                    result.append(1^carry);
                }
            }else{
                if(b.charAt(bLen-counter)=='1'){
                    result.append(1^carry);
                }else{
                    result.append(carry);
                    carry= 0;
                }
            }
        }
        while(counter<= aLen){
            if(carry== 1){
                if(a.charAt(aLen-counter)== '1'){
                    result.append('0');
                }else{
                    result.append('1');
                    carry= 0;
                }
            }else
                result.append(a.charAt(aLen-counter));
            counter++;
        }
        if(carry== 1){
            result.append('1');
        }
        return result.reverse().toString();
    }
}
