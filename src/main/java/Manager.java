class Manager extends Employee implements SalaryValidatable{
    private static final double MIN_SALARY = 5000.;

    public Manager(int id, String name, int age, String email, double salary) {
        super(id, name, age, email, salary);
    }

    @Override
    public void validateSalary() {
        validateMinSalary(getSalary());
        validateMaxSalary(getSalary());
    }

    @Override
    public void validateMaxSalary(double salary) {
        if (salary < MIN_SALARY) {
            throw new IllegalArgumentException("Manager salary too low - " + getName());
        }
    }
}