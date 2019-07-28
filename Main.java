public class Main {
  public static void main(String[] args) {
    int buyNumber = 3;
    int purchasePrice = technicalBook.purchasePrice(buyNumber);
    String userJob = "cook";

    TechnicalBook technicalBook = new TechnicalBook("Javaの絵本", 2000, "IT","engneer");
    System.out.println("本のタイトル:"+technicalBook.name);
    System.out.println("本の価格:"+technicalBook.price);
    System.out.println("本のジャンル:"+technicalBook.genre);
    System.out.println("本のターゲットユーザー:"+technicalBook.target);

    System.out.println(
        Integer.toString(buyNumber) +"冊買うと"+
        Integer.toString(purchasePrice)+"円");
    System.out.println(userJob+"はこの本のターゲットですか？"+technicalBook.matchingUser(userJob));
  }
}
