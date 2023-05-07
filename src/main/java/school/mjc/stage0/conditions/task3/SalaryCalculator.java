package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0)
            System.out.println("wrong input!");
        else if(salary <= 10000)
            System.out.println(salary - ((15.0*salary)/100));
        else if (salary <= 20000)
            System.out.println(salary - ((18.0*salary)/100));
        else if (salary > 20000)
            System.out.println(salary - ((20.0*salary)/100));
    }
}
