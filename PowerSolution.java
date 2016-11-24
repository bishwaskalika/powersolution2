import java.util.ArrayList;
import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This is a PowerSolution class which is a new class as well as GUI.
 * 
 * @author (Bishwas Kalika) 
 * @version (6/16/2015)
 */
// Assigning the variables
public class PowerSolution implements ActionListener
{
    ArrayList<Generator> generatorList = new ArrayList<Generator>();
    static JFrame frame;
    JTextField rentDescriptionTxt,
    dailyRateTxt,
    downPaymentTxt,
    rentSizeTxt,
    rentFuelCapacityTxt,
    rentCustomerNameTxt,
    dateOfHireTxt, dateOfReturnTxt,
    numberOfDaysTxt, rentGeneratorNumberTxt; 
    JTextField sellDescriptionTxt, sellSizeTxt,
    sellFuelCapacityTxt, priceTxt, sellCustomerNameTxt,
    dateOfSellTxt, discountTxt, sellGeneratorNumberTxt;
    JButton addToRent, rent, rentClear, rentDisplayAll,
    returnGenerator, addToSell, sell, sellClear, sellDisplayAll;
    static Container container;
   
    // Defining class and JFrame
    public PowerSolution()
    {
        frame = new JFrame("Rental System");
        container = frame.getContentPane();
        container.setLayout(null);
    }
    
