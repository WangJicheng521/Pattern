package WeiTou;

public class Banner {
	private String name;
	public Banner(String name){
		this.name = name;
	}
	public void showPrintParen(){
		System.out.println("("+name+")");
	}
	public void showPrintAster(){
		System.out.println("*"+name+"*");
	}
}
