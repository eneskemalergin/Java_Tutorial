// Author : Enes Kemal Ergin
/*
	This shows ArrayList usage.
*/

import java.util.ArrayList;

public class CarFilo{
	public static void main(String[] args) {
		ArrayList<String> filo = new ArrayList<String>();

		filo.add("Toyota Camry - 2015");
		filo.add("BMW M6 - 2013");
		filo.add("Honda CR-V - 2014");
		filo.add("Nissan Juke - 2011");

		System.out.println(filo);

		int location = filo.indexOf("Nissan Juke - 2011"); // Find the index
		filo.remove(location); // Removes the car from specified index
		System.out.println(filo);

		System.out.println("At index 1: " + filo.get(1));
		filo.add(2, "Porsche Cayenne - 2015");
		System.out.println("Size of the my filo: " + filo.size());

		int index = 0;
		while(index < filo.size()){
			System.out.println(filo.get(index));
			index++;
		}
	}
}