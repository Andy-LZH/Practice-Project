package Project;

public class MultPractice implements StudyPractice {
  private int firstIntegar;
  private int initialSecond;


  public MultPractice(int firstIntegar, int initialSecond){
    this.firstIntegar = firstIntegar;
    this.initialSecond = initialSecond;

  }

  public String getProblem( ){
    Integer a = new Integer(firstIntegar);
    Integer b = new Integer(initialSecond);
    return a  + " TIMES " + b;

  }
  public void nextProblem( ){


    initialSecond += 1;






    }

  public static void main(String[] args) {
    MultPractice a = new MultPractice(3,4);

    a.nextProblem();
    a.nextProblem();
    System.out.println(a.getProblem());

  }

  }
