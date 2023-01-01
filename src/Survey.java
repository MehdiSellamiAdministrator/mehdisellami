import java.util.Scanner;

public class Survey {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome. Thank you for tasking the Survey");

        byte counter = 0;

        counter++;
        System.out.println("\nQuestion " + counter + ": What is your name?");
        String name = scanner.nextLine();

        counter++;
        System.out.println("\nQuestion " + counter + ": How much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();

        counter++;
        System.out.println("\nQuestion " + counter + ": How much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();

        counter++;
        System.out.println("\nQuestion " + counter + ": How many times a week do you buy coffee?");
        byte coffeeAmount = scanner.nextByte();

        counter++;
        System.out.println("\nQuestion " + counter + ": How many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();

        System.out.println("\nThank you " + name + " for answering all " + counter + " questions.");
        System.out.println("Your fast food expenses are " + (foodPrice/coffeePrice) + " times your coffee expenses");
        System.out.println("Weekly, you spend $" + (coffeeAmount * coffeePrice) + " on coffee");
        System.out.println("Weekly, you spend $" + (foodAmount * foodPrice) + " on food");

        scanner.close();
    }
}
