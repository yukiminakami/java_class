public class Main {
  public static void main(String[] args) {
    Book book = new Book("Javaの絵本",2000);
    String bookName = book.name;
    int buyNumber = 3;
    int sumPrice = book.purchasePrice(buyNumber);
    System.out.println(bookName + "を" + Integer.toString(buyNumber) + "個買います。");
    //Javaの絵本を3個買います。
    System.out.println("価格は" + Integer.toString(sumPrice) + "円です。");
    //価格は6000円です。
  }
}
