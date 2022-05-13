// Name : Anthony Esterly
// Class : CIST1400-820
// Colleagues :
// Resources : Friend who is a programmer helped with making the driver  
import java.util.*;
public class GroceryDriver
{
   public static void listing()
   {
      System.out.println("1. Print the grocery list.");
      System.out.println("2. Print the number of different items in the list");
      System.out.println("3. Print the total number of grocery items to be purchased");
      System.out.println("4. Add an item");
      System.out.println("5. Remove an item");
      System.out.println("6. Increase the quantity of an item");
      System.out.println("7. Sort the items by quantity");
      System.out.println("8. Sort the items by name");
      System.out.println("9. Quit");
   }
   public static void main(String[] args) {
      int choice = 0;
      GroceryList K = new GroceryList();
      Scanner xd = new Scanner(System.in);
      do{
         listing();
         System.out.print("Enter choice: "); choice = xd.nextInt();xd.nextLine();
         
         switch(choice)
         {
            case 1:
            {
               System.out.println("Grocery List is : \n"+K.toString());
               break;
         
            }
            case 2 :
            {
            
               System.out.println("Number of different Items: "+K.getCount());
               break;
            }
            case 3:
            {
               int sum = 0;
               for(int z = 0;z<K.getCount();z++)
               {
                  sum += K.getItem(z).getQuantity();
               }
            
               System.out.println("Total grocery Items: " + sum);
               break;
            }
            case 4:
            {
               String name;
               int qty;
               System.out.println("Enter Item:");
               name = xd.nextLine();
               do{
                  System.out.println("Enter quantity (1-25)");
                  qty = xd.nextInt();xd.nextLine();
               }while(qty<=0 || qty > 25 );
            
               Item i1 = new Item(name,qty);
               K.add(i1);
               break;
            }
            case 5:
            {
               int pos ;
               System.out.println("Here is the List of Groceries : ");
               System.out.println(K.toString());
               System.out.println("Enter number of item to delete : ");
               pos = xd.nextInt();xd.nextLine();
               if(pos <1 || pos >K.getCount())
               {
                  System.out.println("Item does not exist");
               }else{
                  K.delete(pos);
               }
               break;
            }
            case 6:
            {
               int pos ;
               System.out.println("Here is the List of Groceries : ");
               System.out.println(K.toString());
               System.out.println("Enter number of item for quantity increase : ");
               pos = xd.nextInt();xd.nextLine();
               if(pos <1 || pos >K.getCount())
               {
                  System.out.println("Item does not exist");
               }else{
                  K.getItem(pos-1).increaseQuantity();
               }
               break;
            }
            case 7:
            {
               K.sortQuant();
               System.out.println("The sorted grocery List is : ");
               System.out.println(K.toString());
               break;
            }
            case 8:{
               K.sortName();
               System.out.println("The sorted grocery List is : ");
               System.out.println(K.toString());
               break;
            }
            case 9:
            {
               System.out.println("Thank you for shopping with us");
            }
         }
      }while(choice != 9);
   }
}   
   
   
   
