public class Employee {

    String name;

    double salary;

    int workHours;

    int hireYear;
    private double vergi;
    private double bonus;
    private double raise;

    public Employee(String name, int salary, int workHours, int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax()
    {
        if (salary < 1000) vergi = 0;
        else vergi = salary * 0.03;

        return vergi;
    }

    public double bonus()
    {

        if (workHours > 40) bonus = (workHours - 40) * 30;
        else bonus = 0;


        return bonus;
    }

    public double raiseSalary()
    {
        if ((2021 - hireYear) > 19) raise = salary * 0.15;
        else if ((2021 - hireYear) < 20 && (2021 - hireYear) > 9) raise = salary * 0.1;
        else raise = salary * 0.05;

        return raise;
    }

    public String toString(){

        System.out.println("Adi : " + this.name);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println("Baslangic Yili : " + this.hireYear);
        System.out.println("Vergi : " + this.vergi);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maas Artisi : " + this.raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (salary - vergi + bonus));
        System.out.println("Toplam Net Maas : " + ((salary - vergi + bonus)+ raise));
        return null;
    }
}