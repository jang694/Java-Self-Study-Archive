    public class App {
        public static void main(String[] args) throws Exception {
            Car car = null;
            FireEngine fe = new FireEngine();
            FireEngine fe2 = null;

            fe.water();
            car = fe;   //car = (car)fe; 조상 <- 자손
        //  car.water(); car가 water를 가지고 있지 않아서 오류
            fe2 = (FireEngine)car; // 자손 <- 조상
            fe2.water();

        

    }
}

class Car {
    String color;
    int door;

    void drive(){
        System.out.println("drive");
    }
    void stop(){
        System.out.println("stop");
    }

}

class FireEngine extends Car {
    void water(){
        System.out.println("water");
    }
}

class Ambulance extends Car {
    void siren(){
        System.out.println("siren");
    }
}



