Encryption using Java


ABSTRACT

This paper details the research and development of my final project, encryption using the java language. Encryption is the process of encoding information by converting the original ‘plaintext’ representation into an unreadable jumble of numbers and characters, known ascyphertext. In java, there are software packages dedicated to the security of applications, such as java.security and javax.crypto. (Oracle Documents) My final project uses both security packages and implements the one-way hashing function known as Secure Hashing Algorithm (SHA), as well as the symmetrically encryption/decryption standard known as Advance Encrxtyptions Standard (AES). 

I have created six classes — each with a specific function — to create, store and verify encrypted information. Accompanying this final writeup is a UML diagram (see Figure 1) that demonstrates an example of a user login account and the (1) passing of an encrypted password to a text file for a new user and, (2) checking a user’s entry against the text file to verify credentials. The UML diagram also depicts decryption of the database in use for administrative, e.g. testing, purposes. Ultimately, my project represents a simplified, everyday practice in cybersecurity with the intent to prevent data breaches in the healthcare industry.
  





REQUIREMENTS (CYBER THREATS)

Cybersecurity is a global issue and an increasingly important topic given the growth of IoT devices (e.g. routers and iPhones) within the past 10 years. IoT devices serve as an entry point for cyber threats. They are quickly mass made and deployed to a wide audience, without the proper encrypted properties in place to protect personal and sensitive information. According to Norton Life Lock, there were 3,800 publicly disclosed data breaches in U.S. alone with 4.1 billion records exposed. (Rafter) Most application systems start with a simple account that accepts a username and password to enter. For my final project, I have decided to simulate SHA hash encryption by encoding a password that sends the cyphertext to a text file. In doing so, I hope to prevent compromised sensitive information, e.g. passwords, and data breaches. 


The six classes I used to accomplish my goal of passing encrypted passwords to a text file using java.security package, SHA and AES are as follows:

(1)	A class to create users; 
(2)	A class to create a username and password for the user class;
(3)	A class to encrypt the username and password;
(4)	A class to encrypt the username and password with AES using SHA; 
(5)	A class to compare the encrypted text from user input to a database containing hash encrypted strings;
(6)	A class to decrypt the database with an existing administrator’s password.

USER MANUAL & DETAILED SYSTEM DESCRIPTION

I wanted to build a final product with practical use. I am interested in creating phone applications tailored for the healthcare industry. Mobile devices equipped with the Android mobile operating system can be programmed in the java language using Android Studio software. Generally, the starting point of most applications’ interfaces begins with a username and password. The client enters an encrypted password that is sent over the internet to a database. The SHA algorithm, known as a one-way process, generates an encrypted string that is then sent to a database table, such as a MySQL database. The hash is compared to the password to validate access into the application. Once the hash is generated and stored in the database, it cannot be converted back to the original password unless the key is provided. (Gupta) AES encryption is symmetric and can in fact, be encrypted and later decrypted. 

While this system is a simple demonstration, the classes depicted in the UML diagram can be used as a starting point for the development of future Android applications. (See Figure 1) Once the program is run, the main class will prompt the user for a first and last name. The end user of the program will write their first and last name separated by the space character. It is important to note that each account is stored as four separate, delimited components. Each user account is described by an element. Each element has four components which are:

(1)	First Name;
(2)	Last Name;
(3)	Username;
(4)	Password.

The first and last name will be passed to the ‘User’ class and stored in plain text in the text file. The user’s entry will be checked against a text file, which simulates a simple database. The substring ‘char’ method separates the first and last name from the subsequent characters in the encrypted account element. If the user exists in the database, they are prompted for their username and password. If their second entry matches what is in the database, they receive the message: “Access granted.” If the first and last name do not already exist in the database, the user is prompted to create an account – that is, provide a username and password.

The username and password will be passed to the ‘Login’ class. The Login class creates an instance of the Encryption class that is passed to the methods for creating usernames and passwords. To ensure that the user does not enter a preexisting or duplicate username in the database, the encrypted username is compared to the third component in each existing account. Additionally, one of the methods within the Login class ensures that the user has entered a special character in their password string, otherwise the computer will register an error. As an additional level of verification, the login object is passed to a User class method to determine if the first and last name are not null.  
	
