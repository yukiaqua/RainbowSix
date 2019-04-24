package test;

public class main {

	private String bookname;
	private int cost;
	private int code;

	public String bookname(){
		return bookname;
	}
	public int cost(){
		return cost;
	}
	public int code(){
		return code;
	}

	public static void main(String[] args) {
		main Book = new main();
		Book.bookname = "赤軍に勝るものなし";
		Book.cost = 1922;
		Book.code = 19221991;

	}
}

