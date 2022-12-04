public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иван", "Иванович", "Иванов", 3, 40000);
        employees[1] = new Employee("Фёдор", "Фёдорович", " Фёдоров", 1, 32000);
        employees[2] = new Employee("Пётр", "Петрович", "Петров", 2, 34200);
        employees[3] = new Employee("Денис", "Денисович", "Денисов", 1, 54332.33);
        employees[4] = new Employee("Павел", "Павлович", "Павлов", 5, 32123.21);
        employees[5] = new Employee("Александр", "Грегорьевич", "Лукашенко", 2, 100000);
        employees[7] = new Employee("Matthew", "David", "McConaughey", 3, 230000);
        employees[8] = new Employee("Dwayne", "The Rock", "Johnson", 2, 270000);
        employees[9] = new Employee("Scarlett", "Ingrid", "Johansson", 2, 1000000);

        printAllEmployees();
        printSumSalaryPerMonth();
        printEmployeeWithMinSalary();
        printEmployeeWithMaxSalary();
        printAvgSalary();
        printAllNames();


    }

    public static void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void printSumSalaryPerMonth() {
        double sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sumSalary = sumSalary + employees[i].getSalary();
            }
        }
        System.out.println("Общие затраты на зарплату в месяц составляют " + sumSalary);
    }

    public static void printEmployeeWithMinSalary() {
        double minSalary = maxSalary();
        int relevantIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                    relevantIndex = i;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + employees[relevantIndex]);
    }

    public static void printEmployeeWithMaxSalary() {
        double maxSalary = 0;
        int relevantIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    relevantIndex = i;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + employees[relevantIndex]);
    }

    public static void printAvgSalary() {
        double sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sumSalary = sumSalary + employees[i].getSalary();
            }
        }
        double avgSalary = sumSalary / employeesCount();
        System.out.println("Средняя зарплата в месяц составляет " + avgSalary);
    }

    public static void printAllNames() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFirstName() + " " + employees[i].getMiddleName() + " " + employees[i].getLastName());
            }
        }
    }

    // Метод для нахождения максимальной зарплаты, чтобы не выдумывать число для нахождения минимальной зарплаты
    public static double maxSalary() {
        double maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                }
            }
        }
        return maxSalary;
    }

    // Метод для нахождения текущего кол-ва сотрудников
    public static int employeesCount() {
       int lastId = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                lastId = employees[i].getId();
            }
        }
        return lastId + 1;
    }


}