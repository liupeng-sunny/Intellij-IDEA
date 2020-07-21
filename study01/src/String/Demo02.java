package String;

public class Demo02 {

    public static void main(String[] args) {
        String str1 = "Hellow";
        String str2 = "Hellow";
        char[] charArray = {'H', 'e', 'l', 'l', 'o', 'w'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println("Hellow".equals(str1));
        System.out.println("Hellow".equals(str3));
        System.out.println("================");

        String str4 = "abc";
        System.out.println("abc".equals(str4));
        System.out.println(str4.equals("abc"));
        System.out.println("================");

        String str5 = null;
        System.out.println("abc".equals(str5));
        //System.out.println(str5.equals("abc"));//显示NullPointerException错误（空指针异常）
        System.out.println("================");

        //equalIgnoreCase方法
        String str6 = "java";
        String str7 = "Java";
        System.out.println(str6.equals(str7));
        System.out.println(str6.equalsIgnoreCase(str7));
    }
}
