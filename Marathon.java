class Marathon {
	public static void main(String[] arguments) {
		String[] names = {
				"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane",
				"Emily", "Daniel", "Neda", "Aaron", "Kate" };
		int[] times = {
				341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
		
		for (int i = 0; i < names.length; i++) {
		}
		int firstPlace = 0;
		int firstIndex = 0;
		int secondPlace = 0;
		int secondIndex = 0;
		
		for (int i = 0; i < times.length; i++) {
			if (times[i] > firstPlace) {
				firstIndex = i;
				firstPlace = times[i];
			}
		}
		System.out.println(names[firstIndex] + " " + firstPlace);

		for (int j = 0; j < times.length; j++) {
			if (times[j] > secondPlace && times[j] != firstPlace) {
				secondIndex = j;
				secondPlace = times[j];
			}
		}
		System.out.println(names[secondIndex] + " " + secondPlace);
	}
}
