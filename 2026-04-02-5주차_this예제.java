
public class App {
    public static void main(String[] args) throws Exception {
     // Car c = new Car("red","auto",4);
      Car c = new Car();
      System.out.println(c.color + "," + c.gearType + "," + c.door);
    }
    

}
class Car{
    String color;
    String gearType;
    int door;
    Car(){
        this("red","auto",4); //this는 무조건 첫번째 줄에서만
    }
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}


