package cn.liu.study.Demo1;

import java.util.Scanner;

public class Anonymous1 {

    public static void main(String[] args) {
        //普通方式
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();

//        //匿名对象方式,这里的匿名对象相当于input
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);
//
//        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象进行传参
        methodParam(new Scanner(System.in));

        //使用匿名对象作为返回值
        Scanner ds = methodReturn();
        int num = ds.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static void methodParam(Scanner cn){
        int num = cn.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn(){
//        Scanner df = new Scanner(System.in);
//        return df;
        return new Scanner(System.in);
    }
}
