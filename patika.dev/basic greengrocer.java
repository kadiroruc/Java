import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        float a=2.14f,e=3.67f,d=1.11f,m=0.95f,p=5.0f;
        double toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Armuttan kaç kilo:");
        float kilo=input.nextFloat();
        toplam+=kilo*a;
        System.out.print("Elmadan kaç kilo:");
        kilo=input.nextFloat();
        toplam+=kilo*e;
        System.out.print("Domatesten kaç kilo:");
        kilo=input.nextFloat();
        toplam+=kilo*d;
        System.out.print("Muzdan kaç kilo:");
        kilo=input.nextFloat();
        toplam+=kilo*m;
        System.out.print("Patlıcandan kaç kilo:");
        kilo=input.nextFloat();
        toplam+=kilo*p;

        System.out.println("Tutar:"+toplam);


    }
}
