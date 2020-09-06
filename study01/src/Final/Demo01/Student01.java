package Final.Demo01;

public class Student01 {

    public static void main(String[] args) {
        Student student = new Student("阳阳");
        final int age = 20;

        //输出student的地址值
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println("=================");

        student.setName("小星");
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println("=================");

        student = new Student("小王！");
        System.out.println(student);
        System.out.println("=================");

        final Student student1 = new Student("向阳");
        System.out.println(student1.getName());


    }

}
