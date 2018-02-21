
public class GrabStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver person1 = new StockObserver(stockGrabber);

		stockGrabber.setXprice(100);
		stockGrabber.setYprice(200);
		stockGrabber.setZprice(300);

		StockObserver person2 = new StockObserver(stockGrabber);

		stockGrabber.setXprice(100);
		stockGrabber.setYprice(200);
		stockGrabber.setZprice(300);

		// deleting observer

		stockGrabber.unregister(person2);

		stockGrabber.setXprice(100);
		stockGrabber.setYprice(200);
		stockGrabber.setZprice(300);
	}

}
