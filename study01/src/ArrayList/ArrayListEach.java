package ArrayList;

import java.util.ArrayList;

//ArrayList的遍历
public class ArrayListEach {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("c#");
        list.add("c++");
        list.add("python");
        list.add("js");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
