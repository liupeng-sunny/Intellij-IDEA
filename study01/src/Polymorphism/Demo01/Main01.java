package Polymorphism.Demo01;

public class Main01 {

    public static void main(String[] args) {

        Fu hui = new Zi();
        hui.method();//new谁就用谁
        hui.methodFu();
        System.out.println("===============");

        System.out.println(hui.num);
        Fu hu = new Zi();
        hu.Print();//子类方法覆盖重写
        Zi hi = new Zi();
        hi.Print();


        System.out.println("===============");

    }

}
