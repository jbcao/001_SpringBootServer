package com.src.practise.oob_spi;

import java.util.ServiceLoader;

public class PrintServiceImpl implements PrintService {
    @Override
    public void printInfo() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        ServiceLoader<PrintService> serviceLoader = ServiceLoader.load(PrintService.class);
        for (PrintService printService : serviceLoader) {
            printService.printInfo();
        }
    }
}
