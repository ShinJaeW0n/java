package Day16;

public class Key {
			
			public int number;
	
			public Key (int number) {
				this.number = number;
			}

			@Override
			public boolean equals(Object obj) {
				if(obj instanceof Key) {
					Key compareKey = (Key) obj;
					
					//�Ѵ� int�̱� ������ �� �񱳸� �Ѵ�.
					if(this.number == compareKey.number) {
						return true;
				}
				
			
				}
				return false;
			}
				

//			@Override
//			public int hashCode() {
//			
//				return number;
//			}
//			
//			
			
			
			@Override
			public String toString() {
			
				return "key ��ü�� ����� number: " + number;
			}
			
			
}
		
