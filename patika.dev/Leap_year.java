import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int year;
        System.out.println("Enter a year:");
        year=inp.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("This year is a leap year!");
                }
                else{
                    System.out.println("This year is not a leap year!");
                }
            }
        else{
                System.out.println("This year is a leap year!");
            }
        }
        else{
            System.out.println("This year is not a leap year!");
        }

    }
}
