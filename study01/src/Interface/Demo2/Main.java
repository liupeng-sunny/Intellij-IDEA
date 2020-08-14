package Interface.Demo2;

public class Main {

    public static void main(String[] args) {
        Default1 a = new Default1();
        a.methodA();

        a.methodC();//默认方法会被实现类继承
    }

}
