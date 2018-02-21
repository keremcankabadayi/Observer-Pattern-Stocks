
public class StockObserver implements Observer {

	private double xPrice, yPrice, zPrice;
	private static int observerIDTracker = 0;
	private int observerID;

	private Subject stockGrabber;

	public StockObserver(Subject stockGrabber) {

		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer " + this.observerID);
		stockGrabber.register(this);
	}

	@Override
	public void update(double xPrice, double yPrice, double zPrice) {
		// TODO Auto-generated method stub

		this.xPrice = xPrice;
		this.yPrice = yPrice;
		this.zPrice = zPrice;

		printThePrices();

	}

	private void printThePrices() {
		// TODO Auto-generated method stub
		System.out.println(observerID + "\nxPrice" + xPrice + "\nyPrice" + yPrice + "\nzPrice" + zPrice);
	}

}
