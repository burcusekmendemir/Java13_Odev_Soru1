package com.burcu;

public class Runner_Ornek3_Operatorler2 {
    public static void main(String[] args) {

        /**
         * İlişkisel operatörler; durumu irdelemek için kullanılır.
         * boolean -> true/false değeri verir.
         * == -> iki değer eşit ise true değil ise false ifadesini alır.
         * != ->iki değer biirbirine eşit değil ise true eşit ise false ifadesini alır.
         * < -> ilk değer ikinci değerden küçükse true değilse false ifadesini alır.
         * > ->ilk değer ikinci değerden büyükse true değilse false ifadesini alır.
         * <= ilk değer ikinci değerden küçük eşitse true değilse false ifadesini alır.
         * >= ilk değer ikinci değerden büyük eşitse true değilse false ifadesini alır.
         */

        /**
         * Mantıksal Operatörler;
         * VE -> &&
         * VEYA -> ||
         * 0 ve 0  -> 0
         * 0 ve 1  -> 0
         * 1 ve 0  -> 0
         * 1 ve 1  -> 1
         * 0 veya 0  -> 0
         * 0 veya 1  -> 1
         * 1 veya 0  -> 1
         * 1 veya 1  -> 1
         */

        /**
         * Aşağıdaki örnekle ilişkisel ve mantıksal operatörleri detaylı bir şekilde inceleyelim;
         */


        /**
         * Örnek;
         * 10 elemanlık bir sayı bir dizisinde;
         * Eğer sayi 90dan küçük ve 3'e bölünebiliyorsa sayıları toplayan,
         * Eğer sayi 90dan büyük ve çift ise sayıları toplayan kodları yazalım.
         * Bu iki toplamın farkını ekrana yazdıralım.
         */

        int [] sayilar= {150,85,36,102,6,41,33,9,82,163 };
        int toplam1=0, toplam2=0;

        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i]<90 && sayilar[i]%3==0){
                toplam1+=sayilar[i];
            }
            if (sayilar[i]>=90 && sayilar[i]%2==0){
                toplam2+=sayilar[i];
            }
        }

        int fark=0;
        if (toplam2>toplam1){
            fark=toplam2-toplam1;
        }else {
            fark=toplam1-toplam2;
        }

        System.out.println("1. Toplam: " + toplam1);
        System.out.println("2. Toplam: " + toplam2);
        System.out.println("Fark: " + fark);
    }
}
