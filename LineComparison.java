import java.util.*;
public class LineComparison {
	public static void main(String args[]) {
	System.out.println("Welcome to Line Comparison Computation Program");

	Scanner In = new Scanner(System.in);
	int Coordinate_x1 = In.nextInt();
	int Coordinate_y1 = In.nextInt();
	int Coordinate_x2= In.nextInt();
	int Coordinate_y2 = In.nextInt();

	double Length = Math.sqrt(Math.pow((Coordinate_x2-Coordinate_x1),2) + Math.pow((Coordinate_y2-Coordinate_y1),2));
	System.out.println("Length of line: "+Length);
	}
}
