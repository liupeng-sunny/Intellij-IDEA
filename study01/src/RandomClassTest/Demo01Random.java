package RandomClassTest;

import java.util.Random;
//产生n~n之间的随机数

public class Demo01Random {
    public static void main(String[] args) {
        Random num = new Random();
        int n = 9;
        for (int i = 0; i < 100; i++) {
            int a = num.nextInt(n)+ 1;
            System.out.println(a);
        }
    }


}
