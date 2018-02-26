/*
Word, original problem: http://codeforces.com/problemset/problem/59/A
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int length = word.length();
        String newWord = "";
        int upper = 0;
        int lower = 0;

        for(char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper++;
                if (upper > (length / 2.0)) {
                    newWord = word.toUpperCase();
                    break;
                }
            }
                 else{
                    lower++;
                    if (lower >= (length / 2.0)) {
                        newWord = word.toLowerCase();
                        break;
                    }

                }


        }

        System.out.println(newWord);


    }
}
