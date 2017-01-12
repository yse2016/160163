public class Aloha2{
public static void main(String[] args) {
		Alohaman2 am = new Alohaman2();
		if(args.length == 1){
			am.sayAloha(Integer.parseInt(args[0]));
		}else if(args.length == 2){
			am.sayAloha(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		am.sayAloha(30,5);
		}
	}
}
	class Alohaman2{
		private String msg;
		private String msg2;

		public Alohaman2(){
			this.msg=msg;
			this.msg2=msg2;
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