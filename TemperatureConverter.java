import java.util.Scanner;

class temperatureConverter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome");
		System.out.println("TEMPRATURE CONVERTER");

		System.out.println("1. Celsius");
		System.out.println("2. Fahrenheit");
		System.out.println("3. Rankine");

		System.out.print("Enter Your Option: ");
		int opt = sc.nextInt();

		if (opt > 0 && opt <= 3) {

			System.out.print("Enter Your Temprature(Kelvin): ");
			float kel = sc.nextFloat();

			if (opt == 1) {
				double cel = kel - 273.15;
				System.out.println("Temprature converts into Kelvin to Celsius");
				System.out.println(kel + " Kelvin = " + cel + " Celsius");
			} else if (opt == 2) {
				double fah = (kel - 273.15) * 9 / 5 + 32;
				System.out.println("Temprature converts into Kelvin to Fahrenheit");
				System.out.println(kel + " Kelvin = " + fah + " Fahrenheit");
			} else if (opt == 3) {
				double ran = kel * 9 / 5;
				System.out.println("Temprature converts into Kelvin to Rankine");
				System.out.println(kel + " Kelvin = " + ran + " Rankine");
			}
		} else {
			System.out.println("You entered wrong option");
		}
	}
}