import java.util.Scanner; //Imported Scanner class
import java.util.Random; //imported util
import java.lang.Math;
/*
This program calculates the compound interest of the given user input
for Principal Amount, compounds per year, and year.Annual rate will be 
randomly generated.
*/

public class compoundInterest{

public static void main(String[] args){

int principleAmountInput = 0;
int compoundsYearsInput = 0;
int yearsInput = 0;

double rate = 0.0;


/*Following values are used to break down the compound interest formula*/
double totalValue = 0.0;

double firstStepResult = 0.0;
double secondStepResult = 0.0;
double thirdStepResult = 0.0;
Scanner scanner = new Scanner(System.in); 
Random random = new Random();


/*The following generates a random double between 0.01 and 1*/
rate = 0.01 + (0.99 - 0.01 ) * random.nextDouble(); 
rate = Math.round(rate * 100.0)/100.0;
/*The following prints texts decribing how the calculation will be done
andhow the user should enter the input*/
System.out.println("Compound Interest(including principal sum) calculation:");
System.out.println("Formula is  A=P(1 + r/n)^(n*t)");
System.out.println("You will enter the Principle Amount. An Integer(P):");
System.out.println("Followed by the Compounds per year. An Integer(n)");
System.out.println("And Years the money is invested(t)");
System.out.println("Annual Rate will be randomly generated double value  between 0.01 and 0.99(r) ");
System.out.println("Future Value or Calculated  Amount is (A)");

/*From here the program will ask for user input for the values and print
the inputed value in the compound interest formula*/
System.out.println("Please enter a value for the Principle Amount(An Integer):");
principleAmountInput = scanner.nextInt();

System.out.println("A = $" + principleAmountInput + "(1 + r/n)^(n*t)");

System.out.println("Now enter a value for the compounds per year(An integer).");
compoundsYearsInput = scanner.nextInt();

System.out.println("A = $" + principleAmountInput + "(1 + r/" + compoundsYearsInput +
 ")^(" + compoundsYearsInput + "*t)");

System.out.println("Now enter the number of years the money will be invested(An integer).");
yearsInput = scanner.nextInt();

System.out.println("A = $" + principleAmountInput + "(1 + r/" + compoundsYearsInput
+ ")^(" + compoundsYearsInput + "*" + yearsInput+ ")");

System.out.println("The randomly generated rate(A double) is " + rate);
System.out.println("A = $" + principleAmountInput + "(1 + " + rate + "/" + compoundsYearsInput
+ ")^(" + compoundsYearsInput + "*" + yearsInput+ ")");

/*THe following calculates what the user has entered for it to get the compound intererest.
seocndHalfResult and firstHalfResultis to set up the Math.pow function to get the totalValue
*/

firstStepResult =  1 + rate/compoundsYearsInput;
//System.out.println(firstStepResult);

secondStepResult = compoundsYearsInput * yearsInput;
//System.out.println(secondStepResult);



thirdStepResult = Math.pow(firstStepResult,secondStepResult);

//System.out.println(thirdStepResult);
totalValue = principleAmountInput * thirdStepResult;



System.out.print("Calculated compount Interest is: " );
System.out.printf("%.2f\n",totalValue);
System.out.println("The calculated result is stored in totalValue and is a double that represents the total calculated compountInterest.");

	}

}