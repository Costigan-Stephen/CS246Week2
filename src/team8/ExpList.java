package team8;

import java.util.ArrayList;
import java.util.List;

public class ExpList implements Expense{

    List<Expense> expenses = new ArrayList<Expense>();

    public float getCost(){
        return tallyExpenses(expenses);
    }

    float tallyExpenses(List<Expense> expenses)
    {
        float total = 0.0f;
        for (Expense ex: expenses){
            total += ex.getCost();
        }
        return total;
    }
}
