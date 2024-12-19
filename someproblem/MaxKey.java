public class MaxKey {

    public static boolean Check(char s){
        return s=='a' || s=='b' ||s== 'e' || s=='f'|| s=='g'; 
    }
    public static void main(String[] args) {
        String str = "abcdefg";
        String key = "abefg";
        int ke=3;
        int max =Integer.MIN_VALUE;
        for(int i=1;i<=str.length()-ke;i++){
            int count=0;
            for(int j=i;j<i+ke;j++){
                // String res = "";
                // res +=str.charAt(j);
                // System.out.print(res);
                // for(int k=0;k<res.length();k++){
                //     if(Check(res.charAt(k))){
                //         count++;
                //     }
                // }
                if(Check(str.charAt(j))){
                            count++;
                        }
                max = Math.max(count,max);    
            }
        }
        System.out.println(max);
    }
}
