
package com.bridgelab;

import java.util.*;

public class AddressBook {
	 String firstName, lastName, address, city, state,email;
	    long phoneNo;
	    int zip;
	    public void setDetails(){

	        firstName = "Saurabh";
	        lastName = "Vaidya";
	        address = "KarveNagar";
	        city ="pune";
	        state = "Maharashta";
	        zip = 4111041;
			phoneNo = 8468833118;
	        email = "vaidya0304@gmail.com";
	    }
	    public void printDetails(){

	        System.out.println("\nFirst Nmae : " + firstName  + "\n\nLast Name : " + lastName + "\n\nAddress : " + address + "\n\nCity : " + city + "\n\nState : " + state + "\n\nZip : " + zip + "\n\nPhone Number : " + phoneNo + "\n\nE-mail : " + email); 
	    }
}

public class AddressBookSystem {
	public static void main(String[] args) {
		System.out.println("Welcome In Address Book System Program ");
		AddressBook address = new AddressBook();//create object for addressbook class
        address.setDetails();
        address.printDetails();
    }
	
}