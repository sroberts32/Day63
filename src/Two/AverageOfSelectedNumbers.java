package Two;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop.");

        while(true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }
    
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String response = scanner.nextLine();
        if (response.equals("n")) {
            double negativeNums = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(NegNums -> NegNums < 0)
            .average()
            .getAsDouble();
            System.out.println("Average of negative numbers: " + negativeNums);
        } else if (response.equals("p")) {
            double positiveNums = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(PosNums -> PosNums > 0)
            .average()
            .getAsDouble();
            System.out.println("Average of positive numbers: " + positiveNums);
        } else {
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
                System.out.println("Average of all numbers: " + average);
        }
scanner.close();
}
}
