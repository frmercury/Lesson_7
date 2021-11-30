package com.company.PCBuilder;

public class CompConfig {

    private String cpu;
    private int ram;
    private String gpu;
    private int SSD;

    public CompConfig(String cpu, int ram, String gpu, int SSD) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.SSD = SSD;
    }

    public String toString (){
        return ("Congratulation, You've bought a computer with next parameters: \n" + "CPU: " + cpu + "\n" + "RAM: " + ram + "\n" + "GPU: " + gpu + "\n" + "SSD: " + SSD);
    }
}

