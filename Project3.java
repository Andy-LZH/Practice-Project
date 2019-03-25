package Project;

public class Project3 {
  // 3. 3或者是5的倍数相加，1-100


  public static void main(String[] args) {

    int a = 0;
  for(int i =0; i <101; i++) {

    if (i % 3 == 0 || i % 5 == 0){
      /*

      第一遍code时存在问题。：==，且 = 时 || 报bug

      */

      System.out.println(a+=i);



    }

    }


  }

  }

