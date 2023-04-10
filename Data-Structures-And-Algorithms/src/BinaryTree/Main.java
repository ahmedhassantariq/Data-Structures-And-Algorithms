package BinaryTree;

public class Main {
    public static void main(String[] args) {
        int values[] = {8, 9, 2, 16, 14, 10, 11, 12};

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = BinarySearchTree.insert(root, values[i]);
        }

        BinarySearchTree.inOrder(root);
        System.out.println();
        BinarySearchTree.preOrder(root);
        System.out.println();
        BinarySearchTree.postOrder(root);
        System.out.println();
        System.out.println(BinarySearchTree.hasRight(root));
       BinarySearchTree.delete(root,9);
        System.out.println();
       BinarySearchTree.inOrder(root);
    }
}
