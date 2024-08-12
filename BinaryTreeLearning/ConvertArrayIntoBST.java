class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right=null;
    }
}
public class ConvertArrayIntoBST{
    TreeNode root;
    ConvertArrayIntoBST(){
        this.root = null;
    }

    public static TreeNode SortArray(int[] arr){

        if(arr.length ==0){
            return null;
        }

        return convertBST(arr,0,arr.length-1);
    }
    public static  TreeNode convertBST(int arr[],int start,int end){

        if(start > end){
            return null;
        }

        int mid = start + (end - start) /2;
        TreeNode root = new TreeNode(arr[mid]);

        root.left = convertBST(arr,start,mid-1);
        root.right = convertBST(arr,mid+1,end);

        return root;

    }
    public static void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
       ConvertArrayIntoBST tree = new ConvertArrayIntoBST();
    //    tree.root =  
    int arr[] ={1, 2, 3, 4, 5, 6, 7};
    tree.root = SortArray(arr);
    System.out.println("InOrder Traversal :");
    inOrderTraversal(tree.root);

    }
}
