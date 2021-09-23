package team8;

import java.util.List;
class VacationCalculator {

    ExpList expenses;

    public static void main(String[] args) {

        VacationCalculator vc = new VacationCalculator();

        // Calculate some vacation costs...
        float japanCost = vc.calculateVacationCost(Destination.Japan);

        // Print the cost...
        System.out.print("Total cost of the trip: $");
        System.out.print(japanCost);
    }

    /**
     * Calculates the total cost for vacationing at a given location for
     * a specific number of nights.
     *
     * @param  dest the destination of the vacation
     * @return      the total cost of the vacation
     */
    public float calculateVacationCost(Destination dest)
    {
        Cruise c = new Cruise(dest);
        return c.getCost();
    }

    /**
     * An internal method used by VacationCalculator to loop through
     * a List of items that implement the Expense interface and
     * determine their cost
     *
     * @param  expenses A list of items that implement the Expense interface
     * @return          the total cost calculated by the items
     */
    float tallyExpenses(List<Expense> expenses)
    {
        float total = 0.0f;
        for (Expense ex: expenses){
            total += ex.getCost();
        }
        return total;
    }
}
