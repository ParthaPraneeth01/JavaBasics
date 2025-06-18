import java.util.*;

class User{
    String username;
    String password;
    double balance;
    List<String> transactions;
    
    User(String username,String password){
        this.username=username;
        this.password=password;
        this.balance=0.00;
        this.transactions=new ArrayList<>();
        transactions.add("Account Created with opening balance ₹0.00");
    }
    
    void deposit(double amount){
        balance+=amount;
        transactions.add("deposited ₹"+amount+" then balance ₹"+balance);
    }
    
    void receiveTransfer(User fromUser,double amount){
        balance+=amount;
        transactions.add("Recieved ₹"+amount+" from "+fromUser.username+" then balance ₹"+balance);
    }
    
    boolean withdraw(double amount){
        if(balance<amount){
            transactions.add("Failed to withdraw amount ₹"+amount+" failed due to insufficient funds "+" then balance ₹"+balance);
            return false;
        }
        else{
            balance-=amount;
            transactions.add("Withdrawn amount ₹"+amount+" then balance ₹"+balance);
            return true;
        }
    }
    
    boolean sendTransfer(User toUser,double amount){
        if(balance>=amount){
            balance-=amount;
            transactions.add("Sent ₹"+amount+" to "+toUser.username+" then balance ₹"+balance);
            toUser.receiveTransfer(this,amount);
            return true;
        }
        else{
            System.out.println("Failed To Transfer due to insufficient funds");
            transactions.add("Failed to Sent ₹"+amount+" to "+toUser.username+" then balance ₹"+balance); 
            return false;
        }
    }
    
    void printTransactions(){
        System.out.println("-----Transactions History-----");
        for(String t:transactions){
            System.out.println("->"+t);
        }
    }
    
}


public class PaymentTransfer
{
    static Scanner sc=new Scanner(System.in);
    static HashMap<String,User> users = new HashMap<>();
    
	public static void main(String[] args) {
	    System.out.println("------Welcome To CLI Bank-------");
	    
	    while(true){
	        System.out.println("\n1.LOGIN \n2.SIGNUP \n3.EXIT");
	        int choice = sc.nextInt();
	         sc.nextLine();  
	        switch(choice){
	            case(1)->login();
	            case(2)->signup();
	            case(3)->{
	                System.out.println("Thank U For Choosing CLI Bank");
	                return;
	            }
	            default->{
	                System.out.println("Invalid Choice");
	            }
	        }
	    }
	}
	static void signup(){
	    System.out.print("Enter UserName:");
	    String username=sc.nextLine();
	    if(users.containsKey(username)){
	        System.out.println("Already exits,Choose another username");
	        return;
	    }
	    System.out.print("Enter password:");
	    String password=sc.nextLine();
	    users.put(username,new User(username,password));
	    System.out.println("Account Created Successfully You Can Login Now");
	}
	
	static void login()
	{
	    System.out.println("Enter UserName:");
	    String username=sc.nextLine();
	    if(!users.containsKey(username)){
	        System.out.println("Not exits,Need To SignUp First");
	        return;
	    }
	    System.out.println("Enter password:");
	    String password=sc.nextLine();
	    User user = users.get(username);
	    if(!user.password.equals(password) ){
	        System.out.println("Password Mismatch");
	        return;
	    }
	    System.out.println("Login Successfull");
	    userDashboard(user);
	    
	}
	static void userDashboard(User currentuser){
	    
	    while(true){
	        System.out.println("\n---Menu---\n1.BALANCE \n2.DEPOSIT \n3.WITHDRAW \n4.VIEW TRANSACTIONS \n5.TRANSFERMONEY \n6.LOGOUT");
	        int choice = sc.nextInt();
	        System.out.println("\n");
	        switch(choice){
	            case(1):{
	                System.out.println("THe User has Balance ₹"+currentuser.balance);   
	            }
	            case(2):{
	                System.out.println("EnterTHe amount to deposit ₹");
	                double amount=sc.nextDouble();
	                currentuser.deposit(amount);
	            }
	            case(3):{
	                System.out.println("Enter amount need to withdraw ₹");
	                double amount = sc.nextDouble();
	                if(!currentuser.withdraw(amount)){
	                    System.out.println("insufficient funds");
	                }
	            }
	            case(4):currentuser.printTransactions();
	            case(5):{
	                System.out.println("Enter the recipant username:");
	                String touser=sc.nextLine();
	                if(!users.containsKey(touser)){
	                    System.out.println("username not exists");
	                    break;
	                }
	                if(touser.equals(currentuser.username)){
	                    System.out.println("Cannot Transfer Money yourself");
	                    break;
	                }
	                System.out.println("Enter amount need to Transfer ₹");
	                double amount=sc.nextDouble();
	                if(currentuser.sendTransfer(users.get(touser),amount)){
	                     System.out.println("Transaction Successful");
	                }
	               
	            }
	            case(6):{
	                System.out.println("LOGOUT Successful");
	                return;
	            }
	            default:{
	                System.out.println("Invalid Choice");
	            }
	        }
	    }
	}
}
