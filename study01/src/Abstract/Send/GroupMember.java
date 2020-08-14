package Abstract.Send;

import java.util.ArrayList;
import java.util.Random;

public class GroupMember extends User{

    public GroupMember() {
    }

    public GroupMember(String name, int money) {
        super(name, money);
    }

    public void Receive(ArrayList<Integer> list){
        //产生随机数
        int index = new Random().nextInt(list.size());//随机数范围0 ~ 集合大小
        //根据索引，删除集合，得到红包并给自己
        int detal = list.remove(index);
        //获取余额
        int money = super.getMoney();
        //将红包金额添加到余额
        super.setMoney(detal + money);
    }
}
