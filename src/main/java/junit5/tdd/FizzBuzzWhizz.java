package junit5.tdd;

public class FizzBuzzWhizz {

    public String play(int number) {
        StringBuilder result = new StringBuilder();
        if (number % 3 == 0) {
            result.append("Fizz");
        }
        if (number % 5 == 0) {
            result.append("Buzz");
        }
        if (number % 7 == 0) {
            result.append("Whizz");
        }
        if (result.toString().isEmpty()) {
            result.append(number);
        }
        return result.toString();
    }
}
