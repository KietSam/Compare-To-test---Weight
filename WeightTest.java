/*Kiet Sam, APCS, 4,9,13
The behavior of this program is to store a weight
as pounds and ounces.*/
import java.util.*;
public class WeightTest {
	public static void main (String[]args){
		ArrayList <Weight> stuff = new ArrayList<Weight>(); //My ArrayList
		//I add a bunch of weights to the ArrayList
		Weight test = new Weight (51, 31);
		Weight test2 = new Weight (51, 32);
		Weight test3 = new Weight (5, 3);
		Weight test4 = new Weight (5, 3);
		Weight test5 = new Weight (1, 3);
		stuff.add(test);
		stuff.add(test2);
		stuff.add(test3);
		stuff.add(test4);
		stuff.add(test5);
		//This is where I print out the ArraList.
		System.out.println(stuff); //[52lb 15oz, 53lb 0oz, 5lb 3oz, 5lb 3oz]
		Collections.sort(stuff);
		System.out.println(stuff); //[5lb 3oz, 5lb 3oz, 52lb 15oz, 53lb 0oz]
	}
}