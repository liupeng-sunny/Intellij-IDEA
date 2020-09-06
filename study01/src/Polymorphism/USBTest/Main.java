package Polymorphism.USBTest;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();//电脑开机
        //创建一个鼠标对象（多态）
        USB usbMouse = new Mouse();//向上转型
        laptop.useDevice(usbMouse);
        USB usbKeyboard = new Keyboard();
        laptop.useDevice(usbKeyboard);

//        //判断USB设备的种类
//        if(usbMouse instanceof Mouse){
//            Mouse mouse = (Mouse) usbMouse;
//            mouse.openDevice();
//        }
//        if (usbMouse instanceof Keyboard){
//            Keyboard keyboard = (Keyboard) usbMouse;
//            keyboard.openDevice();
//        }

        laptop.powerOff();

    }

}
