    public class App {
        public static void main(String[] args) throws Exception {
            Unit[] u = new Unit[3];
            u[0] = new Marine();
            u[1] = new Tank();
            u[2] = new Dropship();

            for(int i=0; i<u.length; i++){
                u[i].move(0, 0);
            }

    }
}
abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("이동 정지 !");
    }
    
}

class Marine extends Unit{
    void move(int x, int y){
        System.out.println("걸어서 이동 합니다.");
    }
}

class Tank extends Unit{
    void move(int x, int y){
        System.out.println("바퀴로 이동 합니다.");
    }
}

class Dropship extends Unit{
    void move(int x, int y){
        System.out.println("날아서 이동 합니다");
    }
}




