package week5.designPattern.thuchanh.factory_Method;

public class AnimalFactory {
    public Animals getAnimal(String string) {
        if ("canine".equals(string)) {
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
