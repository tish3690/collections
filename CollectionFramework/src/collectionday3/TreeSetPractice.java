package collectionday3;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {

		// TreeSet<String> sTree = new TreeSet<>();
		Comparator<String> lastC = new LastCharComparator();
		Comparator<String> secC = Comparator.comparing(str -> str.charAt(1));

		TreeSet<String> sTree = new TreeSet<>(secC);

		sTree.add("Adam");
		sTree.add("Zod");
		sTree.add("Superman");
		sTree.add("Batmanx");
		sTree.add("Zod");

		System.out.println(sTree);
		
	}

}

class LastCharComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		/// getting last character as String
		/// using comparedTo method of String to get reversedOrder
		return o2.substring(o2.length() - 1).compareTo(o1.substring(o1.length() - 1));
	}

}