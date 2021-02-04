package electronicsdevice;

class electronicsDeviceInfo {

    String DeviceMaker, DeviceBrand;
    int DeviceWeight, DeviceCost, DevicePower;

    electronicsDeviceInfo(String maker, String nbrand, int n1, int n2, int n3) {
        DeviceMaker = maker;
        DeviceBrand = nbrand;
        DeviceWeight = n1;
        DeviceCost = n2;
        DevicePower = n3;
    }

    void display() {
        System.out.println("Device manufucturer: " + DeviceMaker);
        System.out.println("Device brand: " + DeviceBrand);
        System.out.println("Device weight:" + DeviceWeight + " gm");
        System.out.println("Device cost  :" + DeviceCost + " Taka");
        System.out.println("Device power :" + DevicePower + " hours\n");
    }
}

public class ElectronicsDevice {

    public static void main(String[] args) {
        System.out.println("Computer view: ");
        computer asus = new computer("AsusTek Computer Inc.", "ASUS", 1225, 46499, 3);
        asus.display();
        computer dell = new computer("Compal Electronics Inc.", "DELL", 1025, 4300, 2);
        dell.display();
        System.out.println("\nCellphone view: ");
        cellphone samsung = new cellphone("Samsung Electronics Company Ltd.", "SAMSUNG", 156, 15499, 3);
        samsung.display();
        cellphone symphony = new cellphone("Walton Company Ltd.", "SYMPHONY", 180, 10890, 4);
        symphony.display();
    }

}
