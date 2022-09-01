package bk2_02VariablesAndDataTypes;

public class ThinkingInsideTheBox {
	public static void main(String[] args) {
		ThinkingInsideTheBox thinking = new ThinkingInsideTheBox();
		thinking.boxingUnBoxing();		
	}
	
	private void boxingUnBoxing() {
		//Boxing occurs when converting a primitive value to its corresponding wrapped object.
		Integer wrap = 17;
		System.out.println(wrap);
		
		//unBoxing occurs when converting from a wrapped object to the corresponding primitive value.
		int prim = wrap;
		System.out.println(prim);
	}
	
}