    // 
    public static void main(String args[])
    {
        PowerSolution powerSolutionObj = new PowerSolution();
        powerSolutionObj.createGUI();
        frame.setSize(560, 570);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    
    // Creating GUI
    public void createGUI()
    {
        //Description text field and text button
        JLabel rentDescriptionLbl = new JLabel("Description");
        rentDescriptionLbl.setBounds(10,10,100,25);
        container.add(rentDescriptionLbl);
        rentDescriptionTxt = new JTextField();
        rentDescriptionTxt.setBounds(115,10,410,25);
        container.add(rentDescriptionTxt);
        
        // Size text field and text button
        JLabel rentSizeLbl = new JLabel("Size");
        rentSizeLbl.setBounds(10,40,100,25);
        container.add(rentSizeLbl);
        rentSizeTxt = new JTextField();
        rentSizeTxt.setBounds(115,40,100,25);
        container.add(rentSizeTxt);
        
        //FuelCapacity text field and text button
        JLabel rentFuelCapacityLbl = new JLabel("Fuel Capacity");
        rentFuelCapacityLbl.setBounds(220,40,100,25);
        container.add(rentFuelCapacityLbl);
        rentFuelCapacityTxt = new JTextField();
        rentFuelCapacityTxt.setBounds(325,40,200,25);
        container.add(rentFuelCapacityTxt);
        
        //dailyRate text field and text button
        JLabel dailyRateLbl = new JLabel("Daily Rate");
        dailyRateLbl.setBounds(10,70,100,25);
        container.add(dailyRateLbl);
        dailyRateTxt = new JTextField();
        dailyRateTxt.setBounds(115,70,100,25);
        container.add(dailyRateTxt);
        
        //downPayment text field and text button
        JLabel downPaymentLbl = new JLabel("Down Payment");
        downPaymentLbl.setBounds(220,70,100,25);
        container.add(downPaymentLbl);
        downPaymentTxt = new JTextField();
        downPaymentTxt.setBounds(325,70,200,25);
        container.add(downPaymentTxt);
        
        // Add rent text field and text button
        addToRent = new JButton("Add to Rent");
        addToRent.setBounds(325,100,200,25);
        container.add(addToRent); 
        addToRent.addActionListener(this);
        
        //CustomerName text field and text button
        JLabel rentCustomerNameLbl = new JLabel("Customer Name");
        rentCustomerNameLbl.setBounds(10,135,100,25);
        container.add(rentCustomerNameLbl);
        rentCustomerNameTxt = new JTextField();
        rentCustomerNameTxt.setBounds(115,135,410,25);
        container.add(rentCustomerNameTxt);
        
        //dateOfHire text field and text button
        JLabel dateOfHireLbl = new JLabel("Hire Date");
        dateOfHireLbl.setBounds(10,165,100,25);
        container.add(dateOfHireLbl);
        dateOfHireTxt = new JTextField();
        dateOfHireTxt.setBounds(115,165,100,25);
        container.add(dateOfHireTxt);  
        
        //dateOfReturn text field and text button
        JLabel dateOfReturnLbl = new JLabel("Return Date");
        dateOfReturnLbl.setBounds(220,165,100,25);
        container.add(dateOfReturnLbl);
        dateOfReturnTxt = new JTextField();
        dateOfReturnTxt.setBounds(325,165,200,25);
        container.add(dateOfReturnTxt);
        
        //GeneratorNumber text field and text button
        JLabel rentGeneratorNumberLbl = new JLabel("Generator No.");
        rentGeneratorNumberLbl.setBounds(220,195,100,25);
        container.add(rentGeneratorNumberLbl);
        rentGeneratorNumberTxt = new JTextField();
        rentGeneratorNumberTxt.setBounds(325,195,200,25);
        container.add(rentGeneratorNumberTxt);
        
        //numberOfDays text field and text button
        JLabel numberOfDaysLbl = new JLabel("No. of Days");
        numberOfDaysLbl.setBounds(10,195,100,25);
        container.add(numberOfDaysLbl);
        numberOfDaysTxt = new JTextField();
        numberOfDaysTxt.setBounds(115,195,100,25);
        container.add(numberOfDaysTxt);
        
        //rent text field and text button
        rent = new JButton("Rent");
        rent.setBounds(125,225,110,25);
        container.add(rent);
        rent.addActionListener(this);
        rentClear = new JButton("Clear");
        rentClear.setBounds(225,225,110,25);
        container.add(rentClear);
        rentClear.addActionListener(this);
        
        //DisplayAll text field and text button
        rentDisplayAll = new JButton("Display All");
        rentDisplayAll.setBounds(325,225,110,25);
        container.add(rentDisplayAll);
        rentDisplayAll.addActionListener(this);
        
        //returnGenerator text field and text button
        returnGenerator= new JButton("Return");
        returnGenerator.setBounds(425,225,100,25);
        container.add(returnGenerator);
        returnGenerator.addActionListener(this);
        
        //Description of sell text field and text button
        JLabel sellDescriptionLbl = new JLabel("Description");
        sellDescriptionLbl.setBounds(10,300,100,25);
        container.add(sellDescriptionLbl);
        sellDescriptionTxt = new JTextField();
        sellDescriptionTxt.setBounds(110,300,410,25);
        container.add(sellDescriptionTxt);
        
        //Size of sell text field and text button
        JLabel sellSizeLbl = new JLabel("Size");
        sellSizeLbl.setBounds(10,330,100,25);
        container.add(sellSizeLbl);
        sellSizeTxt = new JTextField();
        sellSizeTxt.setBounds(110,330,100,25);
        container.add(sellSizeTxt);
        
        //FuelCapacity of sell text field and text button
        JLabel sellFuelCapacityLbl = new JLabel("Fuel Capacity");
        sellFuelCapacityLbl.setBounds(215,330,100,25);
        container.add(sellFuelCapacityLbl);
        sellFuelCapacityTxt = new JTextField();
        sellFuelCapacityTxt.setBounds(320,330,200,25);
        container.add(sellFuelCapacityTxt);
        
        //price text field and text button
        JLabel priceLbl = new JLabel("Price");
        priceLbl.setBounds(10,360,100,25);
        container.add(priceLbl);
        priceTxt = new JTextField();
        priceTxt.setBounds(115,360,100,25);
        container.add(priceTxt);
        
        // Add Sell button text field and text button
        addToSell = new JButton("Add to Sell");
        addToSell.setBounds(220,360 ,300,25);
        container.add(addToSell); 
        addToSell.addActionListener(this);
        
        //CustomerName of sell text field and text button
        JLabel sellCustomerNameLbl = new JLabel("Customer Name");
        sellCustomerNameLbl.setBounds(10,410,100,25);
        container.add(sellCustomerNameLbl);
        sellCustomerNameTxt = new JTextField();
        sellCustomerNameTxt.setBounds(115,410,410,25);
        container.add(sellCustomerNameTxt);
        
        //dateOfSell text field and text button
        JLabel dateOfSellLbl = new JLabel("Date");
        dateOfSellLbl.setBounds(10,440,100,25);
        container.add(dateOfSellLbl);
        dateOfSellTxt = new JTextField();
        dateOfSellTxt.setBounds(115,440,100,25);
        container.add(dateOfSellTxt);  
        
        //discount text field and text button
        JLabel discountLbl = new JLabel("Discount");
        discountLbl.setBounds(220,440,100,25);
        container.add(discountLbl);
        discountTxt = new JTextField();
        discountTxt.setBounds(325,440,200,25);
        container.add(discountTxt);
        
        //GeneratorNumber of selltext field and text button
        JLabel sellGeneratorNumberLbl = new JLabel("Generator No.");
        sellGeneratorNumberLbl.setBounds(10,470,100,25);
        container.add(sellGeneratorNumberLbl);
        sellGeneratorNumberTxt = new JTextField();
        sellGeneratorNumberTxt.setBounds(115,470,410,25);
        container.add(sellGeneratorNumberTxt);
        
        //sell button text field and text button
        sell = new JButton("Sell");
        sell.setBounds(125,500,125,25);
        container.add(sell);
        sell.addActionListener(this);
        
        //clear button text field and text button
        sellClear = new JButton("Clear");
        sellClear.setBounds(225,500,125,25);
        container.add(sellClear);
        sellClear.addActionListener(this);
        
        //DisplayAll text field and text button
        sellDisplayAll = new JButton("Display All");
        sellDisplayAll.setBounds(325,500,125,25);
        container.add(sellDisplayAll);
        sellDisplayAll.addActionListener(this);
        
    }
    
    
    // Using accessor method 
    public String getRentDescription()
    {
        return rentDescriptionTxt.getText();
    }
    public String getRentSize()
    {
        return rentSizeTxt.getText();
    }
    public String getRentFuelCapacity()
    {
        return rentFuelCapacityTxt.getText();
    }
    public int getDailyRate()
    {
        return Integer.parseInt(dailyRateTxt.getText());
    }
    public int getDownPayment()
    {
        return Integer.parseInt(downPaymentTxt.getText());
    }
    public String getSellDescription()
    {
        return sellDescriptionTxt.getText();
    }
    public String getSellSize()
    {
        return sellSizeTxt.getText();
    }
    public String getSellFuelCapacity()
    {
        return sellFuelCapacityTxt.getText();
    }
    public int getPrice()
    {
        return Integer.parseInt(priceTxt.getText());
    }
    public String getRentCustomerName()
    {
        return rentCustomerNameTxt.getText();
    }
    public String getSellCustomerName()
    {
        return sellCustomerNameTxt.getText();
    }
    public String getDateOfHire()
    {
        return dateOfHireTxt.getText();
    }
    public String getDateOfReturn()
    {
        return dateOfReturnTxt.getText();
    }
    public int getNumberOfDays()
    {
        return Integer.parseInt(numberOfDaysTxt.getText());
    }
    public String getDateOfSell()
    {
        return dateOfSellTxt.getText();
    }
    public int getDiscount()
    {
        return Integer.parseInt(discountTxt.getText());
    }
    public int getRentGeneratorNumber()
    {
        return Integer.parseInt(rentGeneratorNumberTxt.getText());
    }
    public int getSellGeneratorNumber()
    {
        return Integer.parseInt(sellGeneratorNumberTxt.getText());
    }
    
    //This is a method to add the Generator to rent the array list 
    public void addGeneratorToRent()
    {   // Using try and catch 
         try
            {
                String description = getRentDescription();
                String size = getRentSize();
                String fuelCapacity = getRentFuelCapacity();
                if(!description.equals("") && !size.equals("") && !fuelCapacity.equals(""))
                {
                    int dailyRate = getDailyRate();
                    int downPayment = getDownPayment();
                    GeneratorToRent generatorToRentObj = new GeneratorToRent(description,size,fuelCapacity,downPayment,dailyRate);
                    generatorList.add(generatorToRentObj);
                    JOptionPane.showMessageDialog(frame,"Generator added to the list");
                    clearRentFields();
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"One or more field left empty!","No input", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(frame,"Daily Rate and/or Down Payment invalid!","Invalid input", JOptionPane.ERROR_MESSAGE);
            }
    }
    
     //This is a method to rent out the Generator 

    public void rentOutGenerator()
    {   // Using try and catch 
        try
            {
                    String customerName = getRentCustomerName();
                    String dateOfHire = getDateOfHire();
                    String dateOfReturn = getDateOfReturn();
            
                if(!customerName.equals("") && !dateOfHire.equals("") && !dateOfReturn.equals(""))
                {
                     int numberOfDays = getNumberOfDays();
                     int generatorNumber = getRentGeneratorNumber();
                     if(generatorNumber<0 || generatorNumber>=generatorList.size())
                     {
                         JOptionPane.showMessageDialog(frame,"The generator number is not within range.\n Generator available from 0 to " + (generatorList.size()-1));
                     }
                     else
                     {
                         try
                         {
                             GeneratorToRent generatorToRentObj = (GeneratorToRent) generatorList.get(generatorNumber);
                             if(generatorToRentObj.getonLoan() == false)
                             {
                                 generatorToRentObj.setthecustomersname(customerName, dateOfHire, dateOfReturn, numberOfDays);
                                 generatorList.set(generatorNumber, generatorToRentObj);
                                 JOptionPane.showMessageDialog(frame, "Generator Rented");
                                 clearRentFields();
                             }
                             else
                             {
                                 JOptionPane.showMessageDialog(frame, "Generator already on rent");
                             }
                         }
                         catch(ClassCastException e)
                         {
                             JOptionPane.showMessageDialog(frame,"The selected generator number is in selling category.","Invalid input", JOptionPane.ERROR_MESSAGE);
                         }
                     }
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"One or more field left empty!","No input", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(frame,"Number of Days and/or Generator Number invalid!","Invalid input", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    //This is a method to return generator  

    public void returnGenerator()
    {   // Using try and catch
        try
        {
            try
            {
                int generatorNumber = getRentGeneratorNumber();
                if(generatorNumber<0 || generatorNumber>=generatorList.size())
                {
                    JOptionPane.showMessageDialog(frame,"The generator number is not within range");
                }
                else
                {
                    GeneratorToRent generatorToRentObj = (GeneratorToRent) generatorList.get(generatorNumber);
                    if (generatorToRentObj.getonLoan() == false)
                    {
                        JOptionPane.showMessageDialog(frame,"The Generator is not on rent");
                    }
                    else
                    {
                        generatorToRentObj.makingGenerator();
                        generatorList.set(generatorNumber, generatorToRentObj);
                        JOptionPane.showMessageDialog(frame,"Generator Returned");
                        clearRentFields();
                    }
                }
            }
            catch(ClassCastException e)
            {
                JOptionPane.showMessageDialog(frame, "The selected generator number is in selling category.","Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        }     
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame,"Generator number invalid!", "Invalid input", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //This is a method to clearrent fields the generator 

    public void clearRentFields()
    {
        rentDescriptionTxt.setText("");
        rentSizeTxt.setText("");
        rentFuelCapacityTxt.setText("");
        downPaymentTxt.setText("");
        dailyRateTxt.setText("");
        rentCustomerNameTxt.setText("");
        dateOfHireTxt.setText("");
        dateOfReturnTxt.setText("");
        numberOfDaysTxt.setText("");
        rentGeneratorNumberTxt.setText("");
    }
    
    //This is a method to rent display the generator 

    public void rentDisplayAll()
    {
          for(int generatorNumber=0; generatorNumber<generatorList.size(); generatorNumber++)
            {
                try
                {
                    GeneratorToRent generatorToRentObj = (GeneratorToRent) generatorList.get(generatorNumber);
                    generatorToRentObj.display();
                }
                catch(ClassCastException e)
                {
                    continue;
                }
            }
    }
    
    //This is a method to add generator to sell the generator
    public void addGeneratorToSell()
    {
        try
            {
                String description = getSellDescription();
                String size = getSellSize();
                String fuelCapacity = getSellFuelCapacity();
                if(!description.equals("") && !size.equals("") && !fuelCapacity.equals(""))
                {
                    int price =  getPrice();
                    GeneratorToSell generatorToSellObj = new GeneratorToSell(description,size,fuelCapacity,price);
                    generatorList.add(generatorToSellObj);
                    JOptionPane.showMessageDialog(frame,"Generator added to the list");
                    clearSellField();
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"One or more field left empty!","No input", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(frame,"Price invalid!","Invalid input", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    //This is a method to sell generator the generator 
    public void sellGenerator()
    {
         try
            {
                    String customerName = getSellCustomerName();
                    String dateOfSell = getDateOfSell();
                if(!customerName.equals("") && !dateOfSell.equals(""))
                {
                     int discount = getDiscount();
                     int generatorNumber = getSellGeneratorNumber();
                     if(generatorNumber<0 || generatorNumber>=generatorList.size())
                     {
                         JOptionPane.showMessageDialog(frame,"The generator number is not within range","Invalid input", JOptionPane.ERROR_MESSAGE);
                     }
                     else
                     {
                         try
                         {
                             GeneratorToSell generatorToSellObj = (GeneratorToSell) generatorList.get(generatorNumber);
                             if(generatorToSellObj.getsold() == false)
                             {
                                 generatorToSellObj.sellingGenerator(customerName, dateOfSell, discount);
                                 generatorList.set(generatorNumber, generatorToSellObj);
                                 JOptionPane.showMessageDialog(frame,"Generator sold");
                                 clearSellField();
                             }
                             else
                             {
                                 JOptionPane.showMessageDialog(frame, "Generator already sold. It cannot be sold again.","Invalid input", JOptionPane.ERROR_MESSAGE);
                             }
                         }
                         catch(ClassCastException e)
                         {
                             JOptionPane.showMessageDialog(frame, "The selected generator number is in renting category.", "Invalid input",JOptionPane.ERROR_MESSAGE);
                         }
                     }
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"One or more field left empty!","No input", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(frame,"Number of Days and/or Generator Number invalid!","Invalid input", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    //This is a method to clear Sell Field  the generator 
    public void clearSellField()
    {
            sellDescriptionTxt.setText("");
            sellSizeTxt.setText("");
            sellFuelCapacityTxt.setText("");
            priceTxt.setText("");
            sellCustomerNameTxt.setText("");
            dateOfSellTxt.setText("");
            discountTxt.setText("");
            sellGeneratorNumberTxt.setText("");
    }
    //This is a method to clear Sell Field  the generator 

    public void sellDisplayAll()
    {
        for(int generatorNumber=0; generatorNumber<generatorList.size(); generatorNumber++)
            {
                try
                {
                    GeneratorToSell generatorToSellObj = (GeneratorToSell) generatorList.get(generatorNumber);
                    generatorToSellObj.display();
                }
                catch(ClassCastException e)
                {
                    continue;
                }
            }
    }
    
    //This is a method to Performe as action  
    public void actionPerformed(ActionEvent event)
    {
        Object source = event.getSource();
        if(source == addToRent)
        {
           addGeneratorToRent();
        }
        else if(source == rent)
        {
            rentOutGenerator();
        }
        else if(source == returnGenerator)
        {
            returnGenerator();
        }
        else if(source == rentClear)
        {
           clearRentFields();
        }
        else if (source == rentDisplayAll)
        {
            rentDisplayAll();
        }
        else if (source == addToSell)
        {
            addGeneratorToSell();
        }        
        else if (source == sell)
        {            
           sellGenerator();
        }
        else if (source == sellClear)
        {
            clearSellField();
        }
        else if (source == sellDisplayAll)
        {
           sellDisplayAll();
        }
    }
}
