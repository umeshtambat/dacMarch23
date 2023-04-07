import java.util.Scanner;

class Vehicle{
    String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;
    Vehicle(){
        this(null,0,0);
    }
    Vehicle(String vehicleType,int numAxles,double distanceTraveled){
        this.vehicleType=vehicleType;
        this.numAxles=numAxles;
        this.distanceTraveled=distanceTraveled;    
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }
    public void setNumAxles(int numAxles){
        this.numAxles=numAxles;
    }
    public void setDistanceTravelled(double distanceTraveled){
        this.distanceTraveled=distanceTraveled;
    }
    public void calculateTollFee(){
        if (this.vehicleType=="truck"){
            this.tollFee=this.distanceTraveled*this.numAxles*0.5;
        }
        else{
            this.tollFee=this.distanceTraveled*this.numAxles*0.25;
        }
    }
    public double generateBill(){
        return this.totalAmountDue=this.tollFee+2;
    }
}
class TollBooth{
    Scanner sc= new Scanner(System.in);
    Vehicle v1=new Vehicle();
    public void getVehicleType(){
        System.out.println("Vehicle Type:");
        v1.setVehicleType(sc.nextLine());
    }
    public void getNumAxles(){
        System.out.print("No.of axles:");
        v1.setNumAxles(sc.nextInt());
    }
    public void getDistanceTravelled(){
        System.out.println("Distance in miles:");
        v1.setDistanceTravelled(sc.nextDouble());
    }
    public void calculateTollFee(){
        v1.calculateTollFee();
        System.out.println("Bill calculated");
    }
    public void generateBill(){
        System.out.println("Bill Amount:"+v1.generateBill());
    }
    public void displayMenu(){
        System.out.println("1.Enter vehicle type (car, van, bus, or truck)");
        System.out.println("2.Enter number of axles");
        System.out.println("3.Enter distance travelled");
        System.out.println("4.Calculate toll fee");
        System.out.println("5.Generate bill");
        System.out.println("0.Exit");
    }    
}

public class TollGenerator {
    public static void main(String[] args) {
        TollBooth t1=new TollBooth();
        Scanner sc=new Scanner(System.in);
        int choice=1;
        while(choice!=0){
            t1.displayMenu();
            choice=sc.nextInt();
            switch((choice)){
                case 1: t1.getVehicleType();
                        break;
                case 2: t1.getNumAxles();
                        break;
                case 3: t1.getDistanceTravelled();
                        break;
                case 4: t1.calculateTollFee();
                        break;
                case 5: t1.generateBill();
                        break;
                default:
                System.out.println("Invalid Input. Try again!");
            }

        }
    }
    
}
