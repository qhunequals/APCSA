import java.util.ArrayList;

public class Company {
    static int dep = 0;
    private ArrayList<Integer> departmentNumber = new ArrayList<Integer>();
    private ArrayList<Employee[]> Employees = new ArrayList<Employee[]>();

    public Company(){

    }

    public void addDept(Employee[] emp){
        dep++;
        departmentNumber.add(dep);
        Employees.add(emp);
    }


    public String toString(){
        String f = "";
        f = "Number of departments: " + dep + "\n";
        for(int i = 0; i < dep; i++){
            f+= "Department " + departmentNumber.get(i) + "\n";
            if(Employees.size() > 1){
                for(int j = 0; j < Employees.get(i).length; j++){
                    f+= Employees.get(i)[j] + "\n\n";
                }
            }
            else{
                f+= Employees.get(i)[0] + "\n\n";
            }
        }
      return f;
    }
}
