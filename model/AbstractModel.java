package model;

import java.util.ArrayList;

public abstract class AbstractModel implements IUpdatable {
	private ArrayList<ISubscriber> subscribers;
	public AbstractModel() {
		subscribers = new ArrayList<ISubscriber>();
	}
	@Override
	public void addSubscriber(ISubscriber subscriber) {
		subscribers.add(subscriber);
	}
	@Override
	public void removeSubscriber(ISubscriber subscriber) {
		subscribers.remove(subscriber);
	}
	
	protected void notifySubscribers() {
		for (ISubscriber subscriber : subscribers) {
			subscriber.updateModel(this);
		}
	}

}
