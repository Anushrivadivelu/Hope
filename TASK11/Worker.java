package task11;

public class Worker extends Thread {
  Logger logger;
  public Worker(Logger logger) {
    this.logger = logger;
  }
  public void run() {
    while (true) {
      try {
        LogMessage log = logger.getLog();
        System.out.println(log);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  } 
}
