public class MenuSpecial extends Menu {
	public int menuDiscount;

	public MenuSpecial(String menuCode, String menuName, int menuPrice, int menuDiscount) {
		super(menuName, menuName, menuPrice);
		this.menuCode = menuCode;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
		this.menuDiscount = menuDiscount;

	}

	public void Discount(int newValue) {
		menuDiscount = newValue;
	}

}