package Extends.this关键字;

public class Zi extends Fu {

    int num = 20;

    public void showNum(){
        int num = 29;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
