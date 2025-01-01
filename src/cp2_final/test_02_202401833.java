package cp2_final;

import java.util.ArrayList;

public class test_02_202401833 {
	public static void main(String[] args) {
		System.out.println("202401833_신해솔");

	}
}

class Libray<T> {
	ArrayList<T> arr;
	
	public Libray() {
		arr = new ArrayList<T>();
	}
	
	void addItem(T item) {
		arr.add(item);
	}
	
	void removeBook(T item) {
		for (int i=0;i<arr.size();i++) {
			if (arr.get(i).equals(item)) {
				arr.remove(i);
				return;
			}
		}
		System.out.println("삭제할 항목이 없습니다.");
	}
	
	void displayItems() {
		if (arr.size() == 0) {
			System.out.println("현재 항목이 없습니다");
			return;
		}
		for (T item: arr) {
			System.out.println(item.toString());
		}
	}
}

class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return title + " " + author;
	}
	
	boolean equals(Book book) {
		return book.title == this.title | book.author == book.author;
	}
}