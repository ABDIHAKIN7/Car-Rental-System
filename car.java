package assigment1;

public class car {

    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rent;

    public static final String company="JUST Rentals";
    public static int totalCARS;

    public car() {
        this.plateNumber = " unkown";
        this.carModel = "unkown";
        this.dailyRate = 0;
        this.rent = false;
        totalCARS++;


    }
    public car (String plateNumber,String carModel,double dailyRate,boolean rent ){
        this.plateNumber = plateNumber;
        this.carModel =carModel;
        if(dailyRate<0){
            this.dailyRate = 0;
        }else {
            this.dailyRate = dailyRate;
        }
        this.rent = false ;
        totalCARS++;
    }

    public String getPlateNumber (){
        return plateNumber;
    }
    public String getModel(){
        return carModel;
    }
    public double getDailyRate(){
        return dailyRate;
    }
    public boolean isRent(){
        return rent;
    }
    public void setDailyRate(double rate){
        if(rate >= 0){
            dailyRate =rate;
        }else {
            System.out.println("car rented successfully");
        }
    }
    public void rent(){
        if(rent == true){
            System.out.println("car is already rented");
        }else{
            rent = true;
            System.out.println("car rented succussfully");
        }
    }
    public void returnCar(){
        rent = false;
        System.out.println("car returned successfully");
    }
    public void displayinfo(){
        System.out.println("plate number:" + plateNumber);
        System.out.println("car model: " + carModel);
        System.out.println("dail rate: " + dailyRate);

        if(rent == true){
            System.out.println("stetus: rented");
        }else{
            System.out.println("stetus: available");
        }
    }
    public static void displaycompanyName(){
        System.out.println("Company Name: " + company);
    }
    public static void displayTotalCars(){
        System.out.println("Totals cars: " + totalCARS);
    }
}
class test{
    public static void main(String[] args){
        car car1 = new car("2000","toyota",25,false);
        car car2 = new car("1900","toyota",15,false);

      //display company name
        car.displaycompanyName();
        System.out.println();

      //display car information
        System.out.println("car 1");
        car1.displayinfo();

        System.out.println();

        System.out.println("car 2");
        car2.displayinfo();
        System.out.println();

        //rent car1
        car1.rent();

        //try to rent car1 again
        car1.returnCar();

        System.out.println();

        //return car1
        car1.returnCar();

        System.out.println();

        //change daily rate
        car2.setDailyRate(30);

        System.out.println("car 2 after changing rate");
        car2.displayinfo();

        //display total cars
        car.displayTotalCars();

    }
}