package Day19;

public class Member1 {
		
		private String name;
		private String id;
		
		public Member1() {
			System.out.println("Member1()����");
		}
		
		public Member1(String id) {
			System.out.println("Member(String id) ����");
			this.id = id;
		}
		
		
		public Member1(String name, String id) {
			System.out.println("Member(String name, String id)");
			this.name = name;
			this.id = id;
		}
		
		public String getId() { return id; }
	
			
}
