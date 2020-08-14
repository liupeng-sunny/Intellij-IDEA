package Abstract.Send;

import java.util.ArrayList;

public class Mananger extends User{

    public Mananger(){

    }

    public Mananger(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney , int count){//红包总金额及数量
        //用来存储红包数量及金额+
        ArrayList<Integer> relist = new ArrayList<>();
        //群主余额
        int leftMoney = super.getMoney();
        //红包总金额与余额比较
        if(leftMoney < totalMoney){
            System.out.println("余额不足，请充值！");
            return  relist;
        }

        //重新设置余额
        super.setMoney(leftMoney - totalMoney);
        //红包部署
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            relist.add(avg);
        }
        int last = avg + mod;
        relist.add(last);
        return relist;

    }
}
