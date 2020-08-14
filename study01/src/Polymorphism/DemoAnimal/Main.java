package Polymorphism.DemoAnimal;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

     //   animal.catchMouse;错误写法
        //向下转型
        Cat cat = (Cat) animal;
        cat.catchMouse();
    }

}
