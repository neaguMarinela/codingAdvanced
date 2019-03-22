package serializationAndDeserialization;

public class UserSimple {
    String name;
    String email;
    int age;
    boolean isDeveloper;

    public UserSimple(String name, String email, int age, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }
}