import java.util.Random;
import java.util.Scanner;

public class Test {
    

    public static void main(String[] args) {
        //십진수->이진수 변환기
       Scanner sc = new Scanner(System.in);
       int a = 0;
       int b = 0;
       int c = 0;
       int count = 0;
       System.out.print("이진수로 변환활 숫자를 입력하시오>>");
       a = sc.nextInt();
       while (a  > 0) {//a/2>0이 안되는 이유는 a가 1일때 1/2 즉 0.5니깐 int에 적용하면 0이므로 0>0은 (false)여서 반복문 종료됨
        b = a / 2;
        c= a % 2;
        a = a/2;//처음에는 b=a/2만 적었지만 그러면 안되는 이유는 b는 작아지는데 a는 그대로 유지하기에 a도 같이 작아져야 하기 때문
        if(c == 1){
            ++count;//1이 몇개인지 세는 코드
        }
        System.out.print(c);/1011 이면 1101로 출력됨
       }
       System.out.println();
       System.out.println(count+"개");
    }   
}
