package Programmers;

import java.util.Arrays;

public class Solution001 {
	//Arrays.copyOfRange �̿��ؼ� Ǯ��.
	public int[] solution(int[] array, int[][] commands) {
	        
			int[] answer = new int[commands.length];
			for(int i = 0; i<commands.length; i++) { //�����迭	//1���� �����ϱ� ������ -1������Ѵ�.
				int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
				Arrays.parallelSort(temp);
				answer[i] = temp[commands[i][2] - 1];
			}
				return answer;
	      }
	
		
			
			
			
		}
	
	

	
