package Interface.Demo04;


//接口私有方法的定义及使用
public interface MyInterfacePrivate {

    public default void methodAbs1(){
        System.out.println("这是默认方法一");
        methodAbs3();
        //方法调用
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
    }

    public default void methodAbs2(){
        System.out.println("这是默认方法二");
        methodAbs3();
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
    }

    private void methodAbs3(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
