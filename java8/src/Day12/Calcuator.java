package Day12;

public class Calcuator {

	//�����ڴ� �������� ������ �ڵ� ������, ����Ʈ�����ڰ� ����.
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	//�ݵ�� int ���ϰ��� �־����.
	int plus (int x , int y) {
		int result = x + y;
		return result;
	}
	
	int plus (long x, long y) {
		int result = (int)x+(int)y + 10000;
		return result;
	}
	
	double divide(int x , int y) {
		double result = (double)x / y;
		return result;
	}
	
	void powerOff(){
		System.out.println("������ ���ϴ�.");
	}
		
}
