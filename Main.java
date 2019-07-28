public class Main {
  public static void main(String[] args) {
    Book book = new Book("Javaの絵本");
    String name = book.getName();
    book.setPage(20);
    int page = book.getPage();
    System.out.println("本の名前は" + name + "です。");
    System.out.println("現在のページは"+Integer.toString(page)+"です。");
  }
}
