import java.util.*;

public class NumberStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readNumbers(scanner);
        System.out.println("List of Numbers: " + numbers);
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
        int highest = findHighest(numbers);
        int lowest = findLowest(numbers);
        System.out.println("Highest Number: " + highest);
        System.out.println("Lowest Number: " + lowest);
        List<Integer> oddNumbers = filterEvenNumbers(numbers);
        System.out.println("Odd Numbers: " + oddNumbers);

        scanner.close();
    }

    private static List<Integer> readNumbers(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers (enter a non-integer to finish):");

        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        return numbers;
    }

    private static double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }

    private static int findHighest(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    private static int findLowest(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    private static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}
