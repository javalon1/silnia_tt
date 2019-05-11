package com.sda.algorytmy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    /*    int silnia = 5;
        int wynik = 1;
        for (int i=1; i<=silnia; i++){
            wynik = wynik * i;
        }
        System.out.println(wynik);
        */
        int b = 4;
        System.out.println(silnia(b));
        System.out.println(ciag(b));
        System.out.println(ciag2(b));
    }

    public static int silnia(int a) {
        if (a <= 1) {
            return 1;
        } else {
            return a * silnia(a - 1);
        }
    }

    public static double ciag(int a) {
        if (a == 1) {
            return 1;
        } else if (a == 2) {
            return 0.5;
        } else {
            return -ciag(a - 1) * ciag(a - 2);
        }
    }

    public static int ciag2 (int a){
        if (a==1){
            return -1;
        }
        else {
            return -ciag2(a-1)*a-3;
        }
    }

}
