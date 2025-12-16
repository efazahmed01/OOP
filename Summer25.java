import java.util.ArrayList;

abstract class Payment{
    double amount;
    Payment(double amount){
        this.amount = amount;
    }
    abstract void processPayment();
}

class CcPay extends Payment{
    String cardNumber;
    String cardHolderName;
    
    CcPay(String cardNumber, String cardHolderName,double amount){
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    @Override
    void processPayment(){
        System.out.println("Name : " + cardHolderName);
        System.out.println("Method : Ccpay");
        System.out.println("Charge : " + (amount*.01));
        System.out.println("Total Amount : " + (amount+amount*.01));
    }
}

class Mpay extends Payment{
    String mobileNumber;
    String provider;
    Mpay(String mobileNumber, String provider,double amount){
        super(amount);
        this.mobileNumber = mobileNumber;
        this.provider = provider;
    }
    @Override
    void processPayment(){
        System.out.println("Name : " + provider);
        System.out.println("Method : Mpay");
        System.out.println("Charge : " + (amount*.02));
        System.out.println("Total Amount : " + (amount+amount*.02));
    }
}

public class Main
{
	public static void main(String[] args) {
		Payment p1 = new CcPay("20405678341256","Efaz Ahmed",500000);
		Payment p2 = new Mpay("01305992956","Omar Faruk",2000);
		ArrayList<Payment> p = new ArrayList<>();
		p.add(p1);
		p.add(p2);
		
		for(Payment py : p){
		    py.processPayment();
		}
	}
}
