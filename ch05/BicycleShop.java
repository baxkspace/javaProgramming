public class BicycleShop {
	private String shopID;
	private int saleForToday;
	static private int totalSale = 0;
	
	public BicycleShop(String shopName, int count) {
		shopID = shopName;
		saleForToday = count;
	}
	
	public void sold() {
		saleForToday++;
		totalSale++;
	}
	
	static public int overallSale() {
		return totalSale;
	}
	
	public void trackSaleStatus() {
		System.out.println(shopID + " 판매대수" + saleForToday);
	}
}