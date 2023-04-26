public class Main {
    public static void main(String[] args) {

        EmployeeBook em = new EmployeeBook();

        em.addEmployee("yura", 2, 3400);
        em.addEmployee("her", 1, 5400);
        em.addEmployee("ber", 3, 6400);
        em.addEmployee("mer", 5, 7400);
        em.addEmployee("gr", 2, 3400);
        em.addEmployee("fdsf", 1, 5400);
        em.addEmployee("jhjh", 3, 6400);
        em.addEmployee("43534", 5, 7400);
        em.addEmployee("mer", 5, 7400);
        em.addEmployee("gr", 2, 3400);




        System.out.println(em.employees[0].getFullName());
        System.out.println(em.employees[1].getFullName());
        System.out.println(em.employees[2].getFullName());
        System.out.println(em.employees[3].getFullName());
        System.out.println(em.employees[4].getFullName());
        System.out.println(em.employees[5].getFullName());
        System.out.println(em.employees[6].getFullName());
        System.out.println(em.employees[7].getFullName());
        System.out.println(em.employees[8].getFullName());
        System.out.println(em.employees[9].getFullName());



        em.deleteEmployee("her");
        em.addEmployee("TEST", 3, 6400);
        System.out.println(em.employees[1].getFullName());
        System.out.println(em.employees[1].getId());


//        em.addEmployee("test", 2, 3400);
//        System.out.println(em.employees[1].getFullName());
//        System.out.println(em.employees[1].getSalary());

    }
}