package validations;

public class ValidationsForUserClass {

    public void validationUserRegister(String str, String regex, String word) {
        if (str.matches(regex)) {
            System.out.printf("This %s is valid%n", word);
        } else {
            throw new IllegalArgumentException("Invalid " + word);
        }
    }
}
