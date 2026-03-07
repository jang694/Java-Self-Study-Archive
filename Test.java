import java.util.Scanner;
import java.util.Random;
public class Test {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(100)+1;
        int guess = 0;
        int count = 0;
        System.out.println("기회는 총 5번 입니다(1~100 사이).");
        while (count != 5) {
            System.out.println("숫자를 입력하시오>>");
            guess =sc.nextInt();
            if (guess == answer) {
                System.out.println("정답입니다.");
                break; 
            }
            else if(guess < answer){
                System.out.println("틀렸습니다. UP하세요");
            }
            else if(guess > answer){
                System.out.println("틀렸습니다. DOWN하세요");
            }
            
            count++;
            if(count==5){
                System.out.println("가능 횟수를 초과하였습니다.");
            }
        }
        sc.close();
    }
}
