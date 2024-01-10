public class Product  {
  public String name;
  public int brutto;
  public int quantity;
  public productType type;


  public Product(String name, int brutto, int quantity, productType type)
  {
      this.name = name;
      this.brutto = brutto;
      this.quantity = quantity;
      this.type = type;
  }
    public void getInfo() {;
        System.out.println("Nazwa: " + this.name);
        System.out.println("Typ: " + this.type);
        System.out.println("Cena: " + this.brutto + " zł");
        System.out.println("W sklepie sztuk: " + this.quantity);
    }
   public void setPrice(int price)
   {
       this.brutto = price;
   }
   public void changeQuantity(int number)
   {
       this.quantity = number;
   }
}
