package task11;

import java.util.*;

public class Logger {
  private List<LogMessage> logs = new ArrayList<>();
  public void log(String message, String level) {
    synchronized (logs) {
      logs.add(new LogMessage(message, level));
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
  public void printAllLogs() {
    synchronized (logs) {
      Iterator<LogMessage> it = logs.iterator();
      while (it.hasNext()) {
        System.out.println(it.next().format());
      }
    }
  }
  public List<LogMessage> getLogsSortedByLevel() {
    List<LogMessage> copy = new ArrayList<>(logs);
    copy.sort((a, b) -> a.getLevel().compareTo(b.getLevel()));
      return copy;
    }
  public List<LogMessage> getLogsSortedByTime() {
    List<LogMessage> copy = new ArrayList<>(logs);
    Collections.sort(copy);
    return copy;
  }
}
