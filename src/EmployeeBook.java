public class EmployeeBook {

    private final Employee[] employees = new Employee[10];


    public void printEmployees() {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
               employees[i].printEmployee();
            } else {
                System.out.println("EMPTY CELL");
            }

        }
    }

    public void addEmployee(String fullName, int department, int salary) {

        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(fullName, department, salary);
                break;
            }
        }

    }

    public void deleteEmployeeByName(String fullName) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
            }
        }
    }

    public void deleteEmployeeById(int id) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public void changeSalaryByName(String name, int salary) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(name)) {
                employees[i].setSalary(salary);
            }

        }
    }

    public void changeDepartmentByName(String name, int department)                                                           {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(name)) {
                employees[i].setDepartment(department);
            }
        }
    }


    public int getTotalSalary() {
        int totalSalary = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                totalSalary += employees[i].getSalary();
            }
        }
        return totalSalary;
    }

    public void printAverageSalary() {
        int employeesCount = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                employeesCount++;
            }
        }
        System.out.println("Average salary: " + getTotalSalary() / employeesCount);

    }


    public void printEmployeeWithMaxSalary() {
        int maxSalary = 0;
        int index = 0;

        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary ) {
                maxSalary = employees[i].getSalary();
                index = i;
            }
        }
        System.out.print("Max Salary Employee: ");
        employees[index].printEmployee();
    }
    public void printEmployeeWithMaxSalary(int department) {
        int maxSalary = 0;
        int index = 0;

        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department && employees[i].getSalary() > maxSalary ) {
                maxSalary = employees[i].getSalary();
                index = i;
            }
        }
        System.out.printf("Max Salary Employee in Department %d: ", department);
        employees[index].printEmployee();
    }



    public void printEmployeeWithMinSalary() {
        int minSalary = employees[0].getSalary();
        int index = 0;

        for (int i = 0; i <= employees.length - 1; i++) {

            if (employees[i] != null && employees[i].getSalary() < minSalary ) {
                minSalary = employees[i].getSalary();
                index = i;
            }
        }
        System.out.print("Min Salary Employee: ");
        employees[index].printEmployee();
    }
    public void printEmployeeWithMinSalary(int department) {
        int minSalary = employees[0].getSalary();
        int index = 0;

        for (int i = 0; i <= employees.length - 1; i++) {

            if (employees[i] != null && employees[i].getDepartment() == department && employees[i].getSalary() < minSalary ) {
                minSalary = employees[i].getSalary();
                index = i;
            }
        }
        System.out.printf("Min Salary Employee in Department %d: ", department);
        employees[index].printEmployee();
    }




}




