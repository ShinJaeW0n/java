package Day12;

			//��ü�� �ܺο��� �������� �ʰ� �� �ϳ��� ������ ��. singleton ���������� ���뾲�� �ڹٿ��� �Ⱦ�.
public class Singleton {
		private static Singleton singgleton = new Singleton();
		
		private Singleton() {
			
		}

		static Singleton getInstance() {
			return singgleton;
		}

}
