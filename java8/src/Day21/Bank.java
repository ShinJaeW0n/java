package Day21;

			//������ �ǽ����� - 2 // Ŭ������ �����Ҷ� �� Ŭ���� �̸��� �ۺ��̾���Ѵ�.
		class Bank {
		
		private int bk =  1_000_000;
		
		int amt = 9800;
		
		//�� �޼ҵ尡 ���������� �ٸ� �޼ҵ� ���� ����
		synchronized void withDraw (int amt) {
			if(bk - amt < 0) {
				Thread.currentThread().interrupt();
			}else {
				bk -=amt;
				System.out.println(amt + "����" + Thread.currentThread().getName() + "�� ����, ���� �ܾ� : " + getamt());
				
			}
			
		}
			//���� �Ѿ�
		int getamt() {
			return bk;
		}
	
	}

		
	class Customer extends Thread{
		private Bank acc1;
		
		public Customer(Bank acc) {
		this.acc1 = acc;		
			
			}
		@Override
		public void run() {
			
			while(true) {
					acc1.withDraw(9800);
					
					if(interrupted()) { //interrupted - �����尡 ���ͷ�Ʈ �Ǿ��ִ��� Ȯ���Ҷ� ��.
						break;
						
					}
				}
		
		}
	}

	
		