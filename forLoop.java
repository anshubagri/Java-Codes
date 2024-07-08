import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want table of: ");
        int num = sc.nextInt();
        System.out.println("Printing the table:");
        for( int i=1 ; i<=10 ; i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
