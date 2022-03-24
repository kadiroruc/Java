import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayi=input.nextInt();
        int kat1=1,kat2=1;
        for(int i=0;i<100;i++){
            kat1*=4;
            kat2*=5;
            if((kat1<=sayi)&&(kat2<=sayi))
                System.out.println(kat1+" "+kat2);
            else
                break;
        }
    }

}
