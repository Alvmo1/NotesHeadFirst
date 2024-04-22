package notes;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model S", 2024);
        System.out.println("Car model: " + myCar.model);
        System.out.println("Car year: " + myCar.year);

        int sum = Calculator.add(5, 3);
        double result = Calculator.divide(10.0, 2.0);
        System.out.println("Sum: " + sum);
        System.out.println("Result: " + result);
    }
}
