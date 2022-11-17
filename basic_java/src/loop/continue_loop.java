package loop;

public class continue_loop {
	public static void main (String[] args) {
		int i = 1;
		
		do {
			if (i == 5) {
				i++;
				continue;
			} 
			System.out.println(i);
			i++;
		} while(i <= 20);
	}
}