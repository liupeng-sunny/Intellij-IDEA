package RandomClassTest;

import java.util.Random;

public class Demo1Random {

    public static void main(String[] args) {
        Random num = new Random();
        int a = num.nextInt();
        System.out.println("产生的随机数是：" + a);
        int b = num.nextInt(5);
        System.out.println("产生的随机数是：" + b);
        for (int i = 0; i < 100; i++) {
            int c = num.nextInt(10);
            System.out.print(c + " ");
        }
    }
}
