package svj.leetcode.misc;

import java.util.*;

public class MaximumLengthofaConcatenatedStringwithUniqueCharacters {

    class Tuple{
        String acc;
        int ptr;

        public Tuple(String accumulator, int ptr) {
            acc= accumulator; this.ptr= ptr;
        }
    }
    public int maxLength(List<String> arr) {

        Set<String> validConcatenations= new HashSet<>();
        if(arr.size()== 0)
            return 0;
        int ptr1, ptr2, uniqueStrLen= 0, arrLen= arr.size();
        StringBuilder accumulator;

        for(ptr1= 0; ptr1< arrLen; ptr1++){
            accumulator= new StringBuilder(arr.get(ptr1));
//            for(ptr2= ptr1+1; ptr2< arrLen; ptr2++){
//                String consideringStr= arr.get(ptr2);
//                if(doesContainDuplicateChars(consideringStr) ||
//                        doesContainDuplicateChars(accumulator.append(consideringStr).toString())){
//                    continue;
//                }else{
//                    // should have option to add or ignore this word
//                    validConcatenations.add(consideringStr);
//                    validConcatenations.add(accumulator.append(consideringStr).toString());
//                    if(dp.get(processingTuple)!= null)
//                        accumulator= new StringBuilder(dp.get(processingTuple));
//                    else
//                        getOptimalUniqueStr(accumulator, ptr2);
//                }
//            }
        }
        return -1;
    }
}
