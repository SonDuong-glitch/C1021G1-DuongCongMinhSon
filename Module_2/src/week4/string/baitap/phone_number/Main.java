package week4.string.baitap.phone_number;

public class Main {
    private static ValidatePhone validateNumberPhone;
    private static String[] isvalid = {"(84)-(0978489648)"};
    private static String[] unisvalid = {"(a8)-(22222222)"};

    public static void main(String[] args) {
        validateNumberPhone = new ValidatePhone();
        for (String regex : isvalid) {
            boolean isvalidate = validateNumberPhone.validate(regex);
            System.out.println(isvalidate);
        }
        for (String regex : unisvalid) {
            boolean isvalidate = validateNumberPhone.validate(regex);
            System.out.println(isvalidate);
        }
    }
}
