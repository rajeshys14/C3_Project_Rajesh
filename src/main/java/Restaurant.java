

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Restaurant {
    private String name;
    private String location;
                public LocalTime openingTime;
    public LocalTime closingTime;
    private List<Item> menu = new ArrayList<Item>();
    public LocalTime currentTime;


    public Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }




    public LocalTime getCurrentTime(){ return  LocalTime.now(); }
    public boolean isRestaurantOpen() {

        return getCurrentTime().compareTo(openingTime) >= 0 && getCurrentTime().compareTo(closingTime) < 0;



        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
    }



    public List<Item> getMenu() {


        return Collections.unmodifiableList(menu);




        //DELETE ABOVE RETURN STATEMENT AND WRITE CODE HERE
    }

    private Item findItemByName(String itemName){
        for(Item item: menu) {
            if(item.getName().equals(itemName))
                return item;
        }
        return null;
    }

    public void addToMenu(String name, int price) {
        Item newItem = new Item(name,price);
        menu.add(newItem);
    }
    
    public void removeFromMenu(String itemName) throws itemNotFoundException {

        Item itemToBeRemoved = findItemByName(itemName);
        if (itemToBeRemoved == null)
            throw new itemNotFoundException(itemName);

        menu.remove(itemToBeRemoved);
    }
    public void displayDetails(){
        System.out.println("Restaurant:"+ name + "\n"
                +"Location:"+ location + "\n"
                +"Opening time:"+ openingTime +"\n"
                +"Closing time:"+ closingTime +"\n"
                +"Menu:"+"\n"+getMenu());

    }

    public String getName() {
        return name;
    }



    //order tdd

    //order value

    //public void totalOrderValue(){

      //  Item orderValue =


    //}






}
