package Assignment6;
import java.util.*;
public class ArrayConvertor {
	  public ArrayList<Integer> convertArrayToList(int[] arr) {
	        ArrayList<Integer> list = new ArrayList<>();
	        for (int num : arr) {
	            list.add(num);
	        }
	        return list;
	    }

	    // Method to display ArrayList elements
	    public void displayScores(ArrayList<Integer> list) {
	        System.out.println("Elements in the ArrayList:");
	        for (int score : list) {
	            System.out.println(score);
	        }
	    }
}
