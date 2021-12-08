package binarytree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    public void createBinaryTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
    }

    @Test
    void add() {
        BinaryTree<String> binaryTree = BinaryTree.of("6", "9", "7");

        assertFalse(binaryTree.containsNode("3"));
        binaryTree.add("3");
        assertTrue(binaryTree.containsNode("3"));

    }

    @Test
    void delete() {

        BinaryTree<Integer> binaryTree = BinaryTree.of(6, 9, 7);

        assertTrue(binaryTree.containsNode(9));
        binaryTree.delete(9);
        assertFalse(binaryTree.containsNode(9));

    }

    @Test
    void containsNode() {

        BinaryTree<Integer> binaryTree = BinaryTree.of(6, 9, 7, 4);

        assertTrue(binaryTree.containsNode(6));
        assertTrue(binaryTree.containsNode(4));


    }

    @Test
    void isNotContainsNode() {

        BinaryTree<Integer> binaryTree = BinaryTree.of(6, 9, 7);

        assertFalse(binaryTree.containsNode(1));
    }

    @Test
    void traversalInOrder(){
        BinaryTree<Integer> binaryTree = BinaryTree.of(100, 26, 6 , 89, 7, 42, 11);
        List<Integer> trueList = Arrays.asList(6, 7, 11, 26, 42, 89, 100);

        List<Integer> list = new ArrayList<>();
        binaryTree.traversalInOrder(list::add);
        assertEquals(trueList ,list);
    }
    @Test
    void traversalInOrderString(){
        BinaryTree<String> binaryTree = BinaryTree.of("X", "Q", "K" , "N", "T", "B", "C");
        List<String> trueList = Arrays.asList("B", "C", "K", "N", "Q", "T", "X");

        List<String> list = new ArrayList<>();
        binaryTree.traversalInOrder(list::add);
        assertEquals(trueList ,list);
    }

}