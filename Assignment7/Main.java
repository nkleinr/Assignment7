import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // Method 1: Create an array of random integers
    public static int[] createRandomArray(int arrayLength) {
        Random random = new Random();
        int[] array = new int[arrayLength];
        
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(101); // Random number between 0 and 100
        }
        return array;
    }

    // Method 2: Write an array to a file
    public static void writeArrayToFile(int[] array, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int number : array) {
                writer.write(Integer.toString(number));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method 3: Read integers from a file into an array
    public static int[] readFileToArray(String filename) {
        List<Integer> list = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    // Method 4: Sort the array using Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Main method: Handle user input and call other methods
    public static void main(String[] args) {
        // Assuming you will handle the input logic here as mentioned before
        System.out.println("Main method running...");
    }
}
