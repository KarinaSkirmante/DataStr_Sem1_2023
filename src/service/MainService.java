package service;

import java.util.Arrays;

import datastr.MyArrayList;
import datastr.SortingType;

public class MainService {

	public static void main(String[] args){
		MyArrayList charList = new MyArrayList();
		try
		{
			charList.add('a'); //a
			charList.add('f'); //a f
			charList.add('b'); //a f b
			charList.add('z', 0); //z a f b
			charList.print(); // z a f b
			System.out.println(charList.howManyElements());//4
			charList.remove(1);//z f b
			charList.print();//z f b
			System.out.println(charList.retrieve(1)); //f
			System.out.println("Search: " + charList.search('š'));//true
			charList.add('d');//z f b d
			charList.add('z');//z f b d z
			charList.add('a');//z f b d z a
			charList.add('z');//z f b d z a z  increase() will be called
			System.out.println(Arrays.toString(charList.retrieveNextNeigbours('z')));//f a
			System.out.println(charList.sort(SortingType.ASC)); //a b d f z z z 
			charList.print();//z f b d z a z
			charList.makeEmpty();//empty array
			//charList.print();//empty array
			charList.add('d');//d
			charList.print();//d
			
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
