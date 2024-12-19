public class SelectionSorting {
    public static void main(String[] args) {
        int n[]= {1,2,3,4,5};
        int count=0;
        for(int i=1;i<n.length;i++){
            if(n[i] > n[i-1]){
                continue;
            }
            else{
                int k=i;
                while ( k > 0 && n[k] < n[k-1]) {
                    int temp =n[k];
                    n[k]= n[k-1];
                    n[k-1] = temp;
                    k--;
                    count++;
                }
                
            }
        }

        for(int num:n){
            System.out.print(num+" ");
        }
        System.out.println(count);
    }
}
