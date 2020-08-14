package Abstract.Demo03;

public class Main {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.eat();
        dog1.sleep();
        System.out.println("===============");
        Dog2 dog2 = new Dog2();
        dog2.eat();
        dog2.sleep();
    }
}
