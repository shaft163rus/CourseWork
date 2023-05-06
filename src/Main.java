public class Main {
    public static void main(String[] args) {

        EmployeeBook em = new EmployeeBook();

        em.addEmployee("one", 2, 3400);
        em.addEmployee("two", 1, 5400);
        em.addEmployee("three", 4, 16400);
        em.addEmployee("four", 5, 7900);
        em.addEmployee("five", 2, 3600);
        em.addEmployee("six", 1, 15400);
        em.addEmployee("seven", 3, 6400);
        em.addEmployee("eight", 5, 7200);
        em.addEmployee("nine", 5, 7400);
        em.addEmployee("ten", 2, 370);

        em.printEmployees();

        System.out.println();


        em.deleteEmployeeById(5);
        em.changeSalaryByName("two", 8900);
        em.changeDepartmentByName("nine", 3);
        System.out.println("Total salary: " + em.getTotalSalary());
        em.printAverageSalary();
        em.printEmployeeWithMaxSalary();
        em.printEmployeeWithMinSalary();
        em.printEmployeeWithMaxSalary(3);
        em.printEmployeeWithMinSalary(1);


        System.out.println();

        em.printEmployees();







    }
}
