package Week6.HashMapEx;
import java.util.HashMap;

public class PromissoryNote {
    HashMap<String, Double> loan = new HashMap<>();
    public PromissoryNote(){}
    public void setLoan(String toWhom, double value){
        loan.put(toWhom, value);
    }
    public double howMuchIsTheDebt(String whose){
        if(loan.containsKey(whose))
            return loan.get(whose);
        return 0;
    }
}
