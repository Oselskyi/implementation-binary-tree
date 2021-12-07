package binarytree;

import java.util.stream.Stream;

public class BinaryTree<T extends Comparable> {

    Node<T> root;


    public static <T extends Comparable> BinaryTree<T> of(T... elements){

        BinaryTree<T> binaryTree = new BinaryTree<>();
        Stream.of(elements).forEach(binaryTree::add);
        return binaryTree;
    }

    public void add(T value){

        root = addRecursive(root, value);
    }

    public void delete(T value){

        root = deleteRecursive(root, value);
    }

    public boolean containsNode(T value){

        return containsNodeRecursive(root, value);
    }



    private Node<T> addRecursive(Node<T> current, T value){

        if (current == null){
            return new Node<T>(value);
        }

        if (current.value.compareTo(value) > 0){
            current.left = addRecursive(current.left, value);
        } else if (current.value.compareTo(value) < 0){
            current.right = addRecursive(current.right, value);
        } else return current;

        return current;
    }


    private boolean containsNodeRecursive(Node<T> current, T value){

        if (current == null){
            return false;
        }
        if (current.value.equals(value)){
            return true;
        }

        return current.value.compareTo(value) > 0 ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    private Node<T> deleteRecursive(Node<T> current, T value){
        if (current == null){
            return null;
        }

        if (current.value.compareTo(value) == 0){

            if(current.left == null && current.right == null){
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            T smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;

        }

        if (current.value.compareTo(value) > 0){
            current.left = deleteRecursive(current.left,value);
        }else current.right = deleteRecursive(current.right, value);

        return current;
    }


    private T findSmallestValue(Node<T> root){

        return root.left == null ?  root.value : findSmallestValue(root.left);
    }
}
