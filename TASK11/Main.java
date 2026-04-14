package task11;
public class Main {
  public static void main(String[] args) throws Exception {
    Logger logger = new Logger();
    new Worker(logger).start();
    for (int i = 0; i < 2; i++) {
      int t = i;
      new Thread(() -> {
        for (int j = 0; j < 3; j++) {
          logger.log("Thread " + t + " Msg " + j);
        }
      }).start();
    }
    Thread.sleep(2000);
    System.out.println("\nAll Logs:");
    logger.printLogs();
    System.out.println("\nSorted by Message:");
    logger.sortByMessage();
    logger.printLogs();
    System.out.println("\nSorted by Time:");
    logger.sortByTime();
    logger.printLogs();
  }
}
