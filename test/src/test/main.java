package test;

public class book {
	private String bookname = "赤軍に勝るものなし";
	private int cost = 1922;
	private int code = 19221991;

	public String A(){
		return bookname;
	}
	public int B(){
		return cost;
	}
	public int C(){
		return code;
	}
}

public class Main {
	public static void main(String[] args) {
	book Book = new book();

    System.out.println(Book.A());
    System.out.println(Book.B());
    System.out.println(Book.C());

	}
}


