package task7;

public class libraryinheritance{
  public static void main(String[] args) {
    Library l1 = new Library("os", 11);
    Library l2 = new Library("daa", 14);
    l1.display();
    l2.display();
    l1.issued();
    l1.returned();
    l2.issued();
    l2.returned();

  }
}
class Library {
    private String bName;
    private int bId;
    private boolean isIssued;

    Library(String bName, int bId) {
        this.bName = bName;
        this.bId = bId;
        this.isIssued = false;
    }

    void display() {
        System.out.println("Book: " + bName);
        System.out.println("ID: " + bId);
        System.out.println("Issued: " + (isIssued ? "Yes" : "No"));
        System.out.println();
    }

    void issued() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("issued!");
        } else {
            System.out.println( " already issued!");
        }
    }

    void returned() {
        if (isIssued) {
            isIssued = false;
            System.out.println("returned!");
        } else {
            System.out.println(" not issued!");
        }
    }
}