import java.util.Scanner;
public class SumOfNNumberEvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(i*2);

            System.out.println("The sum of the N even number is "+ sum);
        }

    }
    
}
