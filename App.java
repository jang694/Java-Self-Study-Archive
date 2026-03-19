
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
       /*  int score = 95;
        if(score > 60){
            System.out.println("합격입니다.");
        }
        else{
            System.out.println("불합격입니다.");
        }

        if(score >= 90){
            System.out.println("A등급");
        }
        else if ( score >= 80 ){
            System.out.println("B등급");
        }
        else if ( score >=70 ){
            System.out.println("C등급");
        }
        else{
            System.out.println("F등급");
        }

        if(0 == score){
            System.out.println("zero");
        }
        
        String str = new String("abc"); //"abc"랑 new String("abc")의 주소는 다르기 때문에 
        String str2 = new String("abc");
        String str2 = str;
        if(str.equals("abc")){ // 레퍼런스는 == 쓰면 주소끼리 비교 ().equls 쓰면 내용끼리 비교)
            System.out.println("str == abc");
        }
        else{
            System.out.println("str != "abc");
        }


        System.out.println("종료됩니다."); 

        int score = 99;
        String grade;
        if (score >= 90){
            grade = "A";
            if(score >= 98){
                grade += "+";
            }
            else if (score < 94){
                grade += "-";
            }
        }
        else if (score >= 80){
            grade = "B";
            if(score >= 88){
                grade += "+";
            }
            else if (score < 84){
                grade += "-";
            }
        }
        else{
            grade = "C";
        }
        System.out.println(grade);

        int num = 3;
        switch (num) {
            case 1:
            case 7:
                System.out.println("SK");
                break;
            case 6:
            case 8:
                System.out.println("KTF");
                break; // break가 없으면 KTF랑 LG 둘다 출력됨.
            case 9:
                System.out.println("LG");
                break;
            default:
                System.out.println("UNKNOWN");
                break;
        }

            int score = 85;
            char grade;
            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
                    break;
            }
            System.out.println(grade);
        
        int num = 0;
        for(int i = 0;i<10;i++){
            num = (int)(Math.random() * 10);
            System.out.println(num);
        }

        int sum = 0;
        int i;

        for(i=1;i<=10;i++){
            sum += i; //sum = sum + i;
        }
        System.out.println(i-1+"까지의 합:"+sum);

        //별 반대로 세우기
        for(int i=0;i<5;i++){
            for(int k=3;k>i-1;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
            //별문제 시험문제
        for(int i=0;i<3;i++){
            for(int k=1;k>i-1;k--){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }*/
         int input=0;
         do{
            try {
                input =System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }  
            System.out.println((char)input);

         }while(input != -1 && input != 'x');
        
            }
        
       }
         
        
    }
}
