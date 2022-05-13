// Name : Anthony Esterly
// Class : CIST1400-820
// Colleagues :
// Resources :
public class Item {
   private String item;
   private int quantity;
   public static int MAX = 25;
   public static int MIN = 1; 

// Constructor
   public Item(){
      this.item = "none";
      this.quantity = MIN;
   }

//Defualt Constructor 
   public Item(String n, int q){
      if(n.length()>0)
         this.item = n;
      else
         this.item = "none";
      if(q >= MIN && q <= MAX)
         this.quantity = q;
      else 
         this.quantity = MIN;
   }

//Increase 
   public void increaseQuantity() {
      if (quantity < MAX) {
         this.quantity += 1;
      }
   }

//Getters
   public int getQuantity(){
      return quantity;
   }

   public String getItemName(){
      return item;
   }

//Setters
   public void setItemName(String n){
      this.item = n;
   }

   public void setQuantity(int q){
      this.quantity = q;
   }

//ToString
   @Override
   public String toString(){
      return (getItemName() + " : " + getQuantity());
   }

//Equals
   @Override
   public boolean equals(Object o){
      Item i = (Item) o;
      if(item.equalsIgnoreCase(i.getItemName()) && quantity == i.getQuantity())
         return true;
      else 
         return false;
   }












}