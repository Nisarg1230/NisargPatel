import java.util.*;

class Items{ 				//class called Items
	public float item1;
	public float item2;		//4 public float variables
	public float item3;
	public float item4;

	Items(float b, float p, float s, float f){		// Constructor for class Items
		item1 = b;
		item2 = p;
		item3 = s;
		item4 = f;
	}
	float Burger() throws java.io.IOException {		// Method called Burger()
							
		float total = 0;							// Few variables with float, char, int data types
		char extra;
		int drink;
		float totalf;
		System.out.println("You have ordered Burger and it's price is $" + item1);		// Output's what the user has choose and it's price.
		System.out.println("Do you want a drink with your burger (y/n)?");				// Then it asks user if they want a drink with their food.
		extra = (char) System.in.read();
		if(extra == 'y' | extra == 'Y') {			// Then it takes input from the user. 																	
			System.out.println("Please press:"); 	
			System.out.println("1 for PEPSI");
			System.out.println("2 for SPRITE");		// With the help of if statement it shows the drinks list if the user wants a drink.
			System.out.println("3 for FANTA");
			Scanner w = new Scanner(System.in);		// Another user input for which drink to add in the total price.
	        drink = w.nextInt(); 
			if(drink == 1) {
				total = item1 + item2;			// If the user picks 1 then the price of pepsi is added with burger.
			}
			else if(drink == 2) {
				total = item1 + item3;			// If the user picks 2 then the price of sprite is added with burger.
			}
			else if(drink == 3) {			
				total = item1 + item4;			// If the user picks 3 then the price of fanta is added with burger.
			}
		}
		else {
			total = item1;						// If the user doesn't pick any drink then the total will only have burger's price.
		}
		totalf = total + (float) ((total*7.5)/100); 									// This adds tax to the final value.
		System.out.println("This is your total bill: $" + totalf + " with tax of 7.5%, thank you for ordering hope you enjoyed your experience."); //This outputs a message for the user and the total price with tax.
		return totalf;
	}
	float Pizza() throws java.io.IOException{		// Method called Pizza
		
		float total = 0;							// Few variables with float, char, int data types
		char extra;
		int topping;
		float totalf;
		System.out.println("You have ordered Pizza and it's price is $" + item1);		// Output's what the user has choose and it's price.
		System.out.println("Do you want a topping with your pizza (y/n)?");				// Then it asks user if they want a topping with their pizza.
		extra = (char) System.in.read();
		if(extra == 'y' | extra == 'Y') {			// Then it takes input from the user. 						
			System.out.println("Please press:"); 
			System.out.println("1 for ONIONS");
			System.out.println("2 for PINEAPPLE");	// With the help of if statement it shows the topping list if the user want to add it.
			System.out.println("3 for OLIVES");
			Scanner w = new Scanner(System.in);		// Another user input for which topping to add with pizza.
	        topping = w.nextInt(); 
			if(topping == 1) {
				total = item1 + item2;				// If the user picks 1 then the price of onions is added with burger.
			}
			else if(topping == 2) {
				total = item1 + item3;				// If the user picks 2 then the price of pineapple is added with burger.
			}
			else if(topping == 3) {
				total = item1 + item4;				// If the user picks 3 then the price of olives is added with burger.
			}
		}
		else {
			total = item1;							// If the user doesn't pick a topping then the total will only have pizza's price.
		}
		totalf = total + (float) ((total*7.5)/100); 									// This adds tax to the final value.	
		System.out.println("This is your total bill: $" + totalf + " with tax of 7.5%, thank you for ordering hope you enjoyed your experience."); //This outputs a message for the user and the total price with tax.
		return totalf;								
		
	}
	float Sandwich() throws java.io.IOException{	// Method called sandwich
		
		float total = 0;							// Few variables with float, char, int data types
		char extra;
		int filling;
		float totalf;
		System.out.println("You have ordered Sandwich and it's price is $" + item1);	// Output's what the user has choose and it's price.
		System.out.println("Do you want extra filling on your Sandwich (y/n)?");		// Then it asks user if they want anything extra on their sandwich.
		extra = (char) System.in.read();
		if(extra == 'y' | extra == 'Y') {			// Then it takes input from the user. 		
			System.out.println("Please press:"); 
			System.out.println("1 for ONIONS");
			System.out.println("2 for JALAPENOS");	// With the help of if statement it shows the topping list if the user want to add it.
			System.out.println("3 for CHEESE");
			Scanner w = new Scanner(System.in);		// Another user input for which topping to add on their sandwich.
	        filling = w.nextInt(); 
			if(filling == 1) {
				total = item1 + item2;				// If the user picks 1 then the price of adding extra onions is added with sandwich.
			}
			else if(filling == 2) {
				total = item1 + item3;				// If the user picks 2 then the price of adding extra jalapenos is added with sandwich.
			}
			else if(filling == 3) {
				total = item1 + item4;				// If the user picks 3 then the price of adding extra cheese is added with sandwich.
			}
		}
		else {
			total = item1;							// If the user doesn't pick any extra topping then the total will only have sandwich's price.
		}
		totalf = total + (float) ((total*7.5)/100); 									// This adds tax to the final value.	
		System.out.println("This is your total bill: $" + totalf + " with tax of 7.5%, thank you for ordering hope you enjoyed your experience."); //This outputs a message for the user and the total price with tax.
		return totalf;
		
	}
	float Taco() throws java.io.IOException{		// Method called Taco
			
		float total = 0;							// Few variables with float, char, int data types
		char extra;
		int inside;
		float totalf;
		System.out.println("You have ordered Taco and it's price is $" + item1);	// Output's what the user has choose and it's price.
		System.out.println("Do you want extra filling on your Taco (y/n)?");		// Then it asks user if they want anything extra on their taco.
		extra = (char) System.in.read();
		if(extra == 'y' | extra == 'Y') {			// Then it takes input from the user. 		
			System.out.println("Please press:"); 
			System.out.println("1 for BEEF");		
			System.out.println("2 for BEANS");		// With the help of if statement it shows the filling list if the user want to add it.
			System.out.println("3 for CHEESE");
			Scanner w = new Scanner(System.in);		// Another user input for which filling to add in taco.
	        inside = w.nextInt(); 
			if(inside == 1) {
				total = item1 + item2;				// If the user picks 1 then the price of beef is added with taco.
			}
			else if(inside == 2) {
				total = item1 + item3;				// If the user picks 2 then the price of beans is added with taco.
			}
			else if(inside == 3) {
				total = item1 + item4;				// If the user picks 3 then the price of cheese is added with taco.
			}
		}
		else {
			total = item1;							// If the user doesn't pick a filling then the total will only have taco's price.
		}
		totalf = total + (float) ((total*7.5)/100); 									// This adds tax to the final value.	
		System.out.println("This is your total bill: $" + totalf + " with tax of 7.5%, thank you for ordering hope you enjoyed your experience."); //This outputs a message for the user and the total price with tax.
		return totalf;
		
	}
	float Tostada() throws java.io.IOException{		// Method called tostada
		
		float total = 0;							// Few variables with float, char, int data types
		char extra;
		int fill;
		float totalf;
		System.out.println("You have ordered Tostada and it's price is $" + item1);		// Output's what the user has choose and it's price.
		System.out.println("Do you want extra filling on your Tostada (y/n)?");			// Then it asks user if they want anything extra on their tostada.
		extra = (char) System.in.read();
		if(extra == 'y' | extra == 'Y') {			// Then it takes input from the user. 		
			System.out.println("Please press:"); 
			System.out.println("1 for BEEF");
			System.out.println("2 for BEANS");		// With the help of if statement it shows the topping list if the user want to add it.
			System.out.println("3 for CHEESE");
			Scanner w = new Scanner(System.in);		// With the help of if statement it shows the filling list if the user want to add it.
	        fill = w.nextInt(); 
			if(fill == 1) {
				total = item1 + item2;				// If the user picks 1 then the price of beef is added with tostada.
			}
			else if(fill == 2) {
				total = item1 + item3;				// If the user picks 2 then the price of beans is added with tostada.
			}
			else if(fill == 3) {
				total = item1 + item4;				// If the user picks 3 then the price of cheese is added with tostada.
			}
		}
		else {
			total = item1;							// If the user doesn't pick a filling then the total will only have tostada price.
		}
		totalf = total + (float) ((total*7.5)/100); 									// This adds tax to the final value.	
		System.out.println("This is your total bill: $" + totalf + " with tax of 7.5%, thank you for ordering hope you enjoyed your experience."); //This outputs a message for the user and the total price with tax.
		return totalf;
	}
}
class Italian {				// Another class called Italian
	public float item1; 	// Few public float variables
	public float item2;
	public float item3;
	public float item4;
	Italian(float t, float h, float f, float c){	// A constructor for class
		item1 = t;
		item2 = h;
		item3 = f;
		item4 = c;
	}
	float four() throws java.io.IOException{		// four() method
	int enter;										// Few variables with int and float data types.
	float FOUR_CHEESE = 10.99F;
	float total = 0;
	System.out.println("You have ordered four cheese pasta and with every pasta you have to pick your choice of soup."); // Message of what user has picked and tells the user to pick a soup of their choice.
	System.out.println();
	System.out.println("Which soup would you like to order:");		// Asks for which soup the user would like to have.
	String soup[] = {"Please press", "1 for Tomato Soup", "2 for Hot and Sour Soup", "3 for French Onion Soup", "4 for Chicken Tortilla Soup"}; //Array contains soup list.
	for(int i = 0; i < 5; i++) {					// for loop to output the list of soup.
		System.out.println(soup[i]);
	}
	Scanner food = new Scanner(System.in);			// Asks for user input
    enter = food.nextInt();
    if(enter == 1) {								// Then based on users choice the price of the soup is added with pasta's price.
    	total = FOUR_CHEESE + item1;
    }
    else if(enter == 2){
    	total = FOUR_CHEESE + item2;
    }
    else if(enter == 3){
    	total = FOUR_CHEESE + item3;
    }
    else if(enter == 4){
    	total = FOUR_CHEESE + item4;
    }
	System.out.println("This is your total bill: $" + total + " thank you for visting hope you enjoyed your experience."); // Outputs a message for the user with the total price.
	return total;
	}
	float RAVIO() throws java.io.IOException{ 	// Method called RAVIO()
		int enter;								// Few variables with int and float data type.
		float total = 0;
		System.out.println("You have ordered ravioli. Which type of ravioli would you like to have."); // Tells the user that they choose ravioli and asks the user what type of ravioli they would like to have.
		System.out.println();
		String ravioli[] = {"Please press", "1 for Crab and Creamy Vino Ravioli", "2 for Chocolate and Cheese Ravioli", "3 for Fresh Corn Stuffed Ravioli", "4 for Sweet Potato Filling Ravioli"};
		for(int i = 0; i < 5; i++) {			// Above is the array containing the list of different type of ravioli and in this line it outputs the list.
			System.out.println(ravioli[i]);
		}
		Scanner food = new Scanner(System.in);		// Asks the user for input.
	    enter = food.nextInt();
	    if(enter == 1) { 							// Then using if-else-if statement it finds the total price of the chosen ravioli.
	    	total = item1;
	    }
	    else if(enter == 2){
	    	total = item2;
	    }
	    else if(enter == 3){
	    	total = item3;
	    }
	    else if(enter == 4){
	    	total = item4;
	    }
		System.out.println("This is your total bill: $" + total + " thank you for visting hope you enjoyed your experience."); // Outputs a message for the user with the total price.
		return total;
		}
	float DESSERT() throws java.io.IOException{ 	// Another method called DESSERT()
		int enter;									// Few variables with int and float data type.
		float total = 0;
		System.out.println("You have ordered dessert. Which dessert would you like to have."); // Tells the user that they ordered a dessert and asks the user, which dessert they want.
		System.out.println();
		String dessert[] = {"Please press", "1 for Zabaglione with Strawberries", "2 for Pumpkin-Gingersnap Tiramisu", "3 for Strawberry Gelato", "4 for White Peach Tart"};
		for(int i = 0; i < 5; i++) {				// Above is the array containing the list of different type of desserts and in this line it outputs the list.
			System.out.println(dessert[i]);
		}
		Scanner food = new Scanner(System.in);		// Asks the user for input.
	    enter = food.nextInt();
	    if(enter == 1) {							// Then using if-else-if statement it finds the total price of the chosen dessert.
	    	total = item1;
	    }
	    else if(enter == 2){
	    	total = item2;
	    }
	    else if(enter == 3){
	    	total = item3;
	    }
	    else if(enter == 4){
	    	total = item4;
	    }
		System.out.println("This is your total bill: $" + total + " thank you for visting hope you enjoyed your experience."); // Outputs a message for the user with the total price.
		return total;
		}
}

