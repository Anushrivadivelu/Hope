package task11;
public class Main {
  public static void main(String[] args) throws InterruptedException {
    Logger logger = new Logger();
    Worker worker = new Worker(logger);
    worker.start();
    for (int i = 0; i < 3; i++) {
      int threadNum = i;
      new Thread(() -> {
        for (int j = 0; j < 5; j++) {
          String level = (j % 2 == 0) ? "INFO" : "ERROR";
          logger.log("Thread " + threadNum + " -> Msg " + j, level);
        }
      }).start();
    }
    Thread.sleep(2000);
    System.out.println("\nAll Logs:");
    logger.printAllLogs();
    System.out.println("\nSorted by Level:");
    for (LogMessage log : logger.getLogsSortedByLevel()) {
      System.out.println(log.format());
    }
    System.out.println("\nSorted by Time:");
    for (LogMessage log : logger.getLogsSortedByTime()) {
      System.out.println(log.format());
    }
  }
}
