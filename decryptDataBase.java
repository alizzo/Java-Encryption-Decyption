/* 

*/

import java.util.*;
import java.io.*; 


import java.util.Scanner;
public class decryptDataBase{
	public static void main(String[] args){

		Decryption decrypt = new Decryption();
		Scanner input = new Scanner(System.in);
		System.out.print("password: ");
		String adminPass = input.next();
	
	    try(Scanner scan = new Scanner(new File("text.txt")).useDelimiter(";")){

			ArrayList<String> data = new ArrayList<>() ;
			while(scan.hasNext()){
			    data.add(scan.next());
			    data.toArray();  
			}
				
			for(int i= 0; i < data.size(); i++){
					int j = data.get(i).indexOf(':')+1;
					int k = data.get(i).indexOf('=')+2;

					int l = data.get(i).lastIndexOf('=');
					int m = data.get(i).indexOf('=')+3;



					String name = data.get(i).substring(0, j);
					String userName = data.get(i).substring(j, k);
					String userPass = data.get(i).substring(m-1, l+1);  // out of index? throw exception?

					//System.out.println(name);

					//System.out.println(data.get(i));
					//System.out.println(userAccount);
					String plaintextName = decrypt.decrypt(userName, adminPass);
					String plaintextPass = decrypt.decrypt(userPass, adminPass);

					System.out.println(name + " " + plaintextName +" " +plaintextPass);			
				}
			}
	

	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	
	}
}


 