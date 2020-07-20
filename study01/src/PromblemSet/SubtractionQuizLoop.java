package PromblemSet;

import java.util.Scanner;

public class SubtractionQuizLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            int a = (int)(1 + Math.random() * 15);
            int b = (int)(1 + Math.random() * 15);
            System.out.print(a + " + " + b + " = ");
            int anwser = input.nextInt();
            if (anwser == a + b){
                System.out.println("you anwser is correct!");
                count++;
            }else{
                System.out.println("you anwser is error!");
            }
        }
        System.out.println("The number of correct anwser is " + count);
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("you test time is " + testTime + "ms");

    }

   // public static void
}
