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

        EmployeeService.printAllEmployees();
        EmployeeService.printSumSalaryPerMonth();
        EmployeeService.printEmployeeWithMinSalary();
        EmployeeService.printEmployeeWithMaxSalary();
        EmployeeService.printAvgSalary();
        EmployeeService.printAllNames();
        System.out.println(employees[5].getId());
        System.out.println(employees[3].equals(employees[1]));
    }











}