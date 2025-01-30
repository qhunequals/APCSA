public class Employee {
    private String name;
    private int age, id;

    public Employee(String n, int a, int i){
        name = n;
        age = a;
        id = i;
    }

    public String toString(){
        return "Employee #" + id + "\n" + name;
    }




}
