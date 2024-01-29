package week03Package;

public class week03homework {

	static boolean passwordChecker(String password) {
		
           	if ((password.length() >= 8) && (password.contains("!") ||  password.contains("$") || password.contains("%") || password.contains("&"))) {
            return true;
        } 
            return false;
		}

		
/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/

	public static void main(String[] args) {
		String password = "Password1";
        boolean meetsRequirement = passwordChecker(password);
		if (meetsRequirement) {
		    System.out.println(password + " meets the requirements.");
		} else {
		    System.out.println(password + " does not meet the requirements.");
		}
	}
}