// This is child class which is connected to parent class using "extends".
public class Department extends Store{
    private String productName;             
    private double markedPrice;
    private double sellingPrice;        
    private boolean isInSales;     
    //These four are the attributes of subclass Department.
    //Constructor method.
    public Department(int storeId,String storeName,String location,String openingHour,double totalSales,
    double totalDiscount,String productName,double markedPrice){

        //calling the superclass constructor.
        super(storeId,storeName,location,openingHour);
        this.productName = productName;
        this.markedPrice = markedPrice;
        this.sellingPrice = 0;
        this.isInSales = true;
        //calling the two setter method from superclass.
        super.setTotalSales(totalSales);
        super.setTotalDiscount(totalDiscount);
    }
    //Getter method(Accessor method)
    public String getproductName()
    {
        return productName;
    }

    public double getmarkedPrice()
    {
        return markedPrice;
    }

    public double getsellingPrice()
    {
        return sellingPrice;
    }

    public boolean getisInSales()
    {
        return isInSales;
    }
    //Setter method(mutator method)
    public void setmarkedPrice(double markedPrice)
    {
        this.markedPrice = markedPrice;
    }
    //Creating a method to calculate selling price.
    //The data type for this  is'nt mentioned in ques so void use.
    public void calculateDisountPrice(boolean isInSales,double markedPrice)
    {

        double discount = 0;
        if(markedPrice < 1000){ 
            discount = 0.0;
        }
        else if(markedPrice >= 1000 && markedPrice < 3000){
            discount = 0.05;
        }
        else if(markedPrice >= 3000 && markedPrice < 5000){
            discount = 0.1;
        }
        else{                      //else if is used if there's a condition, else when there is no condition.
            discount = 0.20;
        }
        //Formula
        sellingPrice = markedPrice - (markedPrice * discount);
        this.markedPrice=markedPrice;
        this.setTotalDiscount(markedPrice*discount);
        this.isInSales=false;
    } 

    //Display method.
    public void display()
    {
        super.displayStore();
        if(isInSales){
            System.out.println("Product name:" + getproductName());
            System.out.println("Marked price:" + getmarkedPrice());
        }
        else{
            System.out.println("Product name:" + getproductName());
            System.out.println("sellingPrice :" + getsellingPrice());
        }
    }
}