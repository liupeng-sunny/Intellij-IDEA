package Interface.Demo2;


//接口默认方法的定义及使用

public interface MyInterfaceDefault {

    public abstract void methodA();

    //public abstract void methodB();

    public default void methodC(){
        System.out.println("这是默认方法！");
    }

}
