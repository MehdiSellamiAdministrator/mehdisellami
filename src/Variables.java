public class Variables {
    public static void main(String[] args){
        // Intro to Variables
        byte peopleOnBus = 120;
        short indexNumber = 30405;
        int people = 100_000;
        long viewsCount = 100_000_000_000_000L;
        char firstName = 'M';
        float price = 10.99F;
        double timeToFirstLoad = 1.34769898088766;

        // Printing Values
        System.out.println(peopleOnBus);
        System.out.println(indexNumber);
        System.out.println(people);
        System.out.println(viewsCount);
        System.out.println(firstName);
        System.out.println(price);
        System.out.println(timeToFirstLoad);

        // Setting variables equal to each other
        byte busTickets = peopleOnBus;
        System.out.println(busTickets);
    }
}
