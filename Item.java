package counter;
  public class Items
{
       private String Name;
       private double pNumber, Units, Price;          

public Items()
{
Name = "";
pNumber = 0.0;
Units = 0.0;
Price = 0.0;
}

    //constructor
public Items(String productName, double productNumber, double unitsInStock, double unitPrice)
{
    Name = productName;
    pNumber = productNumber;
    Units = unitsInStock;
    Price = unitPrice;
}
    //setter methods

public void setName(String n)
{
    Name = n;
}

public void setpNumber(double no)
{
    pNumber = no;
}

public void setUnits(double u)
{
    Units = u;
}

public void setPrice(double p)
{
    Price = p;
}

//getter methods
public String getName()
{
return Name;
}

public double getpNumber()
{
return pNumber;
}

public double getUnits()
{
return Units;
}

public double getPrice()
{
return Price;
}

public double calculateTotalPrice()
{
    return (Units * Price);
}

public double calculateAllItemsTotalPrice()             //i need method to calculate total cost for all items in array
{
    return (TotalPrice  );                              
}

}