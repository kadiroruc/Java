import java.util.Scanner;
public class Maas2 {
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
            System.out.println("("+employees[i].getName()+")"+"Yeni Maaş:"+newSalary);
            System.out.println("\n\n******************");


        }
        System.out.println("Kayıt Başarıyla Tamamlandı.");

        /*Employee employee=new Employee();
        employee.setName("Hasan Usta");
        employee.setHireYear(2008);
        employee.setSalary(2500);
        employee.setWorkHours(55);

        employee.printInfo();


        int tax= employee.tax(employee.getSalary());
        int bonus=employee.bonus(employee.getWorkHours());
        int raise=employee.raiseSalary(employee.getHireYear());

        int newSalary=employee.getSalary()-tax+bonus+raise;
        System.out.println("("+employee.getName()+")"+"Yeni Maaş:"+newSalary);
        System.out.println("\n\n******************");


        Employee employee2=new Employee();
        employee2.setName("Sıvacı Osman");
        employee2.setHireYear(2012);
        employee2.setSalary(4000);
        employee2.setWorkHours(70);

        employee2.printInfo();


        tax= employee2.tax(employee.getSalary());
        bonus=employee2.bonus(employee.getWorkHours());
        raise=employee2.raiseSalary(employee.getHireYear());

        newSalary=employee2.getSalary()-tax+bonus+raise;
        System.out.println("("+employee2.getName()+")"+"Yeni Maaş:"+newSalary);
        System.out.println("\n\n******************");*/


    }
}
