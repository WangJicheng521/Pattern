package WeiTou;

public class PrintBanner extends Print{
	private Banner banner;
	public PrintBanner(String name){
		this.banner = new Banner(name);
	}
	@Override
	public void printWeek() {
		banner.showPrintParen();
		
	}

	@Override
	public void printStrong() {
		banner.showPrintAster();
		
	}

}
