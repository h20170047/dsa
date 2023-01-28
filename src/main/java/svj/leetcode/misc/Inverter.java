package svj.leetcode.misc;

public class Inverter {
    public String invert(String inp){
        if(inp== null)
            return "";
        if(inp.length()== 1)
            return inp;
        else
            return new StringBuilder(inp).reverse().toString();
    }
}
