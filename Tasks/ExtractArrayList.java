package Tasks;

import java.util.*;
public class ExtractArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");

        System.out.println("Enter Start And End Portion for Extracted portion"); 
        int start =s.nextInt();
        int end= s.nextInt();
        List<String> subList = list.subList(start, end);

        System.out.println("Original ArrayList: " + list);

        System.out.println("Extracted portion: " + subList);       
    }
}
