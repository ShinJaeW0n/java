package Day18;

public class MyFuncEx {

		public int outField = 10;
		
		//��øŬ����
		class Inner{
			int inField = 20;
			
			void method() {
				//���ٽ�
				MyFunc fi = () ->{
					System.out.println("outField: " + outField );//���� ������ �ִ� outField
					System.out.println("outField: " + MyFuncEx.this.outField + "\n" );//MyFuncEx�� �����ִ� outField
					System.out.println("inField: " + inField );//���� ������ �ִ� inField
					System.out.println("inField: " + this.inField + "\n" ); //this-���ڽ��� �����ִ�
													
				};
				fi.method();
				
				
				MyFunc fi2 = new MyFunc() { //�͸�����ü. �ν��Ͻ�.
					
					@Override
					public void method() {
						System.out.println("outField: " + outField );
						System.out.println("outField: " + MyFuncEx.this.outField + "\n" );
						System.out.println("inField: " + inField );
						System.out.println("inField: " + Inner.this.inField + "\n" );  
										//���ٴ� �޼ҵ��. 
					} 					//this.inField <- ���⼭ this�� fi2��� ��ü�� �Ǵ� ���̴�.
						
					
				};
			}
		}
		
}
