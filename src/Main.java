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

            // Task 1
            double purchasePrice = 100.50;
            double salesTax = purchasePrice * 0.05;
            System.out.println("\nTask 1:");
            System.out.printf("Purchase price: $%.2f%n", purchasePrice);
            System.out.printf("5%% sales tax: $%.2f%n", salesTax);

            // Task 2
            double springMaintenance = 900.00;
            double summerMaintenance = 750.00;
            double fallMaintenance = 400.00;
            double winterMaintenance = 1200.00;
            double yearlyMaintenance = springMaintenance + summerMaintenance
                   + fallMaintenance + winterMaintenance;

            System.out.println("\nTask 2:");
            System.out.printf("Spring maintenance: $%.2f%n", springMaintenance);
            System.out.printf("Summer maintennce: $%.2f%n", summerMaintenance);
            System.out.printf("Fall maintenance: $%.2f%n", fallMaintenance);
            System.out.printf("Winter maintenence: $%.2f%n", winterMaintenance);
            System.out.printf("Total yearly maintennce: $%.2f%n", yearlyMaintenance);

            // Task 3
            double creditCardBalance = 5000.00;
            double interestRate = 0.17;

            double firstMonthInterest = creditCardBalance * interestRate;
            double balanceAfterOneMonth = creditCardBalance + firstMonthInterest;

            double secondMonthInterest = balanceAfterOneMonth * interestRate;
            double balanceAfterTwoMonths = balanceAfterOneMonth + secondMonthInterest;

            System.out.println("\nTask 3");
            System.out.printf("Starting credit card balence: $%.2f%n" , creditCardBalance);
            System.out.printf("Interest at one month: $%.2f%n" , firstMonthInterest);
            System.out.printf("Balance after one month: $%.2f%n" , balanceAfterOneMonth);
            System.out.printf("Interest at two months: $%.2f%n" , secondMonthInterest);
            System.out.printf("Balence after two months: $%.2f%n" , balanceAfterTwoMonths);

            // Task 4
            int numToExamine = 23;
            int remainder = numToExamine % 2;

            System.out.println("\nTask 4");
            System.out.println("Number examined: " + numToExamine);
            System.out.println("Modulo 2 is: " + remainder);
            System.out.println("Since the value is 1, means that the number is odd.");
        }
}