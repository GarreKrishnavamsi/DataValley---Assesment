import java.util.Scanner;
public class divison {
			    public static int findSum(int[] nums) {
			        int sum = 0;
			        for (int num : nums) {
			            if (num % 10 == 0) {
			                sum += num;
			            }
			        }
			        return sum;
			    }
			    public static void main(String[] args) {
			        int[] arr = {100, 52, 43, 99, 42, 40, 91};
			        int sum = findSum(arr);
			        System.out.println("Sum of numbers divisible by 5 and 2 is : " + sum);
			    }
		}
			
