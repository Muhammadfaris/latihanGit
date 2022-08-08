package org.example;

public class Kalkulator {

    private double angka1;
    private double angka2;
    private double hasil;

    public Kalkulator(double angka1,double angka2){
        this.angka1=angka1;
        this.angka2=angka2;
//        this.hasil=hasil;
    }

    // kapan pakai this kapan atae enggga
    // di usahakan dalam suatu method baru jangan ada nama yang sama dengan yang ada varibale global kelas
    //
    public double getHasilPerkalian(){
        return this.angka1*this.angka2;
    }

    public double getHasilPembagian(){
        return this.angka1/this.angka2;
    }
}
