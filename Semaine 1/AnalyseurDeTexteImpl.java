import java.util.ArrayList;
import java.util.List;

public class AnalyseurDeTexteImpl {

	private List<AnalyseurObserver> observers;

	public AnalyseurDeTexteImpl() {
		observers = new ArrayList<AnalyseurObserver>();
	}
	
	public void registerObserver(AnalyseurObserver observer) {
		observers.add(observer);
	}
	
	public void unRegisterObserver(AnalyseurObserver observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(String ligne) {
		for (AnalyseurObserver analyseurObserver : observers) {
			analyseurObserver.update(ligne);
		}
	}
	
	public void endObservers() {
		for (AnalyseurObserver analyseurObserver : observers) {
			analyseurObserver.print();
		}
	}
}
