public class operators {
    public static void main(String[] args){
        // Arithmetic Operators
        int num1 = 24;
        int num2 = 4;
        int sum = num1+num2;
        int diff = num1-num2;
        int mul = num1*num2;
        int dive = num1/num2;
        int mod = num1%num2;
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: "+sum);
        System.out.println("Difference: "+diff);
        System.out.println("Multiplication: "+mul);
        System.out.println("Division: "+dive);
        System.out.println("Remainder (Module): "+mod);

        // Assignment Operators
        int num3 = 12;
        int num4 = 3;
        num3 += num4; // num3 =  num3+num4 // Same with other arithmetic operators
        System.out.println("Assignment Operators");
        System.out.println(num3);

        // Relational Operators - always return boolean values
        System.out.println("Relational Operators");
        System.out.println(3==5); // return false
        System.out.println(3!=5); // return true
        System.out.println(3>5); // return false
        System.out.println(3<5); // return true
        System.out.println(3>=5); // return false
        System.out.println(3<=5); // return true

        // Logical Operators
        System.out.println("Logical Operators");
        System.out.println(true && true); // true only if both a and b are true
        System.out.println(false || true); // true if either a or b is true
        System.out.println(!false); // true is expression is false and vise versa

        // Increment / Decrement Operator
        int num5 = 12;
        num5++; // num5 = num5+1
        System.out.println("Increment Operators");
        System.out.println(num5);
        int num6 = 12;
        num6--; // num6 = num6-1
        System.out.println("Decrement Operators");
        System.out.println(num6);
    }
}
