public class continueStatements {
    public static void main(String[] args) {
        for (int i=0 ; i<=5 ; i++){
            if( i== 3 ){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("End!");
    }
}
