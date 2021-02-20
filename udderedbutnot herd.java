import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cowphabet = scan.nextLine();
		String heard = scan.next();
		int ans = 0;
		for (int i = 1; i < heard.length(); i++) {
			if (cowphabet.contains(Character.toString(heard.charAt(i))) && cowphabet.indexOf(heard.charAt(i)) > cowphabet.indexOf(heard.charAt(i-1))) {
				
			}
			else if (cowphabet.contains(Character.toString(heard.charAt(i)))) {
				ans++;
			}
		}
		System.out.println(ans + 1);
		
	
	}
}
