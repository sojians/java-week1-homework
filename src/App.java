
public class App {

	public static void main(String[] args) {
		// Establishing variables
		double itemPrice = 234.00;
		double moneyInWallet = 600.00;
		int numberOfFriends = 3;
		int ageInYears = 60;
		String firstName = "Daniel";
		String lastName = "Wright";
		char middleInitial = 'E';
		
		// How much money is in my wallet after buying the item
		moneyInWallet = moneyInWallet - itemPrice;
		System.out.println("I had to spend $" + itemPrice + " and was left with only $" + moneyInWallet + " in my wallet... T_T");
		
		// Establishing first variable madeFriends and what it is equal to
		int madeFriends = ageInYears + numberOfFriends;
		System.out.println("In my " + ageInYears + " years of life, I have made " + madeFriends + " friends.");
		
		// Establishing second variable fullName and what it is equal to
		String fullName = firstName + " " + middleInitial + " " + lastName;
		System.out.println("Hi, my name is " + fullName + ".");
		
	}

}
