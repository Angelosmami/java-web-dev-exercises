package restaurant;

public class restaurant {
    public static void main (String [] args){
        MenuItem item1= new MenuItem("salad", 7.50, "chef salad", "entree", true);
        MenuItem item2= new MenuItem("salad", 7.50, "chef salad", "entree", true);
        MenuItem item3= new MenuItem("salad", 8.50, "Caesar salad", "entree", true);


        Menu myMenu = new Menu();
        myMenu.addItem(item1);
        myMenu.addItem(item2);
        myMenu.addItem(item3);

//        System.out.println (myMenu);
     myMenu.removeItem(item3);
        System.out.println (myMenu);

//        System.out.println(item1.toString());
//
//    System.out.println(item1.equals(item2));
//    System.out.println(item1.equals(item3));

    }
}
