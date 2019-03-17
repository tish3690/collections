package cf;

import java.util.Arrays;

public class WarmUp {
	
	public static int[] addElement(int[] originalArr, int newItem ) {
		int[] newArr = new int[originalArr.length+1];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = originalArr[i];
		}
		newArr[newArr.length-1]= newItem;
		return newArr;
	}

	public static void main(String[] args) {
		
		int[] myArr= {1,2,3,4,5};
		myArr = addElement(myArr, 6);

	}

}
