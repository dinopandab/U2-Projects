import javax.swing.*;
import java.text.DecimalFormat;

public class WidgetFactory {

    /*
    Lessons L1 - L3

    You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget and the profit.

    Specific Details:
     - 10 Widgets are made each hour
     - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift
     - each worker makes $16.50 an hour
     - each widget sells for $10

     Programming Details:
     - prompt the user for the number of widgets using pop-up boxes
     - display # of widgets, # of days, Cost of production, Cost of widgets and profit
     - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
     - only WHOLE number of days, no half or partial days.
     - Output should be in proper currency form

     Example Run:

     Number of Widgets: 1000
     # of Days: 7
     Cost of Widgets: $10,000.00
     Cost of Production: $9,240.00
     Profit: $760.00

     */


    public static void main(String[] args) {
       int widget = getInput("How many widgets are needed?");

        int  numberOfDays = numberOfDays(widget);

       double costOfWidgets = costOfWidgets(widget);

       double costOfProduction = costOfProduction(numberOfDays);

       double profitMade = profitMade(costOfProduction,costOfWidgets);



        outputResults(numberOfDays,costOfWidgets,costOfProduction,profitMade);
    }


    public static int getInput(String prompt){
        return Integer.parseInt(JOptionPane.showInputDialog(prompt));
    }

    public static int numberOfDays(int widget){

        double hoursADay = 16.0;
        double hours = (double) (widget/10) + 8 ;
        int calculateDays = (int)Math.ceil(hours/hoursADay);

        return calculateDays;

    }
    public static double costOfWidgets(int widget){

        double widgetCost = (double)widget * 10.00;

        return widgetCost;

    }
    public static double costOfProduction (double calculateDays){

        double productionCost = calculateDays * 10.0 * 8.0 * 16.50;

        return productionCost;

    }
    public static double profitMade (double productionCost,double widgetCost){


        double profit = widgetCost - productionCost;

        return profit;

    }






    public static void outputResults(int numberOfDays,double costOfWidgets, double costOfProduction , double profitMade ) {
        DecimalFormat addZero = new DecimalFormat("##,###.00");

        String message =  "the number of days: " + numberOfDays +
                "\n Cost Of widgets: $ "  + addZero.format(costOfWidgets) + "\ncost of production: $" + addZero.format(costOfProduction) + "\nprofit: $" + addZero.format(profitMade);

        JOptionPane.showMessageDialog(null,message);
    }


}
