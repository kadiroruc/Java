import java.util.Scanner;
public class newSalaryOfEmployees {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many employees will be entered:");
        int n=sc.nextInt();
        Employee[] employees=new Employee[n];

        int tax,bonus,raise;

        sc.nextLine();
        for(int i=0;i<n;i++){
            employees[i]=new Employee();
            System.out.println("Please, Enter Employee's name:");
            employees[i].setName(sc.nextLine());
            System.out.println("Please,Enter Employee's Salary:");
            employees[i].setSalary(sc.nextInt());
            System.out.println("Please,Enter Employee's Hire Year:");
            if(employees[i].setHireYear(sc.nextInt())){
                ;
            }
            else{
                employees[i].setHireYear(sc.nextInt());
            }
            System.out.println("Please,Enter Employee's Work Hours:");
            employees[i].setWorkHours(sc.nextInt());
            sc.nextLine();

            employees[i].printInfo();
            tax= employees[i].tax(employees[i].getSalary());
            bonus=employees[i].bonus(employees[i].getWorkHours());
            raise=employees[i].raiseSalary(employees[i].getHireYear());

            int newSalary=employees[i].getSalary()-tax+bonus+raise;
            System.out.println("("+employees[i].getName()+")"+"New Salary:"+newSalary);
            System.out.println("\n\n******************");


        }
        System.out.println("Registration Completed Successfully.");
        

    }
}
