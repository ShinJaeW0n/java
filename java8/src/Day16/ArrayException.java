package Day16;


			//����ó��
public class ArrayException {						//������ throws �ڿ� s �ٿ������!!
			public static void main(String[] args) /*throws ArithmeticException*/ {
				exceptionTest(); //static�� ��ü �ȸ�����. �ڹٴ� ����ó���� ������ �������.
				
				}
						//�갡 ����Ʈ������ �ۺ� �������� ��ü�� ������༭ �޼ҵ带 ȣ��������Ѵ�.
			static void exceptionTest() {
					int[] arr = new int[3];
					try {
					
					arr[2] = 100; //3�� ����. 0 1 2 �̱� ������. //���⼭ ���ܰ� �߻��ϸ� �ٷ� catch�� �Ѿ��.
					System.out.println(arr[2]); //�� �ٿ��� ���ܰ� �߻��ϸ� �� ��¹��� ��ġġ �ʰ� �ٷ� catch�������� �Ѿ��.
					
					//��ü�� ���� ������. , ���������� ���ܸ� �߻���Ű���� ��ü�� �����ؼ� throw�մϴ�.
//					throw new ArrayIndexOutOfBoundsException(); // <- �긦 �ּ�ó���ϸ� catch ������ ��µ��� �ʴ´�.
					}
					//��Ȳ�� �´� ���ܸ� ȣ���ؾ��Ѵ�. �ƹ��͵� �𸣰����� ��� ������ �θ��� Exception�� ȣ���Ѵ�.
					//catch ������ ���ܰ� �߻��ؾ����� ��µȴ�.
					 catch(ArithmeticException | ArrayIndexOutOfBoundsException e) { //������ �ѹ��� ����� ����� �� �ִ�.
						System.out.println("���� ������ �Ұ����մϴ�.");
					}
//					catch(ArrayIndexOutOfBoundsException e) {
//						System.out.println("�迭�� ������ �Ѿ ����� �� �����ϴ�.");
//					}
					catch(Exception e) { //����ġ���� ����Ʈ�� ���� ���� �ø��� �ؿ��ֵ��� ����� �� ���� ��ó��, ��� ���� ó���ع����� ������ �ؿ� �ֵ��� �� ���� ����.
						System.out.println("�߻��� ��� ���ܸ� ó���մϴ�."); //Exception�� ��� ���ܸ� ó���ع����� ������ ���� �������� ����ؾ���.
						e.printStackTrace(); // <- ��� �߸��Ǿ����� ������ �˷��ش�.
					}	finally {	//<- ���ܿ� ������� ������ ����Ǵ� ����. ��������. catch������ ����ǰ� finally ���� ������ �ȴ�. 
						System.out.println("finally �����Դϴ�.");
					}
			
					
					
					//Thread.sleep(1000) <- �� ������ �ؿ�ó��.
					try {
						Thread.sleep(1000);	//����ó�� ���̴� ������ �Ұ����� �ڵ��.
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			
			}

			}
