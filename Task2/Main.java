package Task2;

public class Main {
  public static void main(String[] args) {
    Numeric<Integer> iob = new Numeric<Integer>(5);

    System.out.println("Обратная величина iob" + iob.reciprocal());
    System.out.println("Дробная часть iob" + iob.fraction());

    Numeric<Double> dob = new Numeric<Double>(5.55);

    System.out.println("Обратная величина dob" + dob.reciprocal());
    System.out.println("Дробная часть dob" + dob.fraction());

    //Numeric<String> sob = new Numeric<String>("5.55");
  }
}