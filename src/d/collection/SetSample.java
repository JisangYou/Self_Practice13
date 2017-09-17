package d.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetSample sample = new SetSample();
		String[] cars = new String[] { "Tico", "Sonata", "BMW", "Benz", "Lexus", "Mustang", "Grandeure", "The Beetle",
				"Mini Cooper", "i30", "BMW", "Lexus", "Carnibal", "SM5", "SM7", "SM3", "Tico" };
		System.out.println(sample.getCarKinds(cars));

	}

	public int getCarKinds(String[] cars) {

		if (cars == null)
			return 0;
		if (cars.length == 1)
			return 1;
		Set<String> carSet = new HashSet<String>();
		for (String car : cars) {
			carSet.add(car);
		}
		printCarSet(carSet); // 같은 클래스내에 있는 메서드는 자유롭게 사용가능
		return carSet.size();
	}

	public void printCarSet(Set<String> carSet) {
		for (String temp : carSet) {
			System.out.println(temp + " ");
		}	
	}

	public void printCarSet2(Set<String> carSet) {
		Iterator<String> iterator = carSet.iterator();// 선언부 부분
		while(iterator.hasNext()){ 
			System.out.println(iterator.next()+" ");
			
		}
		
		System.out.println();
	}
}



































