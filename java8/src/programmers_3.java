import java.util.Stack;


public class programmers_3 {
	public static void main(String[] args) {
		int[][] board = new int[][] {
			{0,0,0,0,0},
			{0,0,1,0,3},
			{0,2,5,0,1},
			{4,2,4,4,2},
			{3,5,1,4,1}};
		int[] moves = new int[] {1,5,3,5,1,2,1,4};
		System.out.println(solution(board,moves));
	}
	
	
	public static int solution(int[][] board, int[]moves) {
	
		int answer = 0;
		Stack<Integer> st = new Stack<>();  //stack�� ��������
		for(int i = 0; i < moves.length; i++) {
			for(int j = 0; j< board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
				 //�ش� ��ġ�� ������ �ִ� ���
					if(st.empty()) {
						//������ ���� ������ ����ִ� ���
						st.push(board[j][moves[i] - 1]);
					}else {
						//������ ������� ���� ���
						if(st.peek() == board[j][moves[i]-1]){
						//st.peek()�� ����Ͽ� ����ø� ������ ���� ���� �� ���� ���� ��쿡��
						st.pop();
						//���ÿ��� ������ ������ ��
						answer +=2;
						//answer�� 2 ���������ش�.
					}else {
						//st.peek()�� ����Ͽ� ����ø� ������ ���� ���� �� ���� �ٸ� ���
						st.push(board[j][moves[i]-1]);
						//���ÿ� ������ �־��ش�.
					}
				}
					//�Ϸ��� �۾��� ���� �� ������ ����ø� ��ǥ���� �� �̻� ������ �����Ƿ� 0�� �����Ѵ�.
					board[j][moves[i]-1] = 0;
					break;
			}
		}
		
	}
		return answer;
		
	
	}

}
