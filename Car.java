class Vehicle{
    protected String brand = "Toyota";
    public void fuel(){
        System.out.println("runs on petrol");

    }
}
class Car extends Vehicle{
    private String modelName="Audi";
    public static void main(String[] args) {
        Car myCar =new Car();
        myCar.fuel();
        System.out.println(myCar.brand+ " " +myCar.modelName);
    }

}