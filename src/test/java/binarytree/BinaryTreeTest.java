package binarytree;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @org.junit.jupiter.api.Test
    void delete() {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(6);
        binaryTree.add(9);
        binaryTree.add(7);

        assertTrue(binaryTree.containsNode(9));
        binaryTree.delete(9);
        assertFalse(binaryTree.containsNode(9));

    }

    @org.junit.jupiter.api.Test
    void containsNode() {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(7);

        assertTrue(binaryTree.containsNode(6));
        assertTrue(binaryTree.containsNode(4));

        assertFalse(binaryTree.containsNode(1));
    }
}