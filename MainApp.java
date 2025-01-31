import java.util.Scanner;
//create class employee
class Employee {
    String name;//create variable string
    Double salary;//create variabledouble
 
    //create a constructor
    Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
//call method display
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
//create class salarycalculator
class SalaryCalculator {
    Double CalculateBonus(double salary) {
        double bonus = salary * 0.1;
        return bonus;//return bonus
    }
}
// create main class 
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");//prompt the user to enter their names
        String name = scanner.nextLine();

        System.out.print("Enter your salary: ");//prompt the user to enter their salary
        Double salary = scanner.nextDouble();

        Employee employee = new Employee(name, salary);
        SalaryCalculator calculator = new SalaryCalculator();

        employee.display();
        double bonus = calculator.CalculateBonus(salary);//calculate bonus
        System.out.println("Bonus: " + bonus);
    }
}
