package myProject;

import java.util.HashMap;

public class Interview_SetGetSetAllalgorithm {

	/*
	 * Interview Question: set() get() setAll() all O(1) algorithm
	 */

	//Define the following variables
	private static boolean setAllStatus = false;
	private static HashMap<Integer, Integer> hashMap= new HashMap<Integer, Integer>();
	private static int[] myArray
	= new int[]{5, 6, 78, 3, 90, 22, 34, 5};
	private static int setAllValue = 0;


	//Check if setAllStatus is true
	//if true, add index and value to map
	//always set myArray index value
	private static void set(int index, int value) {
		if (setAllStatus) {
			hashMap.put(index, value);
		}
		myArray[index] = value;
	}
	//Check if aetAll() was called previously
	//If yes, check if HashMap has the index as key
	//If available return value, else setAllValue
	//if setAllStatus is false, read from array
	private static int get(int index) {
		if (setAllStatus) {
			return hashMap.get(index) == null ? setAllValue : hashMap.get(index);
		} else {
			return myArray[index];
		}
	}
	//Set setAllStatus to true
	//create new HashMap
	//set setAllValue to  setAll() value
	private static void setAll(int value) {
		setAllStatus = true;
		hashMap = new HashMap<Integer, Integer>();
		setAllValue = value;
	}

	public static void main(String args[]) {
		set(0, 30);
		System.out.println(get(0));
		System.out.println(get(1));
		setAll(60);
		set(1, 44);
		System.out.println(get(0));
		System.out.println(get(1));
	}


}
