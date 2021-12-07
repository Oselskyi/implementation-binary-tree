package binarytree;

public class Node<T extends Comparable> {

    T value;
    Node<T> right, left;

    public Node(T value) {
        this.value = value;
        right = null;
        left = null;
    }

}
