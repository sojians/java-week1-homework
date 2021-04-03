
public class App {

	public static void main(String[] args) {
		// Initializing and setting variables
		double itemPrice = 234.00;
		double moneyInWallet = 600.00;
		int numberOfFriends = 3;
		int ageInYears = 60;
		String firstName = "Daniel";
		String lastName = "Wright";
		char middleInitial = 'E';
		
		// New amount of money in wallet after buying the item
		// Setting variable using subtraction operation
		moneyInWallet = moneyInWallet - itemPrice;
		System.out.println("I had to spend $" + itemPrice + " and was left with only $" + moneyInWallet + " in my wallet... T_T");
		
		// Number of friends you’ve made each year based on your age variable 
		// and your number of friends variable
		// Establishing first variable madeFriends and what it is equal to with the division operation, 
		// also casting double on the answer to get a proper decimal number
		double madeFriends = ((double) numberOfFriends) / ageInYears;
		System.out.println("I have made about " + madeFriends + " friends over the " + ageInYears + " years I have lived.");
		
		// Full name based on first name, middle initial, and last name
		// Establishing second variable fullName and what it is equal to using concatenation
		String fullName = firstName + " " + middleInitial + " " + lastName;
		System.out.println("Hi, my name is " + fullName + ".");
		
	}

}
