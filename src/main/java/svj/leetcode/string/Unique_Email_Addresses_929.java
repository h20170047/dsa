package svj.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class Unique_Email_Addresses_929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> distinctEmail= new HashSet<>();
        for(String email: emails){
            StringBuilder stringBuilder= new StringBuilder("");
            String localName= email.split("@")[0];
            String domainName= email.split("@")[1];
            for(Character letter: localName.toCharArray()){
                if(letter.equals('+'))
                    break;
                switch (letter){
                    case '.': continue;
                    default: stringBuilder.append(letter);
                }
            }
            stringBuilder.append("@"+domainName);
            distinctEmail.add(stringBuilder.toString());
        }
        return distinctEmail.size();
    }
}
