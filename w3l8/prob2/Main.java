package w3l8.prob2;

import java.util.List;
import java.util.ArrayList;

public class Main {

	List<Marketing> marketingList = null;

	public Main() {
		marketingList = new ArrayList<>();
	}

	public void add(Marketing m) {
		marketingList.add(m);
	}

	public boolean remove(Marketing m) {
		return marketingList.remove(m);
	}

	void printSizeOfList() {
		marketingList.forEach(System.out::println);
	}

	void sortBySales() {
		marketingList.sort(new MarketingBySalesComparator());
	}

	List<Marketing> sortByEmployeeName() {
		List<Marketing> temp = new ArrayList<>();
		for (Marketing marketing : marketingList) {
			if (marketing.getSalesAmount() > 1000) {
				temp.add(marketing);
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Main main = new Main();
		
		Marketing m1 = new Marketing("Aday", "Flowers", 2000);
		Marketing m2 = new Marketing("Gelila", "Habesah Dress", 5200);
		Marketing m3 = new Marketing("Yohana", "Leather bags", 2000);

		Marketing m4 = new Marketing("Rahwa", "Spices", 620);
		Marketing m5 = new Marketing("Rahel", "Human hair", 450);
		Marketing m6 = new Marketing("Makda", "Leather bags", 2000);

		Marketing m7 = new Marketing("Adam Reta", "Books", 1334);
		Marketing m8 = new Marketing("Gebreselassie", " Running kit", 500);
		Marketing m9 = new Marketing("Brook", "Shoes", 200);
		
		main.marketingList.add(m1);
		main.marketingList.add(m2);
		main.marketingList.add(m3);
		main.marketingList.add(m4);
		main.marketingList.add(m5);
		main.marketingList.add(m6);
		main.marketingList.add(m7);
		main.marketingList.add(m8);
		main.marketingList.add(m9);
		
		main.printSizeOfList();
		
		System.out.println("-------------------------------\nAfter sorting by sales\n");
		
		main.sortBySales();
		main.printSizeOfList();
		
		System.out.println("--------------------------------\nBefore sorting by Employee name\n");
		
		List<Marketing> greater1000 = main.sortByEmployeeName();
		greater1000.forEach(System.out::println);
		greater1000.sort(new EmployeeNameComparator());
		System.out.println("----------------------------------\nAfter sorting > 1000 salers by Employee name\n");
		greater1000.forEach(System.out::println);
	}

}
