import java.util.*;
public class Assignment3 {
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
	System.out.println("    #\t\tDesc\t\tUnit Price\t\tTotal Price");
	System.out.printf("%5d\t\tTV\t\t%10.2f\t\t%10.2f\n", ctv, unittv, tottv);
	System.out.printf("%5d\t\tPS5\t\t%10.2f\t\t%10.2f\n", cps5, unitps5, totps5);
	System.out.printf("%5d\t\tWindows\t\t%10.2f\t\t%10.2f\n\n", cwin, unitwin, totwin);
	System.out.printf("\t\t\t\t    Total\t %18.2f\n", total);
	System.out.printf("\t\t\t\t    Tax\t\t%18.2f\n", tax);
	System.out.printf("\t\t\t\t    Grand Total\t %18.2f\n", grandtotal);
}
}

