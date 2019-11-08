package assignments;

public class CarPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cars = 100, drivers = 30, passengers = 90, cars_not_driven, cars_driven;
		double space_in_a_car = 4.0, carpool_capacity, average_passangers_per_car;
		double average_miles_driven = 29.2, average_MPG = 23.6, gas_cost_per_gallon = 2.517, money_saved;
		double gas_cost_per_trip;

		cars_not_driven = cars - drivers;
		cars_driven = drivers;
		carpool_capacity = cars_driven * space_in_a_car;
		average_passangers_per_car = (double) passengers / (double) cars_driven;
		gas_cost_per_trip = (average_miles_driven * gas_cost_per_gallon) / average_MPG;
		money_saved = (gas_cost_per_trip * cars) - (gas_cost_per_trip * cars_driven);

		System.out.println("There are " + cars + " cars available");
		System.out.println("There are only " + drivers + " drivers available");
		System.out.println("That means there will be " + cars_not_driven + " empty cars today!");
		System.out.println("We can transport " + carpool_capacity + " people today.");
		System.out.println("Out of that, we're transporting " + passengers + " today");
		System.out.println("So we'll need to put about " + average_passangers_per_car + " in each car.");
		System.out.println("Long story short, today, we'll be saving about $" + money_saved);

	}

}
