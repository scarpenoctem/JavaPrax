package Utils;

import java.util.Arrays;
import java.util.List;

public class IntUtil {


	public static Boolean isPrime(int x) {
		if(x >= 2) {
			for(int i = 2; i < x; i++) {
				if(x % i == 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	public static void printFirstXPrimeNumbers(int x) {
		int number = 0;
		while(x != 0) {
			if(isPrime(number)) {
				System.out.print(number + " ");
				number++;
				x--;
			} else {
				number++;
			}
		}
		System.out.println("");
	}
	
	public static Boolean containsDuplicate(List list) {
		return null;
	}
	
	public static Boolean containsDuplicate(int[] array) {
		Arrays.sort(array);
		for(int i = 0; i < array.length; i++) {
			
		}
		return null;
	}
	
	public static List<Integer> removeDuplicates(List list) {
		return null;
	}
	
	public static int[] removeDuplicates(int[] array) {
		return null;
	}
}
