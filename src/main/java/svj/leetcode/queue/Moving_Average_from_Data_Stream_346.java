package svj.leetcode.queue;

import java.util.Deque;
import java.util.LinkedList;

public class Moving_Average_from_Data_Stream_346 {
    private Deque<Integer> queue= new LinkedList<>();
    private int window;
    public Moving_Average_from_Data_Stream_346(int size) {
        window= size;
    }

    public double next(int val) {
        if(!queue.isEmpty() && queue.size()>= window)
            queue.remove();
        queue.add(val);
        int count= 0, n= queue.size();
        double result= 0;
        for(int element: queue){
//            double intermediate= (double)element/n;
//            System.out.println("Adding "+element+" : value= "+intermediate);
            result+= element;
        }
        return result/n;
    }
}
