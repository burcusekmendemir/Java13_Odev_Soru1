package com.burcu;

public class Runner_Ornek1_Degiskenler {
    public static void main(String[] args) {

        /**
         * Değişken nedir?
         * Girdi olarak alınan bilginin işlemci tarafından işlendikten
         * sonra erişimi yapılabilir şekilde adresinin tutulduğu alanlara denilmektedir.
         * Bilgisayar içinde kullanılan en küçük yapı BİT'dir.
         * 1 bit, 0 veya 1 değerini alabilir.
         * Bu bitlerin bir araya gelmesi ile programlamada kullanılan değişken türleri oluşur.
         */

        byte bytesayi=120;
        boolean cevrimiciMi =true;

        /**
         * -Değişken tanımlaması şu şekilde yapılmaktadır;
         *  [Data Type + Değişken Adı] bir değişken tanımlamadır.
         *
         * -Tanımlanmış bir değişkene değer atama işlemi şu şekilde yapılmaktadır;
         * [degiskenin adı = atanılacak değer]
         *
         * -Yeni tanımlanacak olan bir değişkene atama işlemi ise;
         * [Data Type + Name = Value] şeklindedir.
         */

        int s1; // değişken tanımlama yapıldı
        s1=10; // tanımlanmış değişkene atama yapıldı
        int sayi=5; //değişken tanımlama ve atama işlemi yapıldı


        /**
         * Örnek;
         * İçerisinde sayı yer alan bir String ifade giriniz. String ifade içinden bu sayıyı çekiniz.
         * Sayıyı en küçük sayısal değişkene atayınız.
         * Daha sonra atanan bu en küçük değişkeni bir float değişkene atayınız.
         * Atanan bu float değişkenin çift ya da tek sayı olup olmadığını kontrol ediniz.
         */

        String ifade="String, referans tipli bir değişkendir. " +
                "Bu ifade içinde 27 sayısını çekip en küçük değişkene atayarak adımları devam edelim";


        int index1=ifade.indexOf("2");
        int index2=ifade.indexOf("7")+1;
        String sayi1=ifade.substring(index1,index2);
        int sayi2=Integer.parseInt(sayi1);
        System.out.println("Sayı: " + sayi2);

        byte byteSayi= (byte) sayi2; // en küçük değişken tipi byte'tır. Cast işlemi gerçekleştirdik.
        float floatSayi=byteSayi;

        if (floatSayi%2==0){
            System.out.println("Çift sayıdır.");
        }else {
            System.out.println("Tek sayıdır.");
        }


        /**
         * Tamsayı Değişken Türleri;
         * 1 byte -> 8 bit -> 2^8=256 adet değer alabilir. -128,-127..0,1,2...,127 değerlerini alabilir.
         * short -> 2^16 = 65536 adet değer alabilir. -32768, -32767,... 0,1,...32767 değerlerini alabilir.
         * int -> 2^32 = 4294967296 adet değer alabilir.
         * long -> 2^64 = 18,446,744,073,709,551,616 adet değer alabilir.
         *
         * Ondalıklı Sayı Değişken Türleri;
         * float -> 2^32 = 4294967296 adet değer alabilir.
         * double -> 2^64 adet değer alabilir. Javada ondalıklı değerler için kullanılan default değişken türü double'dır.
         */







    }
}
