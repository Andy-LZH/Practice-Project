package Project;

public class Project1 {/*

	1.  1 -100区间加奇数


*/


  public static void main(String[] args) {
    int a = 0;

    for(int i = 1; i < 101; i += 2){
      a = a + i ; /*

      problem at first place: wrongly create a new variable, int add = a + i; - - - seemed as sout(i), 1 , 3 ,5 ,7 ,9

      */

      System.out.println(a);



    }



  }

}
