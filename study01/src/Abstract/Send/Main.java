package Abstract.Send;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Mananger mananger = new Mananger("群主", 200);

        GroupMember one = new GroupMember("一号" , 20);
        GroupMember two = new GroupMember("二号" , 10);
        GroupMember three = new GroupMember("三号" , 30);

        mananger.Show();
        one.Show();
        two.Show();
        three.Show();
        System.out.println("==================");

        ArrayList<Integer> list = new ArrayList<>();
        list = mananger.send(100 , 3);
        one.Receive(list);
        two.Receive(list);
        three.Receive(list);

        mananger.Show();
        one.Show();
        two.Show();
        three.Show();
        System.out.println("==================");

    }

}
