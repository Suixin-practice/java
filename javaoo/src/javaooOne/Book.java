package javaooOne;

public class Book {
	private String name;
	private String isbn;
	private String price;
	private int count;
	
	public Book() {
		
	}
	public Book(String name) {
		
	}
	public Book(String name,String isbn,double price,int count) {
		setName(name);
		setIsbn(isbn);
		setCount(count);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if(count<0) {
			count =0;
		}else {
			this.count = count;
		}
		this.count = count;
	}

}
