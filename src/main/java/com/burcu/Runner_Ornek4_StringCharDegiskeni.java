package com.burcu;

import java.util.Locale;

public class Runner_Ornek4_StringCharDegiskeni {
    public static void main(String[] args) {

        /**
         * Karakter Veri Tipleri:
         * char; Karakter değişkenler için kullanılır. '' ile yazılırlar.
         * String: String referans tipli bir değişkendir.String bir karakterler dizisidir.
         * "" tırnak ile yazılan tüm ifadeler String olarak tanımlanır. Javanın default tanımlarındandır.
         * boolean; 1 bit'tir, 0 veya 1 değerini alabilr. true-false / 1-0 / evet-hayır / doğru-yanlış şeklindedirler.
         */

        /**
         * Aşağıdaki örnekleri inceleyelim;
         */

        /**
         * String bir ifade içinde sayılar yer alıyorsa bunları toplayan kodu yazalım.
         * Daha sonra boşluk karakterleri "-" ile nokta karakterini de "/" ile yer değiştirelim.
         * Tüm harfleri büyük harf olarak yazdıralım ve boşlukları silelim.
         */


       String ifade= "     Burcu Sekmen 16.06.1997  ";

       int toplam=0;
        for (int i = 0; i <ifade.length(); i++) {
            char karakter=ifade.charAt(i);
            if (Character.isDigit(karakter)){
                int sayi=Character.getNumericValue(karakter);
                toplam+=sayi;
            }
        }
        System.out.println("Toplam sonucu: " + toplam);

        ifade= ifade.trim().toUpperCase(Locale.ENGLISH).replace(" ", "-").replace(".","/");
        System.out.println("Yeni ifade: " + ifade);





    }
}
