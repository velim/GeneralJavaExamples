package cz.velim.sandbox.compare;

public class Fruit implements Comparable<Fruit> {

	private String fruitName;
	private String fruitDesc;
	private String fruitColor;
	private int quantity;

	public Fruit(String fruitName, String fruitColor, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	
	public String getFruitColor() {
		return fruitColor;
	}

	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}

	public String getFruitDesc() {
		return fruitDesc;
	}

	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Fruit o) {
		return this.getQuantity() - o.getQuantity();
	}

}