public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama
    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0.0;
        }
    }

    // Bonus hesaplama
    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışı hesaplama
    public double raiseSalary() {
        int currentYear = 2021;
        int yearsOfWork = currentYear - this.hireYear;

        if (yearsOfWork < 10) {
            return this.salary * 0.05;
        } else if (yearsOfWork < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    // Çalışan bilgilerini yazdırma
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double totalSalaryWithBonusAndTax = this.salary - tax + bonus;
        double totalSalaryWithRaise = totalSalaryWithBonusAndTax + raise;

        return "Adı: " + this.name +
                "\nMaaşı: " + this.salary +
                "\nÇalışma Saati: " + this.workHours +
                "\nBaşlangıç Yılı: " + this.hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaaş Artışı: " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş: " + totalSalaryWithBonusAndTax +
                "\nToplam Maaş: " + totalSalaryWithRaise;
    }
}