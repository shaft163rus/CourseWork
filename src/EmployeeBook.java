public class EmployeeBook {

    Employee[] employees = new Employee[10];

    public void addEmployee(String fullName, int department, int salary) {

        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(fullName, department, salary);
                break;
            }
        }

    }

    public void deleteEmployee(String fullName) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
            }
        }
    }


}






