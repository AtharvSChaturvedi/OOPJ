import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list of numbers (separated by spaces): ");
        String inputLine = scanner.nextLine();
        
        String[] tokens = inputLine.trim().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }

        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nOccurrences:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Occurrence of " + entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
    }
}
