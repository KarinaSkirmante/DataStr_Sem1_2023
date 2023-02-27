package datastr;

public class MyArrayList {
	private char[] elements;
	private final int DEFAULT_ARRAY_SIZE = 6;
	private int arraySize = DEFAULT_ARRAY_SIZE;
	private int elementCounter = 0;
	
	//no-args kontruktors
	public MyArrayList()
	{
		elements = new char[arraySize]; //will be with size 6 (DEFAULT_ARRAY_SIZE)
	}
	//args konstruktors
	public MyArrayList(int inputArraySize) {
		if(inputArraySize > 0)
		{
			arraySize = inputArraySize;
		}
		
		elements = new char[arraySize];
	}
	
	//TODO create isFull and isEmpty functions
	public boolean isEmpty()
	{
		//long if-else
		/*if(elementCounter == 0) {
			return true;
		}
		else
		{
			return false;
		}*/
		//for example
		/*
		return (arraySize< elementCounter) ? "var ievietot" : "nevar ievietot";
		if (arraySize< elementCounter) {
			return "var ievietot" ;
		}
		else
		{
			return "nevar ievietot";
		}
		*/
		
		
		//short if-else
		//kopējais   (if izteiksme)      ? ko darīt true    : ko darīt false gadījumā;
		//return      (elementCounter == 0)? true             : false;
		
		return (elementCounter == 0);
		
	}
	
	public boolean isFull()
	{
		return (elementCounter==arraySize);
	}
	
	public int howManyElements() {
		return elementCounter;
	}
	
	 
	//1. create a definition of function increaseArray
	private void increaseArray()
	{
	//2. calculate the new size of the new array
		int newArraySize = (arraySize > 100)? (int)(arraySize *1.5) : arraySize * 2;
		
		/*
		int newArraySize = arraySize *2;
		if(arraySize>100) {
			newArraySize = (int) (arraySize*1.5);
		}*/
		/*
		int newArraySize;
		if(arraySize > 100) {
			 newArraySize = (int)(arraySize *1.5);
		}
		else
		{
			 newArraySize =arraySize * 2;
		}*/
	//3. create the new array
		char[] newElements = new char[newArraySize];
	//4. copy all elements from the old array to the new array
		for(int i = 0; i < elementCounter;i++) {
			newElements[i] = elements[i];
		}
	//5. change reference to the new array and it's size
		elements = newElements;
		arraySize = newArraySize;
	}
	

}
