class Book {
  public String name;
  public int price;
  public Book(String name, int price){
    this.name = name;
    this.price = price;
  }
  public int purchasePrice(int n){
    return this.price * n;
  }
}
