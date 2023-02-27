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

}
