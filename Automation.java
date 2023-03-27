package week6.day1;
public class Automation extends MultipleLanguage{ 

	 	public static void main(String[] args) {
			Automation a = new Automation();
			a.selenium();
			a.java();
			a.ruby();
	 	}
	 	public void java() {
	 		System.out.println("JaVa");
	 	}
	 		
	 	
		public void selenium() {
			System.out.println("SeLeNiUm");
			
		}

		@Override
		public void ruby() {
			// TODO Auto-generated method stub
			System.out.println("RuBy");
		}}