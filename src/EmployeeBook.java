public class EmployeeBook {

    private final Employee[] employees = new Employee[10];


    public void printEmployees() {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                System.out.printf("FullName: %s; Department: %d; Salary: %d\n", employees[i].getFullName(), employees[i].getDepartment(), employees[i].getSalary());
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

    public void changeDepartmentByName(String name, int department) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(name)) {
                employees[i].setDepartment(department);
            }
        }
    }

    public void checkSameFullNames (String fullName){

        }


    }