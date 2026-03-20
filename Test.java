import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int myMoney = 0; 
        int colaPrice = 2000; 
        int colaStock = 10; 
        int buyStock = 0; 
        int totalStock = 0; 
        int totalPrice = 0; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("소지금을 입력하세요>> ");
        myMoney = sc.nextInt();

        while (true) {
            System.out.print("주문하실 콜라 갯수를 입력하세요>>");
            buyStock = sc.nextInt();

            if(buyStock>colaStock){
                System.out.println("구매를 실패하셨습니다.");
                System.out.println("재고부족/현재 재고:"+colaStock);
                break;
            }
            if(myMoney<(buyStock*colaPrice)){
                System.out.println("소지금이 부족합니다.");
                break;
            }
            System.out.println(buyStock+"개를 구매하셨습니다.");
            colaStock -= buyStock;
            myMoney -= (buyStock*colaPrice);
            totalStock += buyStock;

            System.out.println("현재 총 " + totalStock + "개 보유 중입니다.");
            System.out.println("남은 소지금: " + myMoney + "원");
        }   
    }
} 