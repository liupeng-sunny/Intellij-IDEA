package ArrayList;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)
public class ArrayListDemo04 {

    public static void main(String[] args) {
        Random num = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int n = 6;
        for (int i = 0; i < n; i++) {
            list.add(num.nextInt(1000) + 1);
            //System.out.print(list.get(i));
        }
        System.out.println(list);
        ArrayList<Integer> sList = getSmallList(list);
        System.out.println(sList);

    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> lise){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < lise.size(); i++) {
            if(lise.get(i) % 2 == 0){
                smallList.add(lise.get(i));
            }
        }
        return smallList;
    }
}
