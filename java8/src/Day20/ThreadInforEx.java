package Day20;

import java.util.Map;
import java.util.Set;

		//Thread �׷� -1

public class ThreadInforEx {

	public static void main(String[] args) {
			AutoSaveThread autoSaveThread = new AutoSaveThread();
			autoSaveThread.setName("AutoSaveThread");
			autoSaveThread.setDaemon(true); //setDaemon�� start()���� �ؾߵ�. �׷��� �����.
			autoSaveThread.start();
			
			Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
			Set<Thread> threads = map.keySet();
			for(Thread thread : threads) {
				System.out.println("Name: " + thread.getName() + ((thread.isDaemon())? "(����)" : "(��)"));
				System.out.println("\t" + "�Ҽӱ׷�" + thread.getThreadGroup().getName());
				System.out.println();
			}
	}
		
}


//��±���
/*Name: Signal Dispatcher(����)
	�Ҽӱ׷�system

Name: AutoSaveThread(����)
	�Ҽӱ׷�main

Name: main(��)
	�Ҽӱ׷�main

Name: Attach Listener(����)
	�Ҽӱ׷�system

Name: Finalizer(����)
	�Ҽӱ׷�system

Name: Reference Handler(����)
	�Ҽӱ׷�system
*/
