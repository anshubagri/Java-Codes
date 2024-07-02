public class VariableAndDatatype {
    public static void main(String[] args){
        boolean isPassed = true; // Stores true or false
        char apple = 'A'; // Stores a single character/letter or ASCII values
        byte marksInMaths = 79; // Stores whole numbers from-128 to 127
        short marksInEnglish = 89; // Stores whole numbers from -32,868 to 32,767
        int age = 20; // Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long marksInAccounts = 85L; // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        String name = "Anshu Singh Bagri";
        float weight = 61.3f; // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits.
        float percentageInTwelfthClass = 85.05f; // Camelcase
        double cgpaInSemesterOne = 8.36d; // Stores fractional numbers. Sufficient for storing 15 decimal digits.
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Weight:"+weight);
        System.out.println("Percentage in 12th:"+percentageInTwelfthClass);
    }
}
// In java writing a variable having 2,3 words we should use Camelcase.
// Camelcase = first word small then all big