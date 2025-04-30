abstract class Employee {
    private int id;
    private String name;
    private int age;
    private String email;
    private double salary;

    public Employee(int id, String name, int age, String email, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary(){
        return salary;
    };

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract public void validateSalary();

    public void setEmail(String email) {
        this.email = email;
    }

    protected final void validateMinSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Сумма должна быть положительной");
        }
    }
}
