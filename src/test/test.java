package test;

public class test {
	
	//input : bbBbCccDaa
	//output : b3B1C1c2D1a2
	
	public static void main(String[] args) {
		
		
		String input = "bbBbCccDaa";
		String output ="b3B1C1c2D1a2";
		
		String store =input.replaceAll(input, output);
		
		System.out.println(store);
	}
	

}
