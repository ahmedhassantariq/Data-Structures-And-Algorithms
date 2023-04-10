package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private static int index = -1;


    public static Node buildTree(int nodes[]){
        index++;
        if(nodes[index]==-1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void lvlOrderTraverse(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes+rightNodes+1;
    }

    public static int sumNodes(Node root){
        if(root==null){
            return 0;
        }
        int sumLeft = sumNodes(root.left);
        int sumRight = sumNodes(root.right);

        return sumLeft+sumRight+ root.data;
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int height = Math.max(leftHeight,rightHeight) + 1;

        return height;
    }

    public static int diameter(Node root){
        if (root==null){
            return 0;
        }
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = height(root.left)+height(root.right)+1;
        return Math.max(diameter3,Math.max(diameter1,diameter2));
    }
}
