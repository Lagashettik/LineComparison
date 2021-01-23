import java.util.*;
public class LineComparison {
	public static void main(String args[]) {
	System.out.println("Welcome to Line Comparison Computation Program");

	Scanner In = new Scanner(System.in);
	System.out.println("Enter Line1 coordinates");
	int Coordinate_x1 = In.nextInt();
	int Coordinate_y1 = In.nextInt();
	int Coordinate_x2 = In.nextInt();
	int Coordinate_y2 = In.nextInt();
	System.out.println("Enter Line2 coordinates");
	int Coordinate_x3 = In.nextInt();
   int Coordinate_y3 = In.nextInt();
   int Coordinate_x4 = In.nextInt();
   int Coordinate_y4 = In.nextInt();

	double Length1 = Math.sqrt(Math.pow((Coordinate_x2-Coordinate_x1),2) + Math.pow((Coordinate_y2-Coordinate_y1),2));
	double Length2 = Math.sqrt(Math.pow((Coordinate_x4-Coordinate_x3),2) + Math.pow((Coordinate_y4-Coordinate_y3),2));

	System.out.println("Length of line1: "+Length1);
	System.out.println("Length of line2: "+Length2);
	String s1= String.valueOf(Length1);
	String s2= String.valueOf(Length2);

	double var =s1.compareTo(s2);

	if(var == 0 ){
			System.out.println("Both Line are equal");
		}
	else if( var > 0) {
			System.out.println("Length of Line1 is greater");
		}
	else {
			System.out.println("Length of Line2 is greater");
		}
	}
}
