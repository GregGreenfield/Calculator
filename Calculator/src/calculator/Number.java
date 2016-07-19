package calculator;

public class Number {
	private String id;
	private double num;
	
	public Number(){
		id = "-1";
		num = 0;
	}
	
	public Number(String id, double num) {
		super();
		this.id = id;
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}
	
	
	
}
