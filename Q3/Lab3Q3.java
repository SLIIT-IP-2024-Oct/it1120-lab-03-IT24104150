import java.util.Scanner;

public class IT24104150Lab3Q3 {
    public static void main(String[] args) {
        //Declar the variables
	int amount = 0;
	int count5000 = 0;
	int count1000 = 0;
	int count500 = 0;
	int count200 = 0;
	int count100 = 0;
	int count50 = 0;
	int count20 = 0;
	int count10 = 0;
	int count5 = 0;
	int count2 = 0;
	int count1 = 0;

		// Create a Scanner object to read input
	Scanner input = new Scanner(System.in);

	// Input the rupee amount 
	System.out.print("Enter the Rupee amount: ");
	amount = input.nextInt();	// if amount entered is 2754

	// Calculate the number of 5000 rupee notes
	count5000 = amount / 5000;	// count5000 = 0 (2754 / 5000 = 0)
	amount = amount % 5000;		// amount = 2754 (In Modulus Operation if Divldend (2754))

	 // Calculate the number of 1000 rupee notes
	count1000 = amount / 1000;	//count1000 = 2 (2754 / 1000 = 2.754 => 2)
	amount = amount % 1000; 	// amount = 754 (2754 % 1000 = remainder => 754)

					// Now the amount variable is updated to 754 on longer 2754

	// Calculate the number of 500 rupee notes
	count500 = amount / 500;	//count500 = 2 (754 / 500 = 1.754 => 1)
					// amount = 254 (754 % 500 = remaider => 254)
					// Now the amount variable is updated to 254 no longer 754

	// Calculate the number of 200 rupee notes
	count200 = amount /200; 	//count200 = 2 (254 / 200 = 1.54 => 1)
	amount = amount % 200;		//amount = 54 (254 % 200 = remainder => 54)
					// Now the amount variable is updatet to 54 no lpnger 254 

	// Calculate the number of 100 rupee notes
	count100 = amount /200; 	//count100 = 0 (254 / 100 = 0)
	amount = amount % 200;		//amount = 54 (In Modulus Operation if Divldend (54)) 

	// Calculate the number of 50 rupee notes
	count50 = amount /50; 		//count50 = 1 (54 / 50 = 1.4 => 1)
	amount = amount % 50;		//amount = 4 (54 % 50 = remainder => 4)
					// Now the amount variable is updatet to 4 no 	lpnger 54 


	// Calculate the number of 20 rupee notes
	count20 = amount /20; 		//count20 = 0 (4 / 20 = 0)
	amount = amount % 20;		//amount = 4 (In Modulus Operation if Divldend (4)) 

	// Calculate the number of 10 rupee notes
	count10 = amount /10; 		//count10 = 0 (4 / 10 = 0)
	amount = amount % 10;		//amount = 4 (In Modulus Operation if Divldend (4)) 

	// Calculate the number of 5 rupee notes
	count5 = amount /5; 		//count5 = 0 (4 / 5 = 0)
	amount = amount % 5;		//amount = 4 (In Modulus Operation if Divldend (4)) 

	 // Calculate the number of 2 rupee notes
	count2 = amount /2; 		//count2 = 2 (4 / 2 = 2 => 2)
	amount = amount % 2;		//amount = 0 (4 % 2 = remainder => 0)
					// Now the amount variable is updatet to 0 no 	lpnger 4 

	// Calculate the number of 1 rupee notes
	count1 = amount /1; 		//count1 = 0 (0/ 1 = 0)
	amount = amount % 1;		//amount = 0 (In Modulus Operation if Divldend (0)) 

	}
}

