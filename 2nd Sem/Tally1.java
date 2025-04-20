import java.util.Scanner; 

public class Tally1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] frequency = new int[n];

        for (int i = 0; i < n; i++) {
            if (frequency[i] != 0) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    frequency[j] = -1;
                }
            }
            frequency[i] = count;
        }

       
        int frequent = 0;
        for (int i = 0; i < n; i++) {
            if (frequency[i] > frequent) {
                frequent = frequency[i];
            }
        }

   
        System.out.println("The most frequent number(s):");
        for (int i = 0; i < n; i++) {
            if (frequency[i] == frequent) {
                System.out.println("Number: " + numbers[i] + " with frequency: " + frequent);
            }
        }

        // Close the scanner
        scanner.close();
    }
}