The ‘Register’ class is the main class with which the user interacts. Through a series of loops and conditions the user is prompted to create a new username and password or validate an existing password. Once the password is validated, a new file object is created within a method of Register. Using the file object’s printer writer method to output to a text file, the first name, last name, username, and password are appended to the database. The first-time user will receive the message: “Welcome aboard.” Should they try to rerun the program using their new login credentials, and pending that the credentials are entered correctly and verified, they will receive the “Access granted” message as they are now considered an existing user in the database. 

The ‘Encryption’ class generates an administrative key and method for leveraging the SHA 256 hashing algorithm. The administrative password is "This_is_not_a_key." The ‘Decryption’ class has two methods, one of which generates the same hash function as the Encryption class. The other method has two arguments, the first being the string that has already been encrypted and the second being the administrative key (This_is_not_a_key) used to generate the SHA algorithm. As a further example of AES, I have created an additional main class that decrypts the database using the Decryption class. The main class asks the database administrator for the administrative key (This_is_not_a_key) and if those credentials are correct, then elements of the database will display as a plain text. 


LITERATURE SURVEY 

There is a tradeoff between the complexity of encrypted cyphertext and the amount of time it takes to encode the text. When information is sent over the internet, the digital keys are at times larger than the message being sent across the internet. Therefore, there exists different types of encryption hashing algorithms used for different purposes. The most basic form of encryption is the Caesar-cipher which is a simple shift of each character by a certain number of characters within the alphabet. A problem with this form of encryption is that it can be easily decrypted. (Malan) The Method Digest Algorithm (MD5) hashing encryption on the other hand, divides the input message into 512 bit blocks and processes the string into a 32 digit hexadecimal number, or 128 bits. (Gupta)

Secure Hashing Algorithm (SHA) encryption has properties that allow for higher levels of encryption – therefore security – such as 256 and 512 bits. The Message Digest Class in java has four different implementations of one-way hash functions that implement either 1, 256, 384, or 512 bit encryption. SHA is the Digital Signature Standards (DSS) or 180-4 set by the Federal Information Process Standards (FIPS) and implemented by the National Security Agency (NSA). Additionally, AES encryption is a DSS national standard for encryption and decryption of the same string. (National Institute of Standards and Technology)

CONCLUSION

This project provided opportunity to gain insight into the use of object classes in java. I have learned that there are many different means of encryption and hashing algorithms, each providing their own unique properties and level of security. I also learned that there is a tradeoff between the strength of the hashing algorithm, e.g. the level of security, and the time it takes to create acyphertext. 

As expressed earlier, I would like to apply my simple demonstration of encryption using java to Android mobile operating systems in the healthcare industry. With that in mind, and were I to take my project further, I would have the user create the SHA key, as oppose to explicitly defining the key in the Encryption class, so that the database administrator would be unable to decrypt the text file. Additionally, I would extend the Encryption class to the Decryption class and override the encryption and key methods. This would provide clarity in the code and would prevent me from writing the key twice, in two classes. Lastly, I would expand the current use of private classes. When dealing with encryption, it is important to create private classes such that the main class is separate and cannot access or change the administrative password. 

REFERENCES/BIBLIOGRAPHY

Gupta, L. “Java Secure Hashing - MD5, SHA256, SHA512, PBKDF2, BCrypt, SCrypt.”
HowToDoInJava, 2014, https://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/

Liang, Y. Daniel. Introduction to Java Programming and Data Structures. 11th ed., Pearson
Education, 2018.
Malan, David. “Caesar - CS50x.” Caesar - CS50x, 2018, cs50.harvard.edu/x/2020/psets/2/caesar/.
National Institute of Standards and Technology. “Advanced Encryption Standard (AES).” CSRC, 26 Nov. 2001, csrc.nist.gov/publications/detail/fips/197/final.
Oracle Documents “Package Java.security.” Java.security (Java Platform SE 7 ), 6 Oct. 2018, docs.oracle.com/javase/7/docs/api/java/security/package-summary.html.
Rafter, Dan. “2019 Data Breaches: 4 Billion Records Breached So Far.” Norton, Dan Rafter, 2019, us.norton.com/internetsecurity-emerging-threats-2019-data-breaches.html.















 
