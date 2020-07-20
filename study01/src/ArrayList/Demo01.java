package ArrayList;

import java.util.ArrayList;
import RandomClassTest.ObjectArray.Person;

public class Demo01 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println("==============");

        list.add("java is very instresting!");
        System.out.println(list);
        System.out.println("==============");

        list.add("Are you ok?");
        System.out.println(list);
        System.out.println("==============");
    }
}
