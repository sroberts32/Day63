package Five;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Input string, leave field blank to stop.");

        while(true) {
            String row = scanner.nextLine();
            if (row.equals("")) {
                break;
            }
            inputs.add(row);
        }
    
        String input = inputs.stream()
                .reduce("", (previousString, row) -> previousString + row + "\n");

    System.out.println(input);
scanner.close();
}

}