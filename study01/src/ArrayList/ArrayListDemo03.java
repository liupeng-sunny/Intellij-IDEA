package ArrayList;


import java.util.ArrayList;

//定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
// 格式参照 {元素 @元素@元素}。
public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("c#");
        list1.add("c++");
        list1.add("python");
        list1.add("js");
        printArrayList(list1);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i != list.size() - 1){
                System.out.print("@");
            }
        }
        System.out.print("}");
    }
}
