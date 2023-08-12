package practices.practice04;

public class Budget {

    public static double familyBudget;
    public double pocketMoney;

    public void getPocketMoney(double moneyToTake){
        if(moneyToTake<familyBudget){
            familyBudget -= moneyToTake;
            pocketMoney += moneyToTake;
        }
    }

    public void getSalary(double salary){

        familyBudget += salary;

    }

    public void spendPocketMoney(double moneyToSpend){

        if(moneyToSpend<pocketMoney){
            pocketMoney -= moneyToSpend;
        }
    }

    public static void spendFamilyBudget(double moneyToSpend){

        if(moneyToSpend<familyBudget){
            familyBudget -= moneyToSpend;
        }

    }








}