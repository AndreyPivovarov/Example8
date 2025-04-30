public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();

        Employee employee1 = new Manager(1, "Masha", 22, "masha@gmail.com", 5300);
        Employee employee2 = new Manager(2, "Egor", 34, "Egor@gmail.com", 8000);
        Employee employee3 = new Manager(3, "Sergey", 19, "Sergey@gmail.com", 5000);
        Employee employee4 = new Manager(4, "Diana", 41, "Diana@gmail.com", 5100);
        Employee employee5 = new Manager(5, "Anton", 59, "Anton@gmail.com", 9000);

        employeeManager.processEmployeeData(employee1);
        employeeManager.processEmployeeData(employee2);
        employeeManager.processEmployeeData(employee3);
        employeeManager.processEmployeeData(employee4);
        employeeManager.processEmployeeData(employee5);

    }
}
