import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double xPrice, yPrice, zPrice;

	public StockGrabber() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {
		// TODO Auto-generated method stub
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		// TODO Auto-generated method stub
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Observer " + (observerIndex + 1) + " deleted.");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub

		for (Observer observer : observers) {
			observer.update(xPrice, yPrice, zPrice);
		}

	}

	public void setXprice(double newXprice) {
		xPrice = newXprice;
		notifyObserver();
	}

	public void setYprice(double newYprice) {
		yPrice = newYprice;
		notifyObserver();
	}

	public void setZprice(double newZprice) {
		zPrice = newZprice;
		notifyObserver();
	}

}
