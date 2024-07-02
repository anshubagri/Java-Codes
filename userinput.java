import java.util.Scanner;
public class userinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length:");
        int len = sc.nextInt(); // taking integer as input

        System.out.print("Enter the width:");
        int wid = sc.nextInt();

        int area = len*wid;
        System.out.println("Area of rectangle: "+area);

        sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // taking string as input
        System.out.println("Hello, "+name);
        sc.close();
    }
}
