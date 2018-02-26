/*
Helpful Math: http://codeforces.com/problemset/problem/339/A
*/

import java.util.Scanner;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        String formula = sc.nextLine();
        char[] charArray = formula.toCharArray();
        ArrayList newArray = new ArrayList();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '+') {
                newArray.add(charArray[i]);
            }

        }

        Collections.sort(newArray);

        String newEquation = "";
        for (int i = 0; i< newArray.size(); i++){
            if(i < newArray.size()-1) {
                newEquation += newArray.get(i) + "+";
            } else {
                newEquation += newArray.get(i);
            }
        }

        System.out.println(newEquation);
        



    }


}
