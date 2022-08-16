import java.util.Objects;

public class Employee {
    private final String fcs;
    private int department;
    private int employeeSalary;
    private static int Counter;
    private int id;



    public Employee(String fcs, int department, int employeeSalary) {
        this.fcs = fcs;
        this.department=department;
        this.employeeSalary=employeeSalary;
        id=++Counter;
    }


    public String getFcs() {
        return fcs;
    }

    public int getDepartment() {
        return department;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getId() {
        return id;

    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setEmployeeSalary() {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Id: " + id + " ФИО: " + fcs + " Отдел: " + department + " Зарплата: " + employeeSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.employeeSalary, employeeSalary) == 0 &&
                id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, employeeSalary, id);
    }
}
