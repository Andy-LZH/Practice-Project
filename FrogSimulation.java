package Project;

public class FrogSimulation {
  private int goalDistance;
  private int maxHops;

  public FrogSimulation(int dist, int numHops){

    goalDistance = dist;
    maxHops = numHops;

  }
  private int hopDistance(){
    return (int)(Math.random() * 50 - 25);

  }

  public boolean simulate(){
    int currentDistance = 0;
    for(int i = 0; i < maxHops; i++){

      currentDistance += hopDistance();

      if(currentDistance >= goalDistance){
        return true;

      }else if(currentDistance < 0){
        return false;
      }


    }
    return false;
  }

  public double runSimulations(int num){

    int currentTrue = 0;
    for(int i = 0; i < num; i++) {

      if(simulate() == true){

        currentTrue += 1;

      }

    }
    return (double)currentTrue/num;
  }

  public static void main(String[] args) {
    FrogSimulation a = new FrogSimulation(24, 5);

  }

}
