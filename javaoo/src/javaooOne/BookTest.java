package javaooOne;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("123","123-321",98.5,5);
		BookBiz bookBiz = new BookBiz();
		bookBiz.sellBook(book);
		System.out.println(book.getCount());
		int[] nums = {1,2};
		//ÒýÓÃ´«µÝ
		Swap(nums);
		System.out.println(nums[0]+"\t"+nums[1]);
	}
	public static void Swap(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
	}
}
