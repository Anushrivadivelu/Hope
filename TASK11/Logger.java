package task11;

import java.util.*;
public class Logger {
  List<LogMessage> logs = new ArrayList<>();
  public void log(String msg) {
    synchronized (logs) {
      logs.add(new LogMessage(msg));
      logs.notify();
    }
  }
  public LogMessage getLog() throws InterruptedException {
    synchronized (logs) {
      while (logs.isEmpty()) {
        logs.wait();
      }
      return logs.remove(0);
    }
  }
  public void printLogs() {
    Iterator<LogMessage> it = logs.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
  public void sortByMessage() {
    Collections.sort(logs, (a, b) -> a.message.compareTo(b.message));
  }
  public void sortByTime() {
    Collections.sort(logs);
  }
}
