package week2.abstractClass_interface.thuchanh.animal;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger said : Roanhhh";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
