// Name : Anthony Esterly
// Class : CIST1400-820
// Colleagues :
// Resources :
public class GroceryList {
   private int count;
   private Item[] list;
   public static final int MAXITEMS = 35;

//Constructor 
   public GroceryList(){
      this.count = 0;
      this.list = new Item[MAXITEMS];
   }
   
//Defualt Constructor    
   public GroceryList(Item[] source) {
      this.count = 0;
      this.list = new Item[MAXITEMS];
      for (int i = 0; i < source.length; i++){
         list[count] = source[i];
         count++;
      }
   }

//ADDING 
   public void add(Item m) {
      if (count < MAXITEMS) {
         this.list[count] = m;
         count++;
      } else {
         System.out.println(" List Has No More Room ");
      }
   
   }

// GETTERS 
   public int getCount(){
      return count;
   }
   public Item getItem(int pos)
   {
   
      if(pos < 0 || pos > count - 1 )
      {
         return null;
      }else
      {
         return list[pos];
      }
   }
   
//SUBSTRACTION 
   public void delete(int p) {
      if (count != 0) {
         for (int i = p - 1; i < count - 1; i++) {
            list[i] = list[i + 1];
         }
         count--;
      }
   
   }

//SORT
   public Item[] sortName() {
      Item temp;
      if (count > 0){
         for (int i = 0; i < count; i++){
            for (int j = i + 1; j < count; j++){
               if (list[i].getItemName().compareTo(list[j].getItemName()) > 0){
                  temp = list[i];
                  list[i] = list[j];
                  list[j] = temp;
               }
            }
         }
      }
      return list;
   }
   
   public Item[] sortQuant(){
      Item temp;
      if (count > 0){
         for (int i = 0; i < count; i++){
            for (int j = i + 1; j < count; j++){
               if (list[j].getQuantity() > list[i].getQuantity()){
                  temp = list[i];
                  list[i] = list[j];
                  list[j] = temp;
               }
            }
         }
      }
      return list;
   }
//toString
   @Override
   public String toString() {
      String ele="";
      for(int i = 0; i < count; i++)
      {
         ele+=new String(""+(i+1)+". "+list[i].getItemName()+" : "+list[i].getQuantity()+"\n");  
      }
      
      return ele;
   }


//Equals


}