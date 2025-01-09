import java.util.*;
import java.time.*;

public class CheckoutSystem{

    public static void main(String... args) {

        Scanner snack = new Scanner(System.in);

        ArrayList<String> item = new ArrayList<>();
        ArrayList<Integer> amount = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();
        ArrayList<Integer> total = new ArrayList<>();

        int totals = 0;
        String recap;
        double vatRate = 0.075;
	
        System.out.println("What is the customer name:");
        String name = snack.nextLine();

        do {

            System.out.println("Enter item name:");
            String purchase = snack.nextLine();
	    item.add(purchase);
int bit;
           

while (true) {
                System.out.println("Enter item amount:");
                String input = snack.nextLine();
                  try {
		   bit = Integer.parseInt(input);
                    if (bit > 0) {
                        break;
                    } else {
                        System.out.println("Item amount must be a postive number. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid postive number.");
                    
                }
            }
            amount.add(bit);
int sells;

while (true) {

            System.out.println("Enter item price:");
	    String inputs = snack.nextLine();
		try {
                 sells = Integer.parseInt(inputs);
		if (sells > 0) {
			break;
		} else {
		    System.out.println("Item price  must be a postive  number. Please try again.");
		}  
	} catch (NumberFormatException e) {
		System.out.println("Invalid input. Please enter a valid postive number.");

	}
    }
	
          price.add(sells);

            int all = bit * sells;
            total.add(all);

            totals += all;

            System.out.println("Do you wish to purchase more items (yes/no)?");

           
            recap = snack.nextLine().toLowerCase();

           while (!recap.equals("yes") && !recap.equals("no")) {
               System.out.println("Invalid option: enter either yes or no");
                recap = snack.nextLine().toLowerCase();
            }

        } while (recap.equals("yes"));

        System.out.println("Enter cashier name:");
        String cashier = snack.nextLine();

       double discount = 0;
	while(discount < 1) {
	  System.out.println("How much discount will he/she get:");
		String exputs = snack.nextLine();
			try {
			discount = Double.parseDouble(exputs);
			if (discount > 0) {
				break;
		} else {
		   System.out.println("oga cashier why you dey press negative number as discount. press a postive number as discount oga ");
	}
 } catch (NumberFormatException e) {
		System.out.println("Don't input a string for me. input a postive number as discount");
	}
	
}
	double fish = totals * (discount / 100);	

        double vat = totals * vatRate;
        double totalBill = totals - fish + vat;

        LocalDateTime now = LocalDateTime.now();
        System.out.println("\n ---------------------------- INVOICE -----------------------------------");
	System.out.println("SEMICOLON STORES");
	System.out.println("MAIN BRANCH");
	System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
	System.out.println("TELL: 03293828343");
        System.out.println("Date: " + now.toLocalDate() + " Time: " + now.toLocalTime());
        System.out.println("Cashier Name: " + cashier);
	System.out.println("Customer Name: " + name);
        System.out.println("============================================================================");
        System.out.println("	Item	QTY	Price	Total(NGN)");
	System.out.println("----------------------------------------------------------------------------");
        for (int count = 0; count < item.size(); count++) {
             System.out.println("\t" + item.get(count) + "\t" + amount.get(count) + "\t" + price.get(count) + "\t" + total.get(count));
        }

        System.out.println("=============================================================================");
        System.out.println("             	Subtotal = " + totals);
        System.out.println("            	Discount = " + fish);
        System.out.println("             	VAT (7.5%) = " + vat);
        System.out.println("             	Total Bill = " + totalBill);
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Enter amount paid by the customer:");
        double amountPaid = snack.nextDouble();

        while (amountPaid < totalBill) {
            System.out.println("Insufficient payment. Please pay at least " + totalBill + ": ");
		String exput = snack.nextLine();
			try {
			amountPaid = Integer.parseInt(exput);
			if (amountPaid <= 0) {
				System.out.println("Invalid payment. Please pay at least " + totalBill + ".");
		} 

 } catch (NumberFormatException e) {
		System.out.println("Oga pls pay your accurate money. then it your choice to leave with the reciept");
	}

}
            
       

        double change = amountPaid - totalBill;

        System.out.println("\n ---------------------------- RECIEPT -------------------------------------");
	System.out.println("SEMICOLON STORES");
	System.out.println("MAIN BRANCH");
	System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
	System.out.println("TELL: 03293828343");
        System.out.println("Date: " + now.toLocalDate() + " Time: " + now.toLocalTime());
        System.out.println("Customer Name: " + name);
        System.out.println("Cashier Name: " + cashier);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("	Item	QTY	Price	Total(NGN)");

        for (int count = 0; count < item.size(); count++) {
            System.out.println("\t" + item.get(count) + "\t" + amount.get(count) + "\t" + price.get(count) + "\t" + total.get(count));
        }

        System.out.println("=============================================================================");
        System.out.println("			Subtotal = " + totals);
        System.out.println("			Discount = " + fish);
        System.out.println(" 			VAT (7.5%) = " + vat);
        System.out.println("			Total Bill = " + totalBill);
        System.out.println("			Amount Paid = " + amountPaid);
        System.out.println("			Your balance  is = " + change);
        System.out.println("=============================================================================");

        System.out.println("                     THANKS  FOR SHOPPING WITH US                            ");
	System.out.println("=============================================================================");
	System.out.println("SEMICOLON STORE WILL BE DELIGHTED TO HAVE YOU COME PATRONIZE IT STORE ONCE MORE!");

    }

}
