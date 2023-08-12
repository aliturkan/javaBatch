package practices.practice04;

public class Q03_Static_Budget {
    //Type a basic home budget
    public static void main(String[] args) {

        Budget father = new Budget();
        father.getSalary(3000);
        father.getPocketMoney(500);
        System.out.println(Budget.familyBudget);//
        System.out.println(father.pocketMoney);//

        Budget mother = new Budget();
        mother.getPocketMoney(1000);
        mother.getSalary(5000);
        System.out.println(mother.familyBudget);//?
        mother.spendPocketMoney(2000);//This will not work, because she does not have that much pocket money.
        System.out.println(mother.pocketMoney);//?

        Budget kid = new Budget();
        kid.getPocketMoney(500);
        kid.spendFamilyBudget(5000);
        System.out.println(Budget.familyBudget);
        System.out.println(kid.pocketMoney);

    }

}