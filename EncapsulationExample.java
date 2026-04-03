import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class User {
    private String username;
    private String password;

    
    public String getUsername() {
        return username;
    }

     
    public void setUsername(String username) {
        this.username = username;
    }

     
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
            System.out.println("Password set successfully!");
        } else {
            System.out.println("Enter strong password");
        }
    }

    
    private boolean isValidPassword(String password) {
        String regex = "^(?=.*[0-9])"       
                     + "(?=.*[a-z])"        
                     + "(?=.*[A-Z])"        
                     + "(?=.*[@#$%^&+=!])"  
                     + "(?=\\S+$).{8,}$";   

        Pattern p = Pattern.compile(regex);
        if (password == null) return false;
        Matcher m = p.matcher(password);
        return m.matches();
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Mathi123");
        System.out.println("Username: " + user.getUsername());
        user.setPassword("weakpass");
        user.setPassword("Strong@123");
        System.out.println("Password: " + user.getPassword());
    }
}
