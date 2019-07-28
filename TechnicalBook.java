class TechnicalBook extends Book{
  public String genre;
  public String target;
  public TechnicalBook(String name, int price, String genre, String target){
    super(name,price);
    this.genre = genre;
    this.target = target;
  }
  public boolean matchingUser(String job){
    return job.equals(this.target);
  }
}
