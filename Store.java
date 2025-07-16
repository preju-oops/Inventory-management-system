//This is parent class that has sub classes/child classes department and retailer.
public class Store{
    private int storeId;            //Using capital lettters in the middle to increase readability of identifiers.
    private String storeName;
    private String location;
    private String openingHour;     //These six are the attributes of the class Store.
    private double totalSales;
    private double totalDiscount;

    //Constructor method.           //The constructor name should be as same as the class name so,public Store.
    public Store(int storeId,String storeName,String location,
    String openingHour)
    {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour; 

        //totalSales and totalDiscount are initialized to zero.
        this.totalSales = 0.0;
        this.totalDiscount = 0.0;   
        //Since totalSales and totalDiscount are applied double,writing 0.0 for the attribute to be completely zero including decimal values.

    }
    //Getter method(Accessor method)
    public int getStoreId()
    { 
        return storeId;               
    }

    public String getStoreName()
    {
        return storeName;           
    }

    public String getLocation()
    {
        return location;                
    } 

    public String getOpeningHour()
    {
        return openingHour;
    } 

    public double getTotalSales()
    {
        return totalSales;
    }

    public double getTotalDiscount()
    {
        return totalDiscount;
    }
    //Creating two methods that will accept totalSales and totalDiscount as parameters respectively.
    //Setter method(mutator method)        
    public void setTotalSales(double newTotalSales)
    {                                                  //Same vairable including same uppercase and lowercase letters is
        this.totalSales += newTotalSales;                 //supposed to be used for get and set.
    }

    public void setTotalDiscount(double newTotalDiscount)
    {
        this.totalDiscount += newTotalDiscount;
    }   
    //Display method for getting an output.
    public void displayStore()
    {
        System.out.println("StoreID:"+ storeId);
        System.out.println("StoreName:"+ storeName);
        System.out.println("Location:"+ location);
        System.out.println("OpeningHour:"+ openingHour);
        //Using if else condition for attributes  which may or maynot have value =0
        if(totalSales == 0.0 && totalDiscount == 0.0){
            System.out.println("No sales or discount till now");
        }
        else{
            System.out.println("TotalSales:"+ totalSales);
            System.out.println("TotalDiscount:"+ totalDiscount);
        }
    }
}

