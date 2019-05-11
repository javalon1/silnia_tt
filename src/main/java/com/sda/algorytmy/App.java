package com.sda.algorytmy;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args)
    {
    /*    int silnia = 5;
        int wynik = 1;
        for (int i=1; i<=silnia; i++){
            wynik = wynik * i;
        }
        System.out.println(wynik);
        */
        int b=6;
        System.out.println(silnia(b));

    }
    public static int silnia(int a){
        if (a<=1){
            return 1;
        }
        else {
            return a*silnia(a-1);
        }
    }

}
