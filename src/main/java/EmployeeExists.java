import java.util.ArrayList;
import java.util.List;

public class EmployeeExists {

    public void exists(Employee emp, List<Employee> employees) {
        for (Employee e : employees) {
            if (e.getId() == emp.getId()) {
                System.out.println("Employee exists");
                return;
            }
        }
    }
}
