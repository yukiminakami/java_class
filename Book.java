class Book {
  private String name;
  private int page = 0;
  public Book(String name){
    this.name = name;
  }
  public void setPage(int page){
    if(page<=100){
      this.page += page;
    }
  }
  public int getPage(){
    return this.page;
  }
  public String getName(){
    return this.name;
  }
}
