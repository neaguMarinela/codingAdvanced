package sat_16_03.producerAndConsumer;

/**
 * This class implements a consumer of events.
 *
 */
public class Consumer implements Runnable {

	private EventStorage storage;

	public Consumer(EventStorage storage){
		this.storage=storage;
	}
	@Override
	public void run() {
		for (int i=0; i<100; i++){
			storage.get();
		}
	}
}
