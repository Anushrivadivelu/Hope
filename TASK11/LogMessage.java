package task11;
public class LogMessage implements Comparable<LogMessage> {
  String message;
  long time;
  public LogMessage(String message) {
    this.message = message;
    this.time = System.currentTimeMillis();
  }
  public String toString() {
    return time + " : " + message;
  }
  public int compareTo(LogMessage other) {
    return (int)(this.time - other.time);
  }
}
