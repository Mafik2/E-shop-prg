package com.company;

public class Main {


    public static void main(String[] args) {
        Product iphone13 = new Product("Iphone 13", "Mobilní telefon - 5,4\" OLED 2340 × 1080, procesor Apple A15 Bionic 6jádrový, RAM 4 GB, interní paměť 512 GB, zadní fotoaparát 12 Mpx (f/1,6) + 12 Mpx (f/2,4), přední fotoaparát 12 Mpx, optická stabilizace, GPS, Glonass, NFC, LTE, 5G, Lightning port, voděodolný dle IP68, single SIM + eSIM, neblokovaný, rychlé nabíjení 20W, bezdrátové nabíjení 15W, iOS 15", 24000);
        Product iphone12 = new Product("Iphone 12", "Mobilní telefon - 6,1\" OLED 2532 × 1170, procesor Apple A14 Bionic 6jádrový, interní paměť 64 GB, zadní fotoaparát 12 Mpx (f/1,6) + 12 Mpx (f/2,4), přední fotoaparát 12 Mpx, optická stabilizace, GPS, Glonass, NFC, LTE, 5G, Lightning port, voděodolný dle IP68, single SIM + eSIM, neblokovaný, rychlé nabíjení 20W, bezdrátové nabíjení 15W, baterie 2815 mAh, iOS 14", 20000);

        Shop czc = new Shop("CZC");
        czc.addProduct(iphone12);
        czc.addProduct(iphone13);

        System.out.println(czc.saleProduct());
    }
}

