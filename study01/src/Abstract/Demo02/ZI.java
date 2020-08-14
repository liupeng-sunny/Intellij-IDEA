package Abstract.Demo02;

public class ZI extends Fu {

    public ZI(){
        System.out.println("子类构造方法执行！");
    }

    @Override
    public void eat() {
        System.out.println("吃饭！");
    }
}
