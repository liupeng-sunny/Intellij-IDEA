package Polymorphism.USBTest;

public class Laptop {

    public void powerOn() {
        System.out.println("笔记本开机！");
    }

    public void powerOff() {
        System.out.println("笔记本关机！");
    }

    public void useDevice(USB usb) {
        usb.openDevice();
        //用instanceof判断usb设备的类型
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.cin();
        }
        usb.closeDevice();
    }
}
