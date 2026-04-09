    public class App {
        public static void main(String[] args) throws Exception {
           child c = new child();
           c.method();
        }
        

    }
    class Parent{
        int x = 10;

    }

    class child extends Parent{
        //int x=20; 있으면 this.x는 20 super.x는 10이 나온다 만약 없으면 둘다 10이 나온다
        void method(){
            System.out.println("x=" + x);
            System.out.println("this.x=" + this.x);
            System.out.println("super.x=" + super.x);
        }
    }
   




