
public class Assignment2 {
	
	public static void main(String[] args) {
//variables
	long pb = 0L, tb = 0L, gb = 0L, mb = 0L, kb = 0L;
	pb = 34;
//processing
	tb = 1000 * pb;
	gb = 1000 * tb;
	mb = 1000 * gb;
	kb = 1000 * mb;
//output
	System.out.println(pb + "Pb = " + tb + " Tb");
	System.out.println(pb + "Pb = " + gb + " Gb");
	System.out.println(pb + "Pb = " + mb + " Mb");
	System.out.println(pb + "Pb = " + kb + " Kb");
	
}
}
