package java8;


import java.util.Random;

//import java.util.*;  //*�� �����̶�� ���̴�. �ڹ�.util�� �ִ� ������
//��� ���ڴٴ� ���̴�.

//�����Լ�
import java.util.Scanner;

public class Day0207 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in); //��ĳ�� �ۼ� ���
		Random rd = new Random(); //Random�� �Ű�����(�Է°�)�� �����ϴ�.
		System.out.println(rd.nextInt());
		//int�� -21��~21������� ���� �� �������� ����Ѵ�.
		
		System.out.println(rd.nextBoolean());
		//true�� false �� �� �ϳ��� �������� ��µ�.
		
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextFloat());
	//�Ǽ� ������ 0���� ũ�� �۰� 1���� ���� ���� ����Ѵ�.
		
		System.out.println(rd.nextLong());
		//int���� ū ���ڵ��� ��µȴ�.
		
		System.out.println(rd.nextGaussian());
		//����þ� ���� ���̹��� �˻��غ���.
		
		System.out.println(rd.nextInt(10)); 
		//nextInt(bound) 0���� ũ�ų� ���� 10���� ���� ���� ���. 10�� ��µ��� X
		
		System.out.println(Math.random()); //0���� ũ�ų� ���� 1���� ���� �Ǽ��� ����Ѵ�.
									//Math Ŭ������ �⺻���� Ŭ���� �̹Ƿ� ����Ʈ �� �ʿ� ����.
		System.out.println(rd.nextDouble()); // Math.random�� ��� ����.
		
		
	
	}
}
