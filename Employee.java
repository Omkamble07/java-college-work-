import java.util.Scanner;
class Employee{
    String firstName;
    String lastName;
    double salary;

    Employee(String fName,String lName,double sal){
        this.firstName=fName;
        this.lastName=lName;
        this.salary=sal;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setSalary(double sal) {
        salary = sal;
    }

    // display data:
    public String getFname(){
        return firstName;
    }

    public String getLname(){
        return  lastName;
    }

    public double getSalary(){
        return salary;
    }

    public void raisedSalary(){
        double TotalSalary=salary*12;
        TotalSalary += TotalSalary*0.1;
        System.out.println("raised salary:"+TotalSalary);
    }


    public static void main(String args[]){
        Employee e1 = new Employee("om","kamble",10000.00);
        System.out.println("first name:"+e1.getFname());
        System.out.println("Last name:"+e1.getLname());
        System.out.println("salary:"+e1.getSalary());
        e1.raisedSalary();


        System.out.println("______________________________________________");
        System.out.println("empolyee 2:");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name :");
        String fName=sc.nextLine();

        System.out.println("enter last name :");
        String lName=sc.nextLine();

        System.out.println("enter salary :");
        double sal=sc.nextDouble();

       

        Employee e2 = new Employee(fName, lName, sal);

        // e2.setFirstName(fName);
        // e2.setLastName(lName);
        // e2.setSalary(sal);

        System.out.println("first name:"+e2.getFname());
        System.out.println("last name:"+e2.getLname());
        System.out.println("salary:"+e2.getSalary());
        e2.raisedSalary();

    }
}