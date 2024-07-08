import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        if( age >= 18){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible to Vote")
        ;
        }
    }
}
