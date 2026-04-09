import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        Product cola = new Product("콜라", 2000, 10); //콜라라는 객체를 생성
        System.out.print("소지금을 입력하시오>> ");
        int Money = sc.nextInt(); //소지금을 받기 위해 스캔
        Wallet myWallet = new Wallet(Money);

        while (true) {
            System.out.println("\n--- 현재 상태 ---");
            System.out.println("상품: " + cola.getName() + " | 가격: " + cola.getPrice() + "원 | 재고: " + cola.getStock());
            System.out.println("내 잔액: " + myWallet.getMyMoney() + "원");
            System.out.print("구매하실 수량을 입력하세요 (0 입력 시 종료)>> ");

            int buyStock = sc.nextInt();
            if (buyStock == 0){
                break;
            }

            int totalPrice = cola.getPrice() * buyStock;

            if(cola.sell(buyStock)){
                if(myWallet.pay(totalPrice)){
                    System.out.println(buyStock + "개 구매성공!");
                }
                else{
                    System.out.println("잔액이 부족합니다");
                }
            }
            else{
                System.out.println("재고가 부족합니다.");
            }
        }
        System.out.println("이용해주셔서 감사합니다.");
    }
} 
class Product{
    private String name; //상품 이름
    private int price; //상품 가격
    private int stock; //상품 재고

    public Product(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public boolean sell(int buyStock){ //메서드를 호출한 쪽에서 작업의 성공 여부를 즉각적으로 확인하고, 그에 따른 예외 처리를 하기 위해 boolean 사용함.
        if (buyStock <= stock){
            stock -= buyStock;
            return true;
        }
        return false;
    }
    public String getName(){ //get을 사용한 이유는 name,price,stock을 private으로 설정했기 떄문.
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
}

class Wallet{
    private int myMoney;

    public Wallet(int money){
        myMoney = money;
    }

    public boolean pay(int totalPrice){
        if(myMoney >= totalPrice){
            myMoney -= totalPrice;
            return true;
        }
        return false;
    }
    public int getMyMoney(){
        return myMoney;
    }
    
}
