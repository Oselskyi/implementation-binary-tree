package binarytree;

import org.junit.jupiter.api.Test;

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


}