    // Node class for BST
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Binary Search Tree class
    class BinarySearchTree {
        // Root of BST
        Node root;

        // Constructor
        BinarySearchTree() {
            root = null;
        }

        // Method to insert a key in BST
        void insert(int key) {
            root = insertRec(root, key);
        }

        // A recursive function to insert a new key in BST
        Node insertRec(Node root, int key) {
            // If the tree is empty, return a new node
            if (root == null) {
                root = new Node(key);
                return root;
            }

            // Otherwise, recur down the tree
            if (key < root.key)
                root.left = insertRec(root.left, key);
            else if (key > root.key)
                root.right = insertRec(root.right, key);

            // return the (unchanged) node pointer
            return root;
        }

        // Method to find the smallest element in the BST
        Node findMinimum(Node root) {
            if (root == null || root.left == null)
                return root;
            return findMinimum(root.left);
        }

        // Method to display the BST inorder (left, root, right)
        void inorder() {
            inorderRec(root);
        }

        // A utility function to do inorder traversal of BST
        void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.key + " ");
                inorderRec(root.right);
            }
        }

        public static void main(String[] args) {
            BinarySearchTree tree = new BinarySearchTree();

            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);

            System.out.println("Inorder traversal of the BST:");
            tree.inorder();

            // Finding the smallest element
            Node min = tree.findMinimum(tree.root);
            System.out.println("\nSmallest element in the BST: " + min.key);
        }
    }

