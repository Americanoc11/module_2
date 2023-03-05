package ss13_algorithm.bai_tap.find_maxString;

import java.util.*;

public class FindMaxStringOfLength {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string");
        String str=input.nextLine();
        LinkedList<Character> max= new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list= new LinkedList<>();
            list.add( str.charAt(i));
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if (max.size()<list.size()){
                max.clear();
                max.addAll(list);
            }
        }
        System.out.println(max);
    }
}
