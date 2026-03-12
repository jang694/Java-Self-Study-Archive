import java.util.Random;
import java.util.Scanner;

public class Test {
    

    public static void main(String[] args) {
       float pi = 3.141592f;
       float shortpi = (int)(pi*1000)/1000f;
       System.out.println(shortpi);
       //float pi를 int로 바꾼 뒤 다시 float으로 바꾼 예제
       float pi2 = 3.141592f;
       float shortpi2 = Math.round(pi2*1000)/1000f;
       System.out.println(shortpi2);
       //Math.round 반올림하는 함수

       int result = 8 << 2;
       System.out.println(result);
       //8 << 2 == 8 * 2의 제곱
       System.out.println(3|5);
       System.out.println(3&5);
       System.out.println(3^5);
       //비트 연산자 예시 (|,&,^)

       char x ='j';
       System.out.println(x>='a'&&x<='z');
       System.out.println((x>='a'&&x<='z')&&(x>='A'&&x<='Z'));

       
    

    }
}