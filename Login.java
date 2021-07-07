import java.io.*; 
public class Login{ //implements java.io.Serializable  
	

	private String userName;
	private String password;  


	public Login(){  
	}


	public Login(String userName, String password){   //second constructor
		this.userName = userName;
		this.password = password;
	}
/*
	public Login(String userName, String password){   
		this.userName = userName;
		this.password = password;
	}
*/
	public String getUser(){   
		Encryption encrypt = new Encryption();
		String encryptedUser = Encryption.encrypt(userName);
			return encryptedUser;
	}

	public String getPass(){  
		Encryption encrypt = new Encryption();
		String encryptedPass = Encryption.encrypt(password);
		return encryptedPass;
	}



	public boolean specialCharInPassValid(String password){
		int counter = 0;
		

		for(int i = 0; i < password.length() ; i++){
			for(int j =25; j <= 96; j++){
				char ch = (char)j;
				if(password.charAt(i) == ch){
					return true;
				}
				counter++;
			}
			
		}
		return false;
	}
	/*
	public boolean register(Login login) {
		if (firstName != null && lastName != null) {
						return true;
				}
			return false;
		
	}
*/
}