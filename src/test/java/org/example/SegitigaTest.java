package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SegitigaTest {

    // ini namanya anotasi test, syarat untuk menjalankan kelas yang mau di test
//    @Test
    public void testLuasSegitiga(){

        // jangan menulis rumus di kelas test, tetapi buat class tersendiri di packaage main
//        int alas = 10;
//        int tinggi = 8;
//        int luas = alas*tinggi/2;
//
//        // katalon : verfy element text
//        // di java : assert (fungsi assertion/verify)
//        // yang sering di pakai adalah : assert equals dan true
//        Assert.assertEquals(40,luas); //true test case
////        Assert.assertEquals(30,luas); //failed test case
//
        Segitiga segitiga = new Segitiga(10,8);
        double luas = segitiga.getLuas();
        double expected = 40;
        Assert.assertEquals(expected,luas,0);// delta dibutuhkan untuk mengekpresikan si komanya, karena ini hasilnya double, kalau ada komanya tinggal tambahin aja deltanya 2 atau 3 jadi ada berapa banyak koma di belakang nol

    }

}
