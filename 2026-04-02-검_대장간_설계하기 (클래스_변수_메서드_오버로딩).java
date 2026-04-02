
public class App {
    public static void main(String[] args) throws Exception {
        yodo yd = new yodo();

        System.out.println("요도 만든 사람의 이름은 " + yodo.maker);
        yd.slash();
        yd.name = "엔텐";
        yd.power = 100;
        System.out.println(yd.name + yd.power);
        yd.slash("쿠로");
       
    }
    

}
class yodo{ //yodo란 검의 종류이다.
    String name;
    int power;

    static String maker; {maker = "쿠니시게";}

    void slash(){
        System.out.println("이름 없는 참격!");
    }
    void slash(String skillName){
        System.out.println(skillName + "(으)로 배었다!");
    }
}




