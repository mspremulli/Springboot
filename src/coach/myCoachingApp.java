package coach;

public class myCoachingApp {
  public static void main (String[] args){
    BaseballCoach baseballCoach = new BaseballCoach();
    System.out.println(baseballCoach.getDailyWorkout());

    TrackCoach trackCoach = new TrackCoach();
    System.out.println(trackCoach.getDailyWorkout());
  }


}
