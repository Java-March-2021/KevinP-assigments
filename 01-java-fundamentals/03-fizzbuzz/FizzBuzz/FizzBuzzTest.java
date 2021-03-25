public class FizzBuzzTest{
    public static void main(String[]args) {
        FizzBuzz value = new FizzBuzz();
        String result = value.fizzbuzz(3);
        System.out.println(result);
        String result1 = value.fizzbuzz(5);
        System.out.println(result1);
        String result2 = value.fizzbuzz(15);
        System.out.println(result2);
        String result3 = value.fizzbuzz(2);
        System.out.println(result3);
    }
}