package svj.leetcode.binarysearch;

public class Find_Median_from_Data_Stream_295 {
    List<Integer> list;

    public MedianFinder() {
        list= new ArrayList<Integer>();
    }

    public void addNum(int num) {
        findAndInsertNum(num, 0, list.size());
    }

    public void findAndInsertNum(int num, int l, int r){
        int mid= (l+r)/2;
        // System.out.println("NUM, L, M, R "+num+", "+l+", "+mid+", "+r);
        if(l< 0 || r<0)
            list.add(0, num);
        else if(l> list.size() || r> list.size())
            list.add(num);
        else if(l== r || list.get(mid)== num ){
            list.add(mid, num);
        }
        else if(list.get(mid)< num)
            findAndInsertNum(num, mid+1, r);
        else if(list.get(mid)> num)
            findAndInsertNum(num, l, mid);
    }

    public double findMedian() {
        // System.out.println("count= "+count+", and list is "+list);
        int count= list.size();
        if((count&1)== 1)
            return list.get(count/2);
        else
            return ((double)list.get((count)/2-1)+list.get(count/2))/2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
}
