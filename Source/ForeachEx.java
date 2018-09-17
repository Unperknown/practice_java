public class ForeachEx {
	enum Week { 월, 화, 수, 목, 금, 토, 일 };
	
	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5 };
		String name[] = { "Apple", "Pear", "Banana", "Cherry" };
		
		int sum = 0;
		
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println();
		
		for (String s : name) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for (Week day : Week.values()) {
			System.out.print(day + "요일 ");
		}
		System.out.println();
	}

}
