
public class Automation extends MultiLanguage implements Language,TestTool {

	public void selenium() {
		System.out.println("selenium");
		
	}

	public void java() {
	System.out.println("java");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}

public static void main(String[] args) {
	Automation auto=new Automation();
	
	auto.java();
	auto.ruby();
	auto.selenium();
	auto.python();
	
}

	
	}