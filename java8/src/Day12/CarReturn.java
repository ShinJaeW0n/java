package Day12;

public class CarReturn {
	// �ʵ�
	int gas;

	// ������ - �����Ǹ� �⺻ ������ ����
	// �޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false; // false�� ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true; // true�� ����

	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�: " + gas + ")");
				gas -= 1;
				;
			} else {
				System.out.println("����ϴ�.(gas�ܷ�: " + gas + ")");
				return;
				//System.out.println("���� �� ���"); <- �����ϰ� ���� �� �̻� ������ �ʿ䰡 ���⶧���� �� �̻� ����� �ȵȴ�.
				//���� ��ȯ�� �ʿ䰡 ���� ������ ���ϵڿ� ���� ���� �ʾ�����
				//void �޼ҵ�� ������ ������ �Ǹ� �� ��� ���� ��ȯ�ϰ� �����.
				//****������ �޼ҵ带 ���߰��ϴ� ����� ������ �ִ�.
			}
		}

	}
	
	
}
