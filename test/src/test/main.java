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

	public String A_r(String a){
		bookname = a;
	}

	public int B_r(int b){
		cost = b;
	}

	public int C_r(int c){
		code = c;
	}
}

public class Main {
	public static void main(String[] args) {
	book Book = new book();

	Book.A_r = "祖国は我等の為に";
	Book.B_r = 648;
	Book.C_r = 1891;

    System.out.println(Book.A_r());
    System.out.println(Book.B_r());
    System.out.println(Book.C_r());

	}
}


