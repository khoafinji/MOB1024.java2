package Lab1_b2;


public class Employee {
    private String id;
    private String name;
    private double basicSalary;

    public Employee() {
    }

    public Employee(String id, String name, double basicSalary) {
        setId(id);
        this.name = name;
        setBasicSalary(basicSalary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id == null || id.trim().isEmpty()){
            throw new IllegalArgumentException("ID khong duoc rong");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if(basicSalary < 0){
            throw new IllegalArgumentException("Luong phai lon hon hoac bang 0");
        }
        this.basicSalary = basicSalary;
    }
    
    public double income(){
        return basicSalary;
    }
    @Override
    public String toString(){
        return "ID:" + id + "\t" + "Name:" + name + "\t" + "Basic_Salary:" + basicSalary;
    }
}
