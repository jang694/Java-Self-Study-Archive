import java.util.Scanner;
public class Test {
    

    public static void main(String[] args) {
        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum=0;
        

        System.out.println("5명의 학생 점수를 입력하세요.");

        for(int i=0;i<5;i++){
            System.out.print((i+1)+"번 학생");
            scores[i]=sc.nextInt();
            sum += scores[i];
        }
        int max=scores[0];//sc.nextInt()아래 있는 이유는 위에 있으면 scores[0]이 계속 0으로 남아있어서
        int min = scores[0];//뭐를 넣든 최솟값이 0으로 나옴

        for(int i = 1;i<5;i++){
            if(max < scores[i]){
            max = scores[i];
            }
        }
        
        for(int i=1;i<5;i++){
            if(min > scores[i]){
                min = scores[i];
            }
        }
        
        System.out.println("------------------");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+"번 학생"+scores[i]);
        }
        double avg = sum/5.0;
        System.out.println("합계:"+sum);
        System.out.println("평균 값:"+avg);
        System.out.println("최대값:"+(max));
        System.out.println("최소값:"+(min));
        
    }
}