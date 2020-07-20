package ArrayList;

import java.util.ArrayList;

//自定义4个学生对象,添加到集合,并遍历
public class ArrayListDemo02 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //Student stu = new Student();
        Student one = new Student("张三",19);
        Student two = new Student("李四",21);
        Student three = new Student("王五",43);
        list.add(one);
        list.add(two);
        list.add(three);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.print("name is: " + stu.getName());
            System.out.print("         ");
            System.out.println("age is: " + stu.getAge());
        }

    }
}
