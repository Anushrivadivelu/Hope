package day19;
class Timer{
  void time(){
    System.out.println("time started");
  }
}class Music{
  void music(){
    System.out.println("music");
  }
}
public class threadsimplementation {
  public static void main(String[] args) {
    Music m = new Music();
    Timer t = new Timer();
    t.time();
    m.music();
  }
}
