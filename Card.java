
public class Card implements Ace {

	private String name;
	private int value;
	private int ace = 0;
	
	public int getAceValue() {
		return ace;
	}

	
	public void setAceValue(int num) {	
		ace = num;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setValue(int value) {
		this.value=value;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}

}
