public class EmployeeTest {
    public static void main(String[] args){
        Date birth = new Date(11, 3, 1987);
        Date hire = new Date(6,5, 2018);
        Employee employee = new Employee("Andrew", "Chan", birth, hire);

        System.out.println(employee);
    }
}
