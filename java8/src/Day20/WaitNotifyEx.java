package Day20;

//notify -�����ִ°��� �����ִ°�. 4 ���౸��.
public class WaitNotifyEx {
			
		public static void main(String[] args) {
			DataBox dataBox = new DataBox();
			
			ProducerThread produceThread = new ProducerThread(dataBox);
			ConsumerThread consumerThread = new ConsumerThread(dataBox);
			
			produceThread.start();
			consumerThread.start();
		}
			
	
}
