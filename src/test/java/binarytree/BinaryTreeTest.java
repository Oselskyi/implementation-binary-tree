package binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void add() {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(6);
        binaryTree.add(9);
        binaryTree.add(7);

        assertFalse(binaryTree.containsNode(3));
        binaryTree.add(3);
        assertTrue(binaryTree.containsNode(3));

    }

    @Test
    void delete() {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(6);
        binaryTree.add(9);
        binaryTree.add(7);

        assertTrue(binaryTree.containsNode(9));
        binaryTree.delete(9);
        assertFalse(binaryTree.containsNode(9));

    }

    @Test
    void containsNode() {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(7);

        assertTrue(binaryTree.containsNode(6));
        assertTrue(binaryTree.containsNode(4));


    }
    @Test
    void isNotContainsNode() {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(7);

        assertFalse(binaryTree.containsNode(1));
    }

}