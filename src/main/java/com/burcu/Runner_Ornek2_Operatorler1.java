package com.burcu;

import java.util.Scanner;

public class Runner_Ornek2_Operatorler1 {
    public static void main(String[] args) {

        /**
         * 1. Aritmetik Operatörler; +, -, *, /, % şeklindedir.
         * Toplama, çıkartma, çarpma, bölme, mod alma işlemleri yapılmaktadır.
         */

        /**
         * 2. Arttırım-Azaltım Operatörler; ++, --  şeklindedir.
         * Eğer Arttırım-Azaltım operatörleri bir değişkenin sonuna gelir ise arttırma ya da eksiltme işlemi sonraki
         * kullanımda gerçekleşir, Sayının değeri o aşamada değişmez.
         * Eğer Arttırım-Azaltım- operatörleri değişkenin başına gelirse arttırma ya da eksiltme işlemi o sırada
         * gerçekleşir. Sayının değeri o sırada değişir.
         */

        int s1=5;
        System.out.println("Sayı:"+s1);
        s1++; // 6
        System.out.println("Sayı:" +s1);
        s1++; // 7
        System.out.println("Sayı:" +s1);
        s1--; ++s1; --s1; //6
        System.out.println("Sayı:" +s1);

        /**
         * Assigment Operator - Görev Operatörleri;
         * = atama operatörü,
         * +-=toplama ve atama operatörü,
         * -=, +=, *=, /= operatörler vardır.
         * Bu operatörler atama işlemlerinde kullanılırlar ve aritmetik işlemlerin birleşerek daha
         * kısa kullanımlarını sağlar.
         */

        s1=10;
        System.out.println("Sayı:" +s1);
        s1 -=3; // 7
        System.out.println("Sayı:" +s1);
        s1 *=4; //28
        System.out.println("Sayı:" +s1);
        s1/=2; //14
        System.out.println("Sayı:" +s1);
        s1%=3; //2
        System.out.println("Sayı:" +s1);

        /**
         * Yukarıda tanımladığımız operatörleri aşağıdaki örnekle daha detaylı inceleyelim;
         */

        /**
         * Örnek;
         * Kullanıcıdan alınan bir sayının 4'ün kuvveti olup olmadığını bulan kod.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scanner.nextInt();
        int sayac=0; //= ile atama işlemi yapıldı.
        while (true){
            if (sayi%4==0){ // % ile mod alma özelliğini kullandık
                sayi=sayi/4; // '/' ile aritmetik operatörleri kullandık.
                sayac++; // '++' ile arttırım operatörü kullandık.
            }else if(sayi==1){
                System.out.println("4'ün " + sayac + ". kuvvetidir");
                break;
            }else{
                System.out.println("4'ün kuvveti değildir");
                break;
            }
        }



    }
}
