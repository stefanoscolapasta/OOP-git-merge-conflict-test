public final class HelloWorld {

	private static final String AUTHOR = "Danilo Pianini";

	public static void main(final String[] args) {
<<<<<<< HEAD
		System.out.println("This program is running in a PC with " + procNumber() + " logic processors!");
		System.out.println(printName());
	}

	public static int procNumber() {
		return Runtime.getRuntime().availableProcessors();
=======}
	public static void printName(){
		System.out.println("This program has been realised by " + AUTHOR);
>>>>>>> feature
	}

}
