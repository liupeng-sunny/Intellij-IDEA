package Interface.Demo04;


//接口私有静态方法的定义及使用
public interface MyInterfacePrivateStatic {

    public static void methodAbs1(){
        System.out.println("这是默认方法一");
        methodAbs3();
        //方法调用
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
    }

    public static void methodAbs2(){
        System.out.println("这是默认方法二");
        methodAbs3();
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
    }

    private static void methodAbs3(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
