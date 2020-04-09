import java.util.Scanner;
	public class AssignmentThreeNew {
//Scanner
	static Scanner s1= new Scanner(System.in);
	public static void main(String[] args) {
//Variables
		int ctv = 0, cps5 = 0, cwin = 0;
		float unittv, unitps5, unitwin;
		float tottv, totps5, totwin;
		float total, tax, grandtotal;
//Input
	System.out.printf("Enter number of TVs");
	ctv = s1.nextInt();
	System.out.printf("Enter number of PS5s");
	cps5 = s1.nextInt();
	System.out.printf("Enter number of Windows");
	cwin = s1.nextInt();
//Processing 
	unittv = 1000f;
	unitps5 = 600f;
	unitwin = 500f;
	
	tottv = ctv * unittv;
	totps5 = cps5 * unitps5;
	totwin = cwin * unitwin;
	
	total = tottv + totps5 + totwin;
	tax = 0.10f * total;
	grandtotal= total + tax;

//Output
	System.out.printf("%5s%15s%22s%24s\n", "#", "Desc", "Unit Price", "Total Price");
	System.out.printf("%5d%13s%24.2f%24.2f\n", ctv, "TV", unittv, tottv);
	System.out.printf("%5d%14s%23.2f%24.2f\n", cps5, "PS5", unitps5, totps5);
	System.out.printf("%5d%18s%19.2f%24.2f\n\n", cwin, "Windows", unitwin, totwin);
	System.out.printf("%41s%26.2f\n", "Total", total);
	System.out.printf("%39s%28.2f\n", "Tax", tax);
	System.out.printf("%47s%20.2f\n", "Grand Total",grandtotal);

}
}
