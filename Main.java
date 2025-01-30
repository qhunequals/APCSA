import java.util.ArrayList;

public class Main {
    public static void main(String[] args){ 
        Employee[] salesDept = {new Employee("Ashley", 23, 123456), new Employee("Jim", 27, 123455)};
        Employee[] accDept = {new Employee("Bradley" , 48, 1234567)};
        Employee[] adminDept = {new Employee("Sarah" , 31, 123459)};

        Company myComp = new Company();
        myComp.addDept(salesDept); 
        myComp.addDept(accDept); 
        myComp.addDept(adminDept); 
        
        System.out.println(myComp);


    }
}