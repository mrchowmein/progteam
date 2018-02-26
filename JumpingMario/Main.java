/*
Jumping Mario: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2864
*/

import java.util.Scanner;

public class Main {

    public static void main(String [] args){


        Scanner sc = new Scanner(System.in);
        //System.out.println("number of test cases");
        int testCase = sc.nextInt();
        int caseCounter = 0;

        while(testCase > 0){
            caseCounter++;
            int highJump = 0;
            int lowJump = 0;
            //System.out.println("Number of Walls");
            int walls = sc.nextInt();
            int [] wallArray = new int[walls];

            for(int i = 0; i < walls; i++){
                //System.out.println("Wall Height");
                int wallHeight = sc.nextInt();
                wallArray[i] = wallHeight;
            }

            for(int i = 1; i < walls; i++) {
                if (wallArray[i] - wallArray[i - 1] > 0) {
                    highJump++;
                }
                if (wallArray[i] - wallArray[i - 1] < 0) {
                    lowJump++;
                }
            }

            System.out.println("Case " + caseCounter + ": " + highJump + " " + lowJump);
            testCase--;

        }

    }
}
