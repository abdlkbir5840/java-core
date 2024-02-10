package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------- Lazy Singleton ----------------------");
        LazySingleton inst1 =  LazySingleton.getInstance();
        LazySingleton inst2 =  LazySingleton.getInstance();

        System.out.println(inst1.hashCode());
        inst1.printData();

        System.out.println(inst2.hashCode());
        inst2.printData();

        System.out.println("------------------------- Eager Singleton ----------------------");
        EagerSingleton inst3 =  EagerSingleton.getInstance();
        EagerSingleton inst4 =  EagerSingleton.getInstance();

        System.out.println(inst3.hashCode());
        inst3.printData();

        System.out.println(inst4.hashCode());
        inst4.printData();
        System.out.println("------------------------- Thraed Safe Singleton ----------------------");
        new DataPrinter().start();

        new DataPrinter().start();
    }
     static class  DataPrinter extends Thread{
        @Override
        public void run() {
            ThraedSafeSingleton.getInstance().printData();
        }
    }
}
