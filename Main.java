/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
        int bill = 200;
        int amount = 0;
        double gst = 0;
        double total = 0;

        if (bill > 200 && bill <= 499) {
            amount = bill * 5;
            gst = amount * 0.25;
            total = amount + gst;
            System.out.println("Total amount is: " + total);
        } else if (bill > 100 && bill <= 199) {
            amount = bill * 3;
            gst = amount * 0.15;
            total = amount + gst;
            System.out.println("Total amount is: " + total);
        } else if (bill <= 100) {
            amount = bill * 25;
            System.out.println("Total amount is: " + amount);
        } else {
            System.out.println("Not applicable");
        }
    }
}

			

