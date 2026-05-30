import java.util.Scanner;

class Employee {
    int id;
    String name;
    int age;
    String department;

    Employee(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void printProfile() {
        System.out.println("Employee ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Department: " + department);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            int age = scanner.nextInt();
            String department = scanner.next();

            if (id <= 0 || age <= 0 || name.isEmpty() || department.isEmpty()) {
                System.out.println("Invalid input");
            } else {
                Employee employee = new Employee(id, name, age, department);
                employee.printProfile();
            }
        }

        scanner.close();
    }
}