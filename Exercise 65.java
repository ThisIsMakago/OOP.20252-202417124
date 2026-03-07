import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("Enter size of array: ");
		int size = input.nextInt();
		int[] array = new int[size];
		System.out.print("Enter array: ");
		for(int i = 0; i < size; i++) {
			array[i] = input.nextInt();
			sum += array[i];
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++) {
				if(array[j] < array[i]) {
					int temp;
					temp = array[i];
					array[i]= array[j];
					array[j] = temp;
				}
			}
		}
		double average = sum / size;
		
		System.out.println("Sorted array: " + Arrays.toString(array));
		System.out.println("Sum of array is: " + sum);
		System.out.print("Average value of array is: " + average);
	}

}
