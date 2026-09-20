public class Main {
        public static void main(String[] args) {

            // Integer variables
            int intOperandA = 1;
            int intOperandB = 3;
            int intSum = 7;
            int intProduct = 9;
            int intDifference = 12;
            int intQuotient = 14;
            int intModulo = 17;

           // Double variables
            double doubleOperandA = 3.25;
            double doubleOperandB = 4.29;
            double doubleSum = 5.51;
            double doubleProduct = 7.56;
            double doubleDifference = 8.29;
            double doubleQuotient = 11.5;

            // integer arithmtic
            intSum = intOperandA + intOperandB;
            System.out.println("The sum using ints of " + intOperandA + intSum);

            intProduct = intOperandA * intOperandB;
            System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);

            intDifference = intOperandA - intOperandB;
            System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);

            intQuotient = intOperandA / intOperandB;
            System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);

            intModulo = intOperandA % intOperandB;
            System.out.println("The modulo using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);

            // double arithmetic
            doubleSum = doubleOperandA + doubleOperandB;
            System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);

            doubleProduct = doubleOperandA * doubleOperandB;
            System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);

            doubleDifference = doubleOperandA - doubleOperandB;
            System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);

            doubleQuotient = doubleOperandA / doubleOperandB;
            System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);

            // variable practice
            int numberOfKids = 3;
            boolean isRaining = false;
            double gasPrice = 5.20;
            int favoriteNumber = 13;
            double shoeSize = 11.5;
            int birthMonth = 9;
            String fullName = "Daniel Owens";

            System.out.println("\nVariables practice:");
            System.out.println("Number of kids: " + numberOfKids);
            System.out.println("Is it raining?" + isRaining);
            System.out.println("Price of a gallon of gas: $" + gasPrice);
            System.out.println("Favorite number: " + favoriteNumber);
            System.out.println("Shoe size: " + shoeSize);
            System.out.println("Birth month: " + birthMonth);
            System.out.println("Full name: " + fullName);

    }
        }