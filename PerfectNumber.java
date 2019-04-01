package Project;

public class PerfectNumber {


  public static boolean isItPerfectNumber(int a) {

int sum = 0;// if sum is inside the for, it would also repeat itself creating new instance 0 + i, 0 + i,
    for (int i = 1; i < a; i++) {


      if(a % i == 0){
      sum += i;
        System.out.println(sum);
      }

    }


    if ( sum != a) {

      return false;


    }

    return true;
  }

  public static void main(String[] args) {


    System.out.println(isItPerfectNumber(8));

  }
}


