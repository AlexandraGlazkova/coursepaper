import java.util.Arrays;

public class Main {
    public static Employee[] worker = new Employee[10];
    public static int sum = 0;
//    public static int minEmployeeSalary = worker[0].getEmployeeSalary();
//    public static int maxEmployeeSalary = worker[0].getEmployeeSalary();


    public static void main(String[] args) {

        worker[0] = new Employee("Фамилия1 Имя1 Отчество1", 1, 20300);
        worker[1] = new Employee("Фамилия2 Имя2 Отчество2", 2, 20800);
        worker[2] = new Employee("Фамилия3 Имя3 Отчество3", 3, 30800);
        worker[3] = new Employee("Фамилия4 Имя4 Отчество4", 3, 30900);
        worker[4] = new Employee("Фамилия5 Имя5 Отчество5", 4, 40800);
        worker[5] = new Employee("Фамилия6 Имя6 Отчество6", 2, 20800);
        worker[6] = new Employee("Фамилия7 Имя7 Отчество7", 3, 30700);
        worker[7] = new Employee("Фамилия8 Имя8 Отчество8", 3, 30300);
        worker[8] = new Employee("Фамилия9 Имя9 Отчество9", 4, 40900);
        worker[9] = new Employee("Фамилия10 Имя10 Отчество10", 4, 40400);
        for (int i = 0; i < worker.length; i++)
            System.out.println(worker[i]);
        salarySum();
        printMinAEmployeeSalary();
        printMaxEmployeeSalary();
        printAverageSalary();
        for (int i = 0; i < worker.length; i++)
        System.out.println(worker[i].getFcs());
    }
    public static void salarySum() {
        for (int i = 0; i < worker.length; i++) {
            sum += worker[i].getEmployeeSalary();
        }
        System.out.printf("Сумма затрат на зарплаты в месяц = %s рублей \n", sum);
    }
    public static void printMinAEmployeeSalary() {
        int minEmployeeSalary = worker[0].getEmployeeSalary();
        for (int i = 0; i< worker.length; i++)
        if (minEmployeeSalary>worker[i].getEmployeeSalary()) {
            minEmployeeSalary = worker[i].getEmployeeSalary();
        }
        for (int i = 0; i< worker.length; i++)
            if (minEmployeeSalary==worker[i].getEmployeeSalary()) {
                System.out.printf("Минимальная зарплата - %s  рублей  \n", worker[i]);
            }
    }
    public static void printMaxEmployeeSalary() {
        int maxEmployeeSalary = worker[0].getEmployeeSalary();
        for (int i = 0; i < worker.length; i++)
            if (maxEmployeeSalary < worker[i].getEmployeeSalary()) {
                maxEmployeeSalary = worker[i].getEmployeeSalary();
            }
        for (int i = 0; i < worker.length; i++)
            if (maxEmployeeSalary == worker[i].getEmployeeSalary()) {
                System.out.printf("Максимальная зарплата - %s  рублей  \n", worker[i]);
            }
    }

    public static void printAverageSalary() {
        double averageSalary = sum/ worker.length;
        String resultAverageSalary = String.format("%.2f",averageSalary);
        System.out.printf("Среднее значение зарплат - %s рублей \n ", resultAverageSalary);
        }
}






