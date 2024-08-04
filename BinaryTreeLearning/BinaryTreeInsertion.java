
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class BinaryTreeInsertion {
    Node root;
    BinaryTreeInsertion(){
        this.root=null;
    }
    public static Node insertTree(Node root,int data){

        // Node root;
        if(root==null){
        root = new Node(data);
        }
        else if(data < root.data){
            root.left = insertTree(root.left,data);
        }
        else{
            root.right = insertTree(root.right, data);
        }
        return root;
    }
    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    public void preOrderTraversal(Node root){
        if(root !=null){
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    public void postOrderTraversal(Node root){
        if(root !=null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        BinaryTreeInsertion tree = new BinaryTreeInsertion();
        tree.root = tree.insertTree(tree.root, 8);
        tree.root = tree.insertTree(tree.root, 7);
        tree.root = tree.insertTree(tree.root, 12);
        tree.root = tree.insertTree(tree.root, 15);
        tree.root = tree.insertTree(tree.root, 2);
        tree.root = tree.insertTree(tree.root, 5);

        System.out.print("In-order Traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.print("Pre-order Traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.print("Post-order Traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();
    }
}
