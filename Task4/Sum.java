package Task4;

public class Sum {

  private int sum;

  <T extends Number> Sum (T args) {
    sum = 0;

    for (int index = 0; index <= args.intValue(); index++) {
      sum+=1;
    }
  }

  int getSum() {
    return getSum();
  }
  
}
