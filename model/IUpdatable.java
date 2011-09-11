package model;

public interface IUpdatable {
	void addSubscriber(ISubscriber subscriber);
	void removeSubscriber(ISubscriber subscriber);
}
