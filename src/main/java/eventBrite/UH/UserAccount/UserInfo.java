package eventBrite.UH.UserAccount;

public class UserInfo{

	private String uName; 
	private String fName;
	private String lName;
	private char pWord;

public UserInfo(String username, String firstname, String lastname, char password) { //constructor

		uName = username;
		pWord = password;
		fName = firstname;
		lName = lastname;
	}
}
