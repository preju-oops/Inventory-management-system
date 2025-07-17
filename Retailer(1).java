//This is a child class of parent class Store.
public class Retailer extends Store{
    private int VatInclusivePrice;
    private int loyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;
    //Constructor method.
    public Retailer(int storeId,String storeName,String location,String openingHour,double totalSales,double totalDiscount,
    int VatInclusivePrice,boolean isPaymentOnline,String purchasedYear)
    {
        //calling the superclass constructor.
        super(storeId,storeName,location,openingHour);
        setTotalSales(totalSales);
        setTotalDiscount(totalDiscount);
        this.VatInclusivePrice = VatInclusivePrice;
        this.purchasedYear = purchasedYear;
        this.isPaymentOnline = isPaymentOnline;
        this.loyaltyPoint = 0;             
    }
    //Getter method(Accessor method)
    public int getVatInclusivePrice()
    {
        return this.VatInclusivePrice;
    }

    public int getloyaltyPoint()
    {
        return this.loyaltyPoint;
    }

    public boolean getisPaymentOnline()
    {
        return this.isPaymentOnline;
    }

    public String getpurchasedYear()
    {
        return this.purchasedYear;
    }
    //Setter method for isPaymentOnline.
    public void setisPaymentOnline(boolean isPaymentOnline)
    {
        this.isPaymentOnline = isPaymentOnline;
    } 
    //setter method for loyalty point which accepts isPaymentOnline and newVatInclusivePrice as parameters.
    public void setloyaltyPoint(boolean isPaymentOnline,int VatInclusivePrice)
    {
        if (isPaymentOnline){
            this.loyaltyPoint = (int)(0.01 * VatInclusivePrice);
            //Since,loyaltypoint is 1% of vatinclusiveprice.
        }
        else{
            this.loyaltyPoint = 0;
        }
    }
    //Creating another method removeproduct.
    public void removeProduct(int loyaltyPoint, String purchasedYear)
    {
        if (loyaltyPoint == 0 && (purchasedYear =="2020"|| purchasedYear =="2021"|| purchasedYear =="2022")){
            System.out.println("The product has been removed since it does'nt have loyaltyPoint and the product exceeds one year");
            this.VatInclusivePrice = 0;
            this.loyaltyPoint = 0;
            this.isPaymentOnline = false;
        }  
    }
    //display method.
    public void display()
    {
        if(VatInclusivePrice == 0){
            System.out.println("Product has been removed");
            super.displayStore();
        }
        else{
            super.displayStore();
            System.out.println("Vat Inclusive Price:"+ VatInclusivePrice);
            System.out.println("Loyalty Point:"+ loyaltyPoint);
            System.out.println("Purchased year:"+ purchasedYear);
        }
    }
}

    
