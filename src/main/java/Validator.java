public class Validator {
    public boolean isValid(Employee emp) {
        return emp != null
                && emp.getEmail() != null
                && !emp.getEmail().isEmpty()
                && emp.getAge() > 18
                && emp.getAge() < 65
                && emp.getSalary() > 0;
    }
}
