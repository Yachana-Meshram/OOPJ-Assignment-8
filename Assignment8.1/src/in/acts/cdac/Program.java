package in.acts.cdac;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);

	public static void acceptRecord(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter Value: ");
			arr[index] = sc.nextInt();
		}

	}

	public static void printRecord(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void sum(int[] arr) {
		int result = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		System.out.println("Sum of Array is : " + result);
	}

	public static void avg(int[] arr) {
		int average = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4]) / arr.length;
		System.out.println("Average of Array is : " + average);
	}

	public static int larger(int[] arr) {
		int max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
		System.out.println("Largest number in the array: " + max);
		return max;
	}
	
	public static int small(int[] arr) {
		int min = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
		System.out.println("Smallest number in the array: " + min);
		return min;
	}
	public static void sort(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Sort array in ascending order:");
		for(int num : arr) {
			System.out.print(num+" ");
			
		}
		return;
	}
	
	

	public static void main(String[] args) {
		int[] arr = new int[5];
		Program.acceptRecord(arr);
		Program.printRecord(arr);
		Program.sum(arr);
		Program.avg(arr);
		Program.larger(arr);
		Program.small(arr);
		Program.sort(arr);

	}

}
