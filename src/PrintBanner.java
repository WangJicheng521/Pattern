//  ≈‰∆˜
public class PrintBanner extends Banner implements Print {
	
	public PrintBanner(String name) {
		super(name);
	}

	@Override
	public void printWeak() {
		showWithParen();

	}

	@Override
	public void printStrong() {
		showWithAster();

	}

}
