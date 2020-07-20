package ArrayList;

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //add
        list.add("java");
        list.add("c++");
        list.add("python");
        boolean is = list.add("java");
        System.out.println(list);
        System.out.println(is);
        System.out.println("==================");

        //get
        String num = list.get(2);
        System.out.println(num);
        System.out.println(list.get(2));
        System.out.println("==================");

        //remove
        String n = list.remove(2);
        //System.out.println(list.remove(2));
        System.out.println(n);
        System.out.println(list);

        //size
        System.out.println(list.size());
    }
}
