public class Car {
   private String name;
   private String brand;
   private int year;
   private int total_distance;

   public Car(String name, String brand, int year, int total_distance) {
       this.name = name;
       this.brand = brand;
       this.year = year;
       this.total_distance = total_distance;
   }
   Car nissan = new Car("Challenger", "Dodge", 2019, 25000);

    public Car () {
    }
    public String getName () {

        return name;
    }
    public void setName (String name) {

        this.name = name;
    }
    public String getBrand () {

        return brand;
    }
    public void setAge (int age) {

        this.brand = brand;
    }
    public int getYear () {

        return year;
    }
    public void setGroup (int year) {

        this.year = year;
    }
    public int getTotal_distance () {

        return total_distance;
    }
    public void setTotal_distance(int total_distance) {

        this.total_distance = total_distance;
    }

    public void trip(int distance) {
        this.total_distance += distance;
    }
}