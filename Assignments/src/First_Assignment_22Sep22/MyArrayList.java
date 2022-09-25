/*
 
 3.) Implement your own custom ArrayList i.e MyArrayList
As we know,we have a arraylist class in java language, assume that it is not provided by the java 
and we need to create our own class which will
provide a feature to insert, delete, retrieve, an element based on its index from the list of 
objects.

 */

package First_Assignment_22Sep22;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.Scanner;


class MyCustomArrayList<Array> {

	private static final int InitialCapacity = 10;
	
	private Object elementData[] = {};
	private int size = 0;
	public MyCustomArrayList() {
		elementData = new Object[InitialCapacity];
	}

	public void add(Array arr) {
		if (size == elementData.length) {
			ensureCapacity();
		}
		elementData[size++] = arr;
	}

	@SuppressWarnings("unchecked")
	public Array get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		return (Array) elementData[index];
	}

	public Object remove(int index) {
		
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}

		Object removedElement = elementData[index];
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;

		return removedElement;
	}

	private void ensureCapacity() {
		int newIncreasedCapacity = elementData.length * 2;
		elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
	}

	public void display() {
		System.out.print("Displaying list : ");
		for (int i = 0; i < size; i++) {
			System.out.print(elementData[i] + " ");
		}
	}

}

public class MyArrayList {

	public static void main(String[] args) {	
	
		MyCustomArrayList<Integer> list = new MyCustomArrayList<Integer>();
		
		list.add(36);
		list.add(35);
		list.add(96);
		list.add(19);
		list.add(64);
		list.add(91);
		list.add(48);
		list.add(85);
		
		list.display();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter which index you want to get");
		int x=sc.nextInt();
        System.out.println("The element at given index is: "+list.get(x));
        System.out.println("Please enter which index you want to remove");
        int y=sc.nextInt();
        System.out.println("The element at given index is: "+list.remove(y));
		
		

		
		System.out.println("\nlet's display custom ArrayList again after removal at index "+y);

		list.display();

		
	}

}