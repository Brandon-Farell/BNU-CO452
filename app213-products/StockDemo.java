
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Brandon Farrell.
 * @version 19/11/2021
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = new StockList();
        
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Team Fortress 2"));
        stock.add(new Product(102, "Payday 2"));
        stock.add(new Product(103, "Payday: The Heist"));
        stock.add(new Product(104, "Halo Infinite"));
        stock.add(new Product(105, "Payday 3"));
        stock.add(new Product(106, "DELTARUNE"));
        stock.add(new Product(107, "UNDERTALE"));
        stock.add(new Product(108, "Halo: Combat Evolved"));
        stock.add(new Product(109, "No More Heroes 3"));
        stock.add(new Product(110, "Travis Strikes Back: No More Heroes"));
        
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 500);
    }

    private void sellProducts()
    {
    }    
}