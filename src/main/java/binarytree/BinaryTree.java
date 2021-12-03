package binarytree;

public class BinaryTree {

    Node root;


    public void add(int value){

        root = addRecursive(root,value);
    }
    public void delete(int value){

        root = deleteRecursive(root, value);
    }

    public boolean containsNode(int value){

        return containsNodeRecursive(root, value);
    }



    private Node addRecursive(Node current, int value){

        if (current == null){
            return new Node(value);
        }

        if (value < current.value){
            current.left = addRecursive(current.left, value);
        } else if (value > current.value){
            current.right = addRecursive(current.right, value);
        } else return current;

        return current;
    }

    
    private boolean containsNodeRecursive(Node current, int value){

        if (current == null){
            return false;
        }
        if (value == current.value){
            return true;
        }

        return value < current.value ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    private Node deleteRecursive(Node current, int value){
        if (current == null){
            return null;
        }

        if (value == current.value){

            if(current.left == null && current.right == null){
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;

        }

        if (value < current.value){
            current.left = deleteRecursive(current.left,value);
        }else current.right = deleteRecursive(current.right, value);

        return current;
    }


    private int findSmallestValue(Node root){

        return root.left == null ? root.value : findSmallestValue(root.left);
    }
}