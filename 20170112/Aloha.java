public class Aloha{
	public static void main(String[] args) {
		Alohaman am = new Alohaman();
		am.sayAloha(105,15);
	}
}
	class Alohaman{
		private String msg;
		private String msg2;
		public Alohaman(){
			this.msg="ALOHA!";
			this.msg2="123456";
		}
		public void sayAloha(){
			System.out.println(this.msg);
		}
		public void sayAloha(int nud){
			for (int i=0; i<nud; i++) {
				System.out.println(i + this.msg);
			}	
		}
		public void sayAloha(int nud,int x){
			for (int i=0; i<nud; i++) {
				if (i%x == 0) {
					System.out.println(this.msg2);
				}else{
					System.out.println(this.msg);
				}
			}
		}
	}