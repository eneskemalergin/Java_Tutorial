// Author : Enes Kemal Ergin
/*
	TowersOfHanoi is a class for Towers of Hanoi puzzle
*/

public class TowersOfHanoi{
	private int totalDisks;

	// Constructor: Sets up the puzzle with specified number of disks
	public TowersOfHanoi(int disks){
		totalDisks = disks;
	}

	// Performs the initial call to moveTower to solve the puzzle
	public void solve(){
		moveTower(totalDisks, 1, 3, 2);
	}

	// Moves the specified number of disks from one tower to 
	//	another by moving a subtower of n-1 disks out of the way, 
	// moving one disk, then moving the subtower back.
	public void moveTower(int numDisks, int start, int end, int temp){
		if(numDisks == 1)
			moveOneDisk(start, end);
		else{
			moveTower(numDisks-1, start, temp, end);
			moveOneDisk(start, end);
			moveTower(numDisks-1, temp, end, start);
		}
	}

	// Prints instructions to move one disk from the specified start tower
	// to the specified end tower
	public void moveOneDisk(int start, int end){
		System.out.println("Move one disk from " + start + " to " + end);
	}
}