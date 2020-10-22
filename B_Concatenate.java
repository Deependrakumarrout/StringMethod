package StringMethod;

public class B_Concatenate {
    public static void main(String[] args) {
        String firstName = "Tirthankar";
        String lastName = " Rout";

        // What's the full name?
        System.out.println(firstName.concat(lastName));

        // But we cannot write in this way it will just print the firstName but not the concatenation part:
        firstName.concat(" is the student of vcs.");
        System.out.println(firstName);
    }
}
