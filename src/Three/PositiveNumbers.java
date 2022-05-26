package Three;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop.");
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(Integer.valueOf(row));
        }
        List<Integer> positiveNums = positive(inputs);
        System.out.println(positiveNums);
    scanner.close();
    }

    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> positiveNums = numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return positiveNums;
    }

}