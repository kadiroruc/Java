import java.util.Scanner;

public class dersler {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner input= new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik= input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya= input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce= input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih= input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik= input.nextInt();

        float ort=(mat+fizik+kimya+turkce+tarih+muzik)/6f;

        System.out.print("Ortalamanız:"+ort);

        Boolean kosul=ort>60;
        String sonuc= kosul?"Dersi Geçtiniz":"Dersten Kaldınız";
        System.out.println(sonuc);
    }

}
