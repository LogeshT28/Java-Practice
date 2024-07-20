class StockPrice{
    public static void FindProfit(int[] a){
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i] < min){
                min = a[i];
            }
            else{
                int profit  = a[i]- min;
                if(profit > max){
                    max = profit;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int a[]={7, 1, 5, 3, 6, 4};
        int b[]={7, 6, 4, 3, 1};
        int c[]={1, 2, 3, 4, 5};
        int d[]={2, 4, 1};
        int e[]={3, 3, 3, 3, 3};
        FindProfit(a);
        FindProfit(b);        
        FindProfit(c);
        FindProfit(d);
        FindProfit(e);

    }
}