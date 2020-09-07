import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		// Pirminiu skaiciu programele, dalinasi is 1 arba is saves, o sk 1 nera pirminis, prasideda nuo dvieju.
		
		
		// Metodas (ar pirminis) do or while.

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter integer");
		// Skaiciu ivedimas
		int number = scanner.nextInt();
		
		boolean isPrimary = isPrimary(number);
		// Spausdinsime skaicius.
		System.out.println(isPrimary);
		
	}

	private static boolean isPrimary(int number) {
		
//		isTheRemainder = number % divider == 0;


		boolean isTheRemainder = true;
		int divider = 2;
		
		while (isTheRemainder && divider < number) {
		
// Tas pats kaip ir trumpiau zemiau.
//			if(number % divider == 0) {
//				
//				isTheRemainder = false;
//			} else {
//				isTheRemainder = true;
//			}
			isTheRemainder = (number % divider != 0 );
				
			divider++;		
		} 
		
		return isTheRemainder;
	}

}
