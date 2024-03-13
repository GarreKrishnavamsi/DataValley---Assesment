import java.util.Scanner;
public class oddchar {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        String str  = sc.nextLine();
	        for (int i = 0; i < str.length(); i++) {
	        	char ch = str.charAt(i);
            if (i % 2 != 0 && ch != ' ') {
	                System.out.print(ch);
	            }
	        }
	    }
	}
