package Day20;

	//notify -�����ִ°��� �����ִ°�. ( ������ ���� ����) -1

public class DataBox {
		
	/*   ***synchronized ������ wait �� �� �ִ� */
		private String data;
		
		public synchronized String getData() {
			if(this.data == null) { // data �ʵ尡 null�̸� �Һ��� �����带 �Ͻ����� ���·� ����.
				try { wait(); } catch (InterruptedException e) {}
			}
			
			//�����Ͱ� null�� �ƴ϶��
			String returnValue = data; //null�� �ƴ϶�� ���Ϻ��� ��������
			System.out.println("ConsumerThread�� ���� ������: " + returnValue);
			data = null; //������ �ʵ带 null�� ����� ������ �����带 ���� ��� ���·� ����.
			notify(); //�ٸ� ���� ������ �� �ֵ��� �ٸ� �����带 ������.
			return returnValue;
			
			}
		
		public synchronized void setData (String data){
			if(this.data != null) { //data �ʵ尡 null�� �ƴϸ� ������ �����带 �Ͻ����� ���·� ����. 
				try { wait();}catch(InterruptedException e) {};
					
			}
			this.data = data; //data ��Ʈ�� ���� �����ϰ� �Һ��� �����带 ������ ���·� ����.
			System.out.println("ProducerThread�� ������ ������: " + data);
			notify();
		
		}
			
		}
	

