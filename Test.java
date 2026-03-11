import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class Test {
    

    public static void main(String[] args) {
        int[] lotto = new int[6];
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        System.out.println("로또 번호 6개를 적는중...");

        for(int i = 0;i<6;i++){
            lotto[i]=ran.nextInt(45)+1;
            for(int j=0;j<i;j++){
                if(lotto[i]==lotto[j]){
                    i--;
                }
            }
        }

       /*  for(int i=0;i<5;i++){ 내가해본 중복 거르기 방법
            if(lotto[i]==lotto[i+1]){
                lotto[i]=ran.nextInt(45)+1;
            }
        }
         for(int i=0;i<3;i++){
            if(lotto[i+1]==lotto[i+2]){
                lotto[i]=ran.nextInt(45)+1;
            }
        }
         for(int i=0;i<2;i++){
            if(lotto[i+2]==lotto[i+3]){
                lotto[i]=ran.nextInt(45)+1;
            }
        }
         for(int i=0;i<1;i++){
            if(lotto[i+3]==lotto[i+4]){
                lotto[i]=ran.nextInt(45)+1;
            }
        } */


        System.out.println("로또 번호 출력중...");
        for(int i=0;i<6;i++){
            System.out.print(lotto[i]+" ");
        }
    }
}