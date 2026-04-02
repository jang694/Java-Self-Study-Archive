
public class App {
    public static void main(String[] args) throws Exception {
      Employee em1 = new Employee("사카모토", "권총", 50000);

      Employee em2 = new Employee("신", "초능력");

      Employee em3 = new Employee("루");

      em1.printInfo();
      em2.printInfo();
      em3.printInfo();

    }
    

}
class Employee{
    String name;
    String weapon;
    int salary;

    Employee(String name, String weapon, int salary){
        this.name = name;
        this.weapon = weapon;
        this.salary = salary;
    }

    Employee(String name, String weapon){
        this(name, weapon, 10000);
    }

    Employee(String name){
        this(name, "맨손");
    }

    void printInfo(){
        System.out.println("이름 " + name + "|" + "무기 " + weapon + "|" + "시급 " + salary);
    }

}




