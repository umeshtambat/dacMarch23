import java.util.Scanner;
class Company{
    private String name;
    private int empId;
    private float empSalary;
    Company(){

    }

  public void setName(String name)
    {
        this.name=name;
    }
  public void setEmpId(int empId)
    { 
        this.empId=empId;
    }
    public void setEmpSalary(float empSalary)
    {
         this.empSalary=empSalary;
    }

   public String getName()
    {
        return this.name;

    }

    public int getEmpId()
    {
        return this.empId;

    }

    public float getEmpSalary()
    {
        return this.empSalary;

    }

    

}
class Program{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       Company c=new Company();

      System.out.println("Enter Name: ");
       c.setName(sc.nextLine());
              System.out.println("Enter EmpId: ");
       c.setEmpId(sc.nextInt());
         System.out.println("Enter Salary: ");
       c.setEmpSalary(sc.nextFloat());

       System.out.println(c.getName()+ " "+ c.getEmpId()+" "+c.getEmpSalary());

    }
}



