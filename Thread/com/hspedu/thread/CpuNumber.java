package com.hspedu.thread;

public class CpuNumber {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNumbers = runtime.availableProcessors();
        System.out.println(cpuNumbers);

    }

}
