
/**
 * Write a description of class Module here.
 *
 * @author Brandon Farrell
 * @version 08/10/2021
 */
public class Module
{
    // instance variables - replace the example below with your own

    private String code;
    private String title;
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return 
     */
    public String getCode()
    {
        return this.code;
 
    }


public String getTitle()
    {
        return this.title;
    }

public int getCredit()
    {
        return this.credit;
    }


public void setCredit()
{
    this.credit = credit;
}
 
/**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        
        
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println();
    }

}