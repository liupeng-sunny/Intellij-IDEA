package ArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//生成n个1~33之间的随机整数，添加到集合，并遍历
public class ArrayListDemo01 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        for (int i = 0; i < num ; i++) {
            int j  = random.nextInt(33) + 1;
            list.add(j);
            System.out.println(list.get(i));
        }
        System.out.println("================");
        System.out.println(list.get(3));
    }
}
