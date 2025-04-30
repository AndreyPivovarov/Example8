import java.util.List;
import java.util.ArrayList;


class EmployeeManager {
    private List<Employee> employees;
    private DatabaseConnection dbConnection;
    private Validator validator;
    private Logger logger;
    private Notification notification;
    private EmployeeExists employeeExists;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
        this.dbConnection = new MySQLConnection();
        this.validator = new Validator();
        this.logger = new Logger();
        this.notification = new Notification();
        this.employeeExists = new EmployeeExists();
    }

    public void processEmployeeData(Employee emp) {
        if (validator.isValid(emp)) {
            employeeExists.exists(emp, employees);
            emp.validateSalary();


            if (dbConnection.isConnected()) {
                dbConnection.save(emp);
                employees.add(emp);
                notification.sendNotification(emp);
                logger.logAction("Added: " + emp.getName());
            } else {
                logger.logAction("DB not connected");
            }
        }
    }
}

