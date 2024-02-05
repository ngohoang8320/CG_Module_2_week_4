package validate_class_name;

public class ClassNameTest {
    private static String[] classNames = {"C0223G", "A0323K", "M0318G", "P0323A", "asdb12341"};

    public static void main(String[] args) {
        ClassNameRegex regex = new ClassNameRegex();

        for (String className : classNames) {
            boolean check = regex.validate(className);
            if (check) {
                System.out.println(className + " is valid");
            } else {
                System.out.println(className + " is NOT valid");
            }
        }
    }
}
