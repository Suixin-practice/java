package javaooOne;

public class BookBiz {
	public int sellBook(Book book) {
		//1判断库存是否大于1
		//2图书的库存-1
		//3返回销售数量
		if(!(book.getCount()>1)) {
			return -1;
		}
		book.setCount(book.getCount()-1);
		return 1;
	}
}
