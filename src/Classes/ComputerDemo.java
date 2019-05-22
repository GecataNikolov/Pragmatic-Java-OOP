package Classes;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer laptop= new Computer();
        Computer pc= new Computer();

        laptop.freeMemory = 200;
        laptop.operationSystem = "Windows";
        laptop.hardDiskMemory = 500;
        laptop.price = 1000;
        laptop.isNotebook = true;
        laptop.year= 2019;


        pc.freeMemory = 500;
        pc.operationSystem= "Linux";
        pc.hardDiskMemory = 1000;
        pc.freeMemory = 500;
        pc.isNotebook = false;
        pc.price = 800;

        pc.useMemory(100);
        laptop.changeOperationSystem("Ubuntu");

        System.out.println("List of my PC specs:");
        System.out.println(pc.operationSystem);
        System.out.println(pc.freeMemory);
        System.out.println(pc.hardDiskMemory);
        System.out.println(pc.isNotebook);
        System.out.println(pc.price);
        System.out.println(pc.year);


        System.out.println("List of my laptop specs:");
        System.out.println(laptop.operationSystem);
        System.out.println(laptop.freeMemory);
        System.out.println(laptop.hardDiskMemory);
        System.out.println(laptop.isNotebook);
        System.out.println(laptop.price);
        System.out.println(laptop.year);



    }
}
