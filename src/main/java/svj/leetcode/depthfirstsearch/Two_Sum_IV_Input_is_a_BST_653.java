package svj.leetcode.depthfirstsearch;

import java.util.Deque;
import java.util.LinkedList;

public class Two_Sum_IV_Input_is_a_BST_653 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode createTreeNode(Integer[] arr){
        return helperTreeCreation(arr, 0);
    }

    private TreeNode helperTreeCreation(Integer[] arr, int i) {
        if(i>= arr.length || arr[i]== null)
            return null;
        return new TreeNode(arr[i], helperTreeCreation(arr, 2*i+1), helperTreeCreation(arr, 2*i+2));
    }

    public boolean findTarget(TreeNode root, int k) {
        Deque<TreeNode> stack= new LinkedList<>();
        stack.push(root);
        while(! stack.isEmpty()){
            TreeNode processing= stack.pop(); // always push non-null values to stack
            // search if we have k-p.val in BST
            int toFind= k- processing.val;
            if(find(root, processing, toFind))
                return true;
            if(processing.left!= null)
                stack.push(processing.left);
            if(processing.right!= null)
                stack.push(processing.right);
        }
        return false;
    }

    private boolean find(TreeNode root, TreeNode processing, int toFind) {
        if(root!= null && toFind< root.val)
            return find(root.left, processing, toFind);
        else if(root!= null && toFind> root.val)
            return find(root.right, processing, toFind);
        else if(root!= null && toFind== root.val){
            if(root!= processing)
                return true;
            else return find(root.left, processing, toFind);
        }
        return false;
    }
}
