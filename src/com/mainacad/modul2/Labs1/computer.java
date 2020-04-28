
package com.mainacad.modul2.Labs1;

public class computer {

    public static void main(String[] args) {
        computer[] computers = new computer[5];
        for (int i = 0; i < 5; i++) {

            computers[i] = new computer();
            computers[i].setManufacturer("Dell");
            computers[i].setSerialNumber((int) (Math.random() * 100));
            computers[i].setPrice((float)(Math.round(Math.random() * 100000))/100);
            computers[i].setQuantityCPU((int) (Math.random() * 200));
            computers[i].setFrequencyCPU((int) (Math.random() * 300));
        }

//        for (Computer pc : computers) {
//            pc.view();
//            System.out.println();
//        }

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].toString());
        }

    }

    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public void view() {
        System.out.println("Manufacture is " + getManufacturer());
        System.out.println("Serial number is " + getSerialNumber());
        System.out.println("Price is " + getPrice());
        System.out.println("QCPU is " + getQuantityCPU());
        System.out.println("FCPU is " + getFrequencyCPU());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Manufacture is " + manufacturer +
                "\nSerial number is " + serialNumber +
                "\nPrice is " + price +
                "\nQCPU is " + quantityCPU +
                "\nFCPU is " + frequencyCPU + "\n";
    }
}