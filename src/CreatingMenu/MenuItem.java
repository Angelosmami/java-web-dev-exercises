package CreatingMenu;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.Arrays;
 import java.util.Date;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }


    public String getName() {return this.name; }
    public void setName(String name) {this.name = name;}

    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}

    public String getDescription() {return this.description;}
    public void setDescription(String description) {this.description = description;}

    public String getCategory() {return this.category;}
    public void setCategory (String category) {this.category = category;}

    public boolean getIsNew() {return this.isNew;}
    public void setIsNew(boolean isNew) {this.isNew = isNew;}
    
}