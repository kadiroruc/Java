public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public boolean setHireYear(int hireYear) {
        if(hireYear<=2021||hireYear<1900){
            this.hireYear = hireYear;
            return true;
        }
        else{
            System.out.println("Hatalı Giriş Yaptınız! Tekrar Deneyiniz:");
            return false;
        }

    }

    public int tax(int salary){
        if(this.salary>1000){
            return this.salary*3/100;
        }
        else{
            return 0;
        }
    }

    public int bonus(int workHours){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        else{
            return 0;
        }
    }

    public int raiseSalary(int hireYear){
        int years=2021-this.hireYear;
        if(years<10){
            return this.salary*5/100;
        }
        else if (years>=10&&years<20){
            return this.salary*10/100;
        }
        else{
            return this.salary*15/100;
        }
    }

    public void printInfo(){
        System.out.print("Çalışanın İsmi:"+this.name+"\nÇalışanın Maaşı:"+this.salary+
                "\nÇalışanın Haftalık Çalışma Saati:"+this.workHours+"\nÇalışanın İşe Giriş Yılı:"+this.hireYear+"\n\n");

    }


}
