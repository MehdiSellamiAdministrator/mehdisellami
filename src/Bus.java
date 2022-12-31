public class Bus {
    public static void main(String[] args){
        String sentence = "Number of passengers: ";
        int passengers = 0;
        int station1 = 9;
        int station2 = 5;
        int stationFinal = 4;

        passengers += station1;
        System.out.println(sentence + passengers);
        passengers -= station2;
        System.out.println(sentence + passengers);
        passengers -= stationFinal;
        System.out.println(sentence + passengers);

        sentence = "end of shift";
        System.out.println(sentence);
        // Or: System.out.println("end of shift");
    }
}
