package svj.leetcode.depthfirstsearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Two_Sum_IV_Input_is_a_BST_653Test {

    private Two_Sum_IV_Input_is_a_BST_653 instance;

    @BeforeEach
    public void setup(){
        instance= new Two_Sum_IV_Input_is_a_BST_653();
    }

    @Test
    public void test1(){
        Two_Sum_IV_Input_is_a_BST_653.TreeNode rootNode = instance.createTreeNode(new Integer[]{5, 3, 6, 2, 4, null, 7});
        boolean result = instance.findTarget(rootNode, 9);
        assertThat(result).isTrue();
    }

    @Test
    public void test2(){
        Two_Sum_IV_Input_is_a_BST_653.TreeNode rootNode = instance.createTreeNode(new Integer[]{5,3,6,2,4,null,7});
        boolean result = instance.findTarget(rootNode, 28);
        assertThat(result).isFalse();
    }

}