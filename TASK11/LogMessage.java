package task11;

public class LogMessage implements Comparable<LogMessage> {
  private String message;
  private long time;
  private String level;
  public LogMessage(String message, String level) {
    this.message = message;
    this.level = level;
    this.time = System.currentTimeMillis();
  }
  public String getLevel() {
    return level;
  }
  public long getTime() {
    return time;
  }
  public String format() {
    return "[" + level + "] [" + time + "] " + message;
  }
  @Override
  public int compareTo(LogMessage other) {
    return Long.compare(this.time, other.time);
  }
}
