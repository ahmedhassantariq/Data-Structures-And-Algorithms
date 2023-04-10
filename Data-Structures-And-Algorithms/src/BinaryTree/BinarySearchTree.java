package BinaryTree;

public class BinarySearchTree {

    public static Node insert(Node root, int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(root.data>value){
            root.left = insert(root.left,value);
        } else {
            root.right = insert(root.right,value);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static boolean search(Node root, int key){
        if (root==null){
            return false;
        }
        if(root.data > key){
            return search(root.left,key);
        } else if (root.data==key) {
            return true;
        } else {
            return search(root.right,key);
        }
    }


    public static Node delete(Node root, int key){
        if(root==null){
            return null;
        }
        if (root.data>key){
           root.left = delete(root.left,key);
        } else if (root.data<key) {
            root.right = delete(root.right,key);
        } else {
            //Case 1--No Child
            if(root.left==null&&root.right==null){
                return null;
            }
            //Case 2--One Child
            if(root.left==null){
                return root.right;
            } else if(root.right==null){
                return root.left;
            }
            //Case 3-- Both Children
            Node iS = inOrderSuccessor(root.right);
            root.data = iS.data;
            root.right = delete(root.right,iS.data);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node root){
        while (root.left!=null){
            root = root.left;
        }
        return root;
    }

    public static boolean hasLeft(Node root){
        if(root == null){
            return false;
        }
        if(root.left!=null){
         return true;
        } else {
            return false;
        }
    }

    public static boolean hasRight(Node root){
        if(root == null){
            return false;
        }
        if(root.right!=null){
            return true;
        } else {
            return false;
        }
    }
    public static Node right(Node root){
        if(root == null){
            return null;
        }
        if (root.right!=null){
            return root.left;
        } else {
            return null;
        }
    }
    public static Node left(Node root){
        if(root == null){
            return null;
        }
        if (root.left!=null){
            return root.left;
        } else {
            return null;
        }
    }

}
