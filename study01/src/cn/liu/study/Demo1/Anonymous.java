package cn.liu.study.Demo1;

public class Anonymous {

    public static void main(String[] args) {
        Person one = new Person();
        one.name = "杰克逊";
        one.sayHellow();
        System.out.println("=============");

        new Person().name = "艾丽";
        //sayHellow();
        new Person().sayHellow();

    }
}
