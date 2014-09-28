import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class Alphabetize {

	private static final String SENTINEL = "End";
	private static Scanner in;
	
	public static void main(String[] args){
		
		System.out.print("This program will take an array of strings and sort them into lexicographic order");
		System.out.print("\n");
		System.out.print("Enter words you would like to alphetize using the word " + SENTINEL + " to indicate the end of the list.");
		
		 // Initiate a new Scanner
		in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		while(true){
			System.out.print("Enter a word: ");
			String word = in.next();
			if (word.equalsIgnoreCase(SENTINEL)) break;
			list.add(word);
		}
		
		ArrayList<String> sortedList = alphabetize(list);
		System.out.print("Here is that list, in alphabetic order: ");
		System.out.print(sortedList);
	}

	private static ArrayList<String> alphabetize(ArrayList<String> list) {
		for(int lh = 0; lh < list.size(); lh++){
			int rh = findSmallest(list, lh, list.size());
			swapElements(list, lh, rh);
	}
		return list;
}

	private static void swapElements(ArrayList<String> list, int lh, int rh) {
		String temp = list.get(lh);
		list.set(lh, list.get(rh));
		list.set(rh, temp);
		
	}

	private static int findSmallest(ArrayList<String> list, int lh, int size) {
		int smallestIndex = lh;
		for(int i = lh + 1; i < list.size(); i++){
			if(list.get(i).compareTo(list.get(smallestIndex)) <= 0) smallestIndex = i;
		}
		return smallestIndex;
	}
}
