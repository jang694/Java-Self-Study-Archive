import java.util.Random;
import java.util.Scanner;

public class Test {
    

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char x;
       x = sc.nextLine().charAt(0);
       if(x>='a'&&x<='z'){//대문자를 소문자로
        System.out.println((char)(x-32));
       }
       else if(x>='A'&&x<='Z'){//소문자를 대문자로
        System.out.println((char)(x+32));
       }
      

    }
}
