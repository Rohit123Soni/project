import java.util.*;
class begin{
	static Scanner ob = new Scanner(System.in);
	static Scanner ob1 = new Scanner(System.in);
	private int y,cash;
	private int deposit,withdraw,acc,temp;
	private String name;
	public void menu(){
		System.out.println("**********Main Menu**********");
		System.out.println("1) Create Account. ");
		System.out.println("2) Deposit. ");
		System.out.println("3) Withdraw. ");
		System.out.println("4) Details. ");
		System.out.println("5) Delete. ");
		System.out.println("6) Exit. ");
		System.out.println("Enter your choice[1-8]");
		int choice = ob.nextInt();
		if(choice == 1){
			account();
		}
		else if(choice ==  2){
			dep();
		}
		else if(choice == 3){
			wdraw();
		}
		else if(choice == 4){
			details();
		}
		else if(choice == 5){
			delete();
		}
		else if(choice == 6){
			System.exit(0);
		}
		else{
			System.out.println("\n Invalid Choice \n Try Again. ");
			menu();
		}
	}
	
	public void account(){
		System.out.println("\n***** Give Detail ***** ");
		System.out.print("Name: ");
		name = ob1.nextLine();
		System.out.print("Account No: ");
		acc = ob1.nextInt();
		System.out.println("\n Account Created. ");
		System.out.println(" press any button to go back ");
		y =  ob.nextInt();
		menu();
	}
	
	public void dep(){
		System.out.println("\n***** Enter Ammount To Deposit In PKR *****");
		System.out.print("PKR = ");
		cash = ob.nextInt();
		deposit += cash;
		System.out.println("Cash Deposit Successfully");
		System.out.println("press any button to go back. ");
		y =  ob.nextInt();
		menu();
	}
	
	public void wdraw(){
		System.out.println("\n***** Enter Account To Withdraw In PKR *****");
		System.out.print("PKR = ");
		withdraw = ob.nextInt();
		temp = deposit - withdraw;
		deposit = temp;
		System.out.println("Cash Withdraw Successfully");
		System.out.println("press any button to go back. ");
		y =  ob.nextInt();
		menu();
	}
	
	public void details(){
		System.out.println("Name = "+name);
		System.out.println("Account No = "+acc);
		System.out.println("Balance = "+deposit);
		System.out.println("press any button to go back. ");
		y =  ob.nextInt();
		menu();
	}
	
	public void delete(){
		System.out.println("Account Deleted.");
		name = "xxxxxxxxxx";
		acc = 000;
		deposit = 000;
		System.out.println("press any button to go back. ");
		y =  ob.nextInt();
		menu();
		
	}
}	
	
		
		
	
	
		
	
		
	
	
	
