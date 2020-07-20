package RandomClassTest.ObjectArray;


//创建一个数组，用来存放person类型的对象
public class Demo01Array {

    public static void main(String[] args) {

        Person[] array = new Person[3];
        System.out.println(array[1]);
//        System.out.println(array[1].getName());
        System.out.println("==============");
        Person one = new Person("小明",89);
        Person two = new Person("小花",8);
        Person three = new Person("小灰",9);
        //赋予地址值
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0].getName());
        System.out.println(array[1].getAge());
        System.out.println(array[2]);
        System.out.println(three);
    }
}
