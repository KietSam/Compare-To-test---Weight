/*Kiet Sam, APCS, 4,9,13
The behavior of this program is to store a weight
as pounds and ounces.*/
public class Weight implements Comparable<Weight>{
	private int pounds;
	private int ounces;
	/*Sets the pounds to the given pounds along with converting the 
	ounces from ounces to pounds. Afterwards it adds the left over ounces
	that weren't converted to the ounces.*/
	public Weight (int pounds, int ounces){
		this.pounds = pounds + (ounces/16);
		this.ounces = ounces%16;
	}
	/*This is my toString method which prints like this:
	<pounds> lb <ounces> oz*/
	public String toString (){
		if (pounds == 1){
			return pounds + " lb " +  ounces + " oz";
		}
		return pounds + " lbs " +  ounces + " oz";
	}
	/*This is my compareTo method which adds returns 1 if the current
	weight is larger then the given weight, 0 if the current weight is the 
	same as the given weight and -1 if the current weight is less then the 
	given weigh.*/
	public int compareTo(Weight other){
		if (pounds > other.pounds){
			return 1;
		}
		else if (pounds < other.pounds){
			return -1;
		}
		else {
			if (ounces > other.ounces){
				return 1;
			}
			else if (ounces < other.ounces){
				return -1;
			}
			else {
				return 0;
			}
		}
	}
}