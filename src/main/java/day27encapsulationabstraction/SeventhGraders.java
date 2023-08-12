package day27encapsulationabstraction;

public class SeventhGraders extends Courses{

    @Override
    public void math() {
        System.out.println("Learn square root");
    }
    @Override
    public void art() {
        super.art();
    }
}