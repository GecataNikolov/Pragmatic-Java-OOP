package Classes;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    double freeMemory;
    String operationSystem;

    public Computer() {
        isNotebook = false;
        operationSystem = "Win XP";
    }

    public Computer(int year, double price, int hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    public Computer(int year, double price, boolean isNotebook, int hardDiskMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    int comparePrice(Computer comp){
        if (this.price == comp.price) {
            return 0;
        }
        if(this.price > comp.price){
            return -1;
        }
        else {
            return 1;
        }
    }

    void changeOperationSystem(String newOperationSystem){
        operationSystem = newOperationSystem;
    }

    void useMemory(double usedMemory){
        if(usedMemory > freeMemory){
            System.out.println("Not enough free memory");
        }
        else {
            freeMemory -= usedMemory;
        }
    }
}