public class RestuarantMenu { // class called RestaurantMenu containing main() method
	public static void main(String[] args) throws java.io.IOException{
		int option;
		System.out.println("Hello welcome to my restaurant. There are so many fast food options you can choose from."); // A welcome message
		System.out.println();
		System.out.println("And for today special there is Italian food and there won't be tax added to Italian food."); // Tells the user that there is no tax on Italian food.
		System.out.println();
		String show[] = {"1. Fast food options.","2. Italian food."}; // Outputs the option for the type of food served at this restaurant using a array.
		do {							// Used do-while if the user doesn't input 1 or 2
		System.out.println(show[0]); 
		System.out.println();
		System.out.println(show[1]);
		Scanner accc = new Scanner(System.in);
	    option = accc.nextInt();
		}while(option > 2 | option < 1);
		
	
      switch(option) {		// Based on the users choice it will output food options and this is possible by using a switch statement.
      case 1:
    	int enter;									// Few Variables with int and float data type.
  		float totalb,totalp,totals,totalt,totalto;
  		String list[] = {"1. Burger","2. Pizza","3. Sandwich","4. Taco","5. Tostada"}; // Array of fast food options.
   		for(int i = 0; i < 5; i++)		// Outputs the list using a for loop
   		{
   			System.out.println(list[i]);
   		}
		System.out.println();
            
            System.out.println("Please enter your order by inputing 1-5.");		// Asks the user to pick their choice of food from fast food options.
            Scanner ac = new Scanner(System.in);								// Takes the user input.
            enter = ac.nextInt();
            System.out.println(enter);
           while(enter > 5 | enter < 1) {
          		for(int i = 0; i < 5; i++)										// Using a while to output the fast food list again if the user doesn't input from 1-5.
          		{
          			System.out.println(list[i]);
          		}
                
                System.out.println("Please enter your order by inputing 1-5.");
                Scanner acc = new Scanner(System.in);
                enter = acc.nextInt();
                System.out.println(enter);}
                Items burger = new Items(4.99F,0.99F,1.99F,1.50F);			
                Items pizza = new Items(5.99F,0.99F,1.50F,1.99F);
                Items sandwich = new Items(8.99F,1.99F,1.50F,1.99F);			// These are object and the values of food and their add-ons.
                Items taco = new Items(4.99F,1.99F,0.50F,0.99F);
                Items tostada = new Items(7.99F,1.99F,0.50F,0.99F);
                
        switch(enter) {															// There is a nested switch statement with calculates the price with any add-ons.
        case 1: 
        	totalb = burger.Burger();
        																		// case 1 calls Burger() method using object burger.
        	break;
        case 2: 
        	totalp = pizza.Pizza();												// case 2 calls Pizza() method using object pizza.
        									
        	break;
        case 3:
        	totals = sandwich.Sandwich();										// case 3 calls Sandwich() method using object sandwich.
        							
        	break;
        case 4:
        	totalt = taco.Taco();												// case 4 calls Taco() method using object taco.
        									
        	break;
        case 5:
        	totalto = tostada.Tostada();										// case 5 calls Tostada() method using object tostada.
     
        default:
        	System.out.println("Invalid Input.");
        }
        break;
      case 2: 																	// case 2 in other switch displays Italian food options
    	int pick;					
    	float totalpas,totalr,totald;
    	Italian pasta = new Italian(2.99F,5.99F,4.99F,7.99F);
    	Italian ravioli = new Italian(20.99F,15.99F,17.99F,10.99F);			// Objects of Italian class and sets the price of the item and their add-ons.
    	Italian dessert = new Italian(10.99F,5.99F,7.99F,9.99F);
    	System.out.println("Welcome to the best Italian restuarant.");		// A welcome message
    	String lists[] = {"1. Pasta","2. Ravioli","3. Dessert"};			// Array of Italian food item list.
    	for(int i = 0; i < 3; i++) {
    		System.out.println(lists[i]);									// Displays the list using for loop.
    	}
    	Scanner acc = new Scanner(System.in);								// Gets the user input
        pick = acc.nextInt();
        while(pick > 3 | pick < 1) {										// Using a while to output the fast food list again if the user doesn't input from 1-3.
        	for(int i = 0; i < 3; i++) {
        		System.out.println(lists[i]);
        	}
        	Scanner accc = new Scanner(System.in);							// Gets the user input again if the user didn't input correctly the first time.
            pick = accc.nextInt();
        }
        switch(pick) {														 // A nested switch statement with calculates the price with any add-ons.
        case 1: 
        	totalpas = pasta.four();
        break;
        case 2:
        	totalr = ravioli.RAVIO();
        break;
        case 3:
        	totald = dessert.DESSERT();
        break;
        default:
        	System.out.println("Invalid Input.");
        
        }
  
      }
   
	}
}
