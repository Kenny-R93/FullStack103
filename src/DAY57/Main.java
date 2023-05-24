//package DAY57;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println(isValidEmail("test@example.com"));
//    }
//
//    public static boolean isValidEmail(String email) {
//        Pattern pattern = Pattern.compile("^[\\w+_.-]{2,}@[\\w+_.-]{2,}\\.[A-Za-z]{2,}$");
//        Matcher matcher = pattern.matcher(email);
//        return matcher.matches();
//
//    }
//
//
//}