package Interface.Demo04;

public class Main implements MyInterfacePrivateStatic{

    public static void main(String[] args) {
        MyInterfacePrivateStatic.methodAbs1();
        MyInterfacePrivateStatic.methodAbs2();
        //不可调用私有方法
        //MyInterfacePrivateStatic.methodAbs3();
    }

}
