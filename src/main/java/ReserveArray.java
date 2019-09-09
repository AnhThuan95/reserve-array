import java.util.Scanner;

public class ReserveArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        int[] array;
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++ ) {
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Property list: ");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println();

        for (int i = 0;i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("Reserve array: ");
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}
