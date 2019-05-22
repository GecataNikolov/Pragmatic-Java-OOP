package Classes;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    double freeMemory;
    String operationSystem;

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
