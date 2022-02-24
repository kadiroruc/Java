import java.util.Scanner;

public class ucgen_alan {
    public static void main (String[] args){
        int a,b,c;
        Scanner girdi=new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz:");
        a=girdi.nextInt();
        System.out.print("2.Kenarı Giriniz:");
        b=girdi.nextInt();
        System.out.print("3.Kenarı Giriniz:");
        c=girdi.nextInt();

        int cevre=a+b+c;
        float u =cevre/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin Alanı:"+alan);
    }
}
