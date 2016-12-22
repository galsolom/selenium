package Lesson3a;

public  class utilsClass {

	public static class autoUtils {

		public static void printCurrentTimeInMs() {
			System.out.println(System.currentTimeMillis());
		}

		public static int calcInts(int x, int y) {
			return Math.addExact(x, y);
		}

	}

}
