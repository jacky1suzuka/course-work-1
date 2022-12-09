public class EmployeeService {

    public static void printAllEmployees() {
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                System.out.println(Main.employees[i]);
            }
        }
    }

    public static void printSumSalaryPerMonth() {
        double sumSalary = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                sumSalary = sumSalary + Main.employees[i].getSalary();
            }
        }
        System.out.println("Общие затраты на зарплату в месяц составляют " + sumSalary);
    }

    public static void printEmployeeWithMinSalary() {
        double minSalary = maxSalary();
        int relevantIndex = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                if (Main.employees[i].getSalary() < minSalary) {
                    minSalary = Main.employees[i].getSalary();
                    relevantIndex = i;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + Main.employees[relevantIndex]);
    }

    public static void printEmployeeWithMaxSalary() {
        double maxSalary = 0;
        int relevantIndex = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                if (Main.employees[i].getSalary() > maxSalary) {
                    maxSalary = Main.employees[i].getSalary();
                    relevantIndex = i;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + Main.employees[relevantIndex]);
    }

    public static void printAvgSalary() {
        double sumSalary = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                sumSalary = sumSalary + Main.employees[i].getSalary();
            }
        }
        double avgSalary = sumSalary / employeesCount();
        System.out.println("Средняя зарплата в месяц составляет " + avgSalary);
    }

    public static void printAllNames() {
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                System.out.println(Main.employees[i].getFirstName() + " " + Main.employees[i].getMiddleName() + " " + Main.employees[i].getLastName());
            }
        }
    }

    // Метод для нахождения максимальной зарплаты, чтобы не выдумывать число для нахождения минимальной зарплаты
    public static double maxSalary() {
        double maxSalary = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                if (Main.employees[i].getSalary() > maxSalary) {
                    maxSalary = Main.employees[i].getSalary();
                }
            }
        }
        return maxSalary;
    }

    // Метод для нахождения текущего кол-ва сотрудников
    public static int employeesCount() {
        int lastId = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                lastId = Main.employees[i].getId();
            }
        }
        return lastId + 1;
    }
}
