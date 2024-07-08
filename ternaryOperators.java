public class ternaryOperators {
    public static void main(String[] args){
        int num1 = 12;
        int num2 = 24;
        int num3 = 18;
        int max = 0;
        max = (num1>num2) ? (num1>num3) ? num1: num3 : (num2>num3) ? num2 : num3;
        System.out.println(max+" is the largest.");
    }
}
