import java.util.Collections;
package com.example.SPRINT2.Storage.Registration;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
public class SPRINT2{
@RestController
class Registration {
	 protected String userName, email, password,driverLicense;
	 protected int mobileNum,nationalID;
	 public void register() {
             Scanner sc=new Scanner(System.in);
		System.out.println("Please, Enter your details");
		System.out.println("Your Name is");
	    userName =sc.nextLine();
		System.out.println("Your Email is");
		email=sc.next();
		System.out.println("Your Password is");
		password=sc.next();
		System.out.println("Your Mobile Number is");
		mobileNum=sc.nextInt();
		System.out.println("Your Driver License is");
		driverLicense=sc.next();
		System.out.println("Your National Id is");
		nationalID=sc.nextInt();	
	}
	 public void verifyRegistration() {}
	 public void logIn() {}
	 public void listPendingRegistration() {}
	 
public Registration()
{
   userName=new userName();
   email=new email();
   password=new password();
   mobileNum=new mobileNum();
   nationalID=new nationalID();
   driverLicense = new driverLicense();
}
}


	 
	 
	 
class Admin extends Registration{
	private int adminID;
	private String name, contact;
	public void verifyRegistration() { 
	System.out.println("You have been successfully registered");
    }
};

@GetMapping("/Ride")
class Ride{
	protected int rideID, rating, destinationArea;
	public void addRide() {}
	public list<ride> sendNotification()
 {
    System.out.println("A ride is requested that its source location is favorite area");
 }
	public void listRides() {}
	public void endRide() {}
	public void addToHistory() {}
	public void requestRide() {}
};



class offer {
	private int offerID, priceOffer;
	public void notifyUser() {}
	public void listRideOffer() {}
    public void notifyDriver() {}
    public void selectOffer() {}
    public void makeOffer() {}
};


 @PostMapping("/user/sign up")
 class user extends Registration {
	Scanner sc = new Scanner(System.in);
	private String name,contact;
	private String sourceLocation, destinationLocation;
	 public void add_user(@RequestedBody Registration k)
         {
            K.userName(k);
            K.email(k); 
            K.password(k);
            K.mobileNum(k);  
            return data.register(k);
         }
	public void requestRide()
	 {
	  System.out.println("Enter the source location");
	  sourceLocation=sc.next();
	  System.out.println("Enter the destination location");
	  destinationLocation=sc.next();
	 }
};

@PostMapping("/driver1/sign up")
class driver1 extends Registration{
	private int driverID, balance, nationalID;
	private String name, contact, favoriteArea, driverLicense;
	Scanner sc = new Scanner(System.in);
	 public void add_driver1(@RequestedBody Registration s)
         {
            S.userName(s);
            S.email(s); 
            S.password(s);
            S.mobileNum(s); 
            S.nationalID(s); 
            S.driverLicense(s);
            return data.register(s);
         }
@DeleteMapping("/driver1/{name}/delete")
public boolean delete driver1(@PathVariable String Name)
{
   int size;
   Scanner sc =new Scanner(System.in);
   size=sc.nextInt();
   for(int i=0;i<size;i++)
{
  if(userName=Name)
   { 
       return username.remove(Name);
   }
}
}			
};

@PostMapping("/driver2/sign up")
class driver2 extends Ride{
	Scanner sc = new Scanner(System.in);
	private int driverID, balance, nationalID;
	private String name, contact, favoriteArea, driverLicense;
	public void addFavoriteArea(String sourceArea) {
		if(favoriteArea==sourceArea);
	     sendNotification();	
	}
         public void add_driver2(@RequestedBody Registration s)
         {
            S.userName(s);
            S.email(s); 
            S.password(s);
            S.mobileNum(s); 
            S.nationalID(s); 
            S.driverLicense(s); 
            return data.register(s);
         }
	public void updateBalance() {}	
	public void listRides(){
		
			 ArrayList<String>ls=new ArrayList<String>();
			 ls.add(favoriteArea);
			  Collections.sort(ls, Collections.reverseOrder());
			  
			}
@DeleteMapping("/driver2/{name}/delete")
public boolean delete driver2(@PathVariable String Name)
{
   int size;
   Scanner sc =new Scanner(System.in);
   size=sc.nextInt();
   for(int i=0;i<size;i++)
{
  if(userName=Name)
   { return username.delete(Name);}
}		
};
};


enum completedRideHistory{ride1,ride2,ride3};


class controllerApi{
	
	Scanner sc = new Scanner(System.in);
private int speed,time,distance,s,t;
public void trackNumberOfcounts() {}
public void viewMap() {}
 public void setSpeed()
 {
	speed=sc.nextInt(); 
 }
 public int getSpeed()
 {
	return speed; 
 }
 public void setTime()
 {
	 time=sc.nextInt(); 
 }
 public int getTime()
 {
	return time; 
 }
 
 public int calculateDistance()
 { 
	return speed*time; 
 }
 
 public void calculateETA()
 {
	 
 System.out.println("please enter the distance expected to travel");
 distance = sc.nextInt();
 System.out.println("please enter the speed of the car");
 s=sc.nextInt();
 System.out.println("expected time to arrive is"+ (distance/s));
}
 
 


public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String input;
	System.out.println("Do you want to register as User or Driver ?");
	input=sc.next();
if(input=="user")
	{
	user u = new user();
	u.register();
	Ride r1 = new Ride();
	completedRideHistory r=completedRideHistory.ride1;			
	controllerApi c = new controllerApi();
	System.out.println("Please, Enter speed");
	c.setSpeed();
	System.out.println("Please, Enter time");
	c.setTime();
	System.out.println("Distance is"+c.calculateDistance());
	c.calculateETA();
    System.out.println("completed ride history is"+r1);
	}		  
else if(input=="driver")
	{
	driver1 d=new driver1();
	d.register();
	Ride r2 = new Ride();
	completedRideHistory h =completedRideHistory.ride1;
	controllerApi a = new controllerApi();
	System.out.println("Please, Enter speed");
	a.setSpeed();
	System.out.println("Please, Enter time");
	a.setTime();
	System.out.println("Distance is"+a.calculateDistance());
	a.calculateETA();
    System.out.println("completed ride history is"+r2);	
	}

else {
	
	System.out.println("invalid");
}
}}
}


