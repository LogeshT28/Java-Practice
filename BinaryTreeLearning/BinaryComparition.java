import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode right;
    TreeNode left;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryComparition {
    TreeNode root = null;

    void createTree(int data) {
        TreeNode newnode = new TreeNode(data);
        if (root == null) {
            root = newnode;
        } else {
            TreeNode tptr = null;
            TreeNode temp = null;
            for (tptr = root; tptr != null; temp = tptr, tptr = (data > tptr.data) ? tptr.right : tptr.left)
                ;
            if (temp.data > data)
                temp.left = newnode;
            else
                temp.right = newnode;
        }
    }

    void inorder(TreeNode tptr) {
        if (tptr != null) {
            inorder(tptr.left);
            System.out.print(tptr.data + " ");
            inorder(tptr.right);
        }
    }

    void display() {
        inorder(root);
        System.out.println();
    }

    boolean isSameTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;

        return (t1.data == t2.data) && isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
    }

    boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;

        if (isSameTree(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryComparition tree1 = new BinaryComparition();
        BinaryComparition tree2 = new BinaryComparition();

        System.out.println("Enter elements for tree1, end with -1:");
        while (true) {
            int n = s.nextInt();
            if (n == -1) break;
            tree1.createTree(n);
        }

        System.out.println("Enter elements for tree2, end with -1:");
        while (true) {
            int n = s.nextInt();
            if (n == -1) break;
            tree2.createTree(n);
        }

        tree1.display();
        tree2.display();

        if (tree1.isSubtree(tree1.root, tree2.root)) {
            System.out.println("Tree2 is a subtree of Tree1");
        } else {
            System.out.println("Tree2 is not a subtree of Tree1");
        }
    }
}
