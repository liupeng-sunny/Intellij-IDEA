package RandomClassTest;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

    public static void main(String[] args) {
        Random num = new Random();
        int gessNum = num.nextInt(100) + 1;
        System.out.println(gessNum);
        Scanner cn = new Scanner(System.in);
        boolean correct = false;
        while(correct == false){
            int anwser = cn.nextInt();
            if(anwser > gessNum){
                System.out.println("It is too bigger!");
                correct = false;
            }
            if(anwser < gessNum){
                System.out.println("It is too smaller!");
                correct = false;
            }
            if (anwser == gessNum){
                System.out.println("CongratulationS ! It is correct");
                correct = true;
            }
        }
    }
}
