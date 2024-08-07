public class TowerOfHanoi {
    public static void main(String[] args) {
        int size=5;
        int[] src = new int[size+1];//sorce
        int[] temp = new int[size+1];//temparory
        int[] des = new int[size+1];//destination
        
        int s_top,t_top,d_top;
        src[0] = des[0] = temp[0] = Integer.MAX_VALUE;
        for(s_top = 1;s_top <=size;s_top++){
            src[s_top] = size -s_top +1;
            des[s_top] = -1;
            temp[s_top] = -1;
        }
        for(s_top=size;s_top >=0;s_top--){
            System.out.printf("%8d %8d %8d\n");
        }

        s_top=size;
        d_top=t_top=0;

        if(src[s_top] < des[d_top]){
            d_top++;
            des[d_top] = src[s_top];
            src[s_top]  =-1;
            s_top -=1;
        }
    }
}

