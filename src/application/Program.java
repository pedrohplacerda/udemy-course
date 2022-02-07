package application;

import application.entities.Employee;
import application.entities.OutsourcedEmployee;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees:");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsourced? (y/n)");
            char answer = sc.next().charAt(0);

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Hours: ");
            Integer hours = sc.nextInt();

            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (answer == 'y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }


        System.out.println();
        System.out.println("Payments: ");

        for (Employee emp : employees) {
            System.out.println(emp.getName() + ": $ " + String.format("%.2f", emp.payment()));
        }

    }
}
