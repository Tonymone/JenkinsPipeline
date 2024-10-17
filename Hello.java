import java.util.*;

public class Hello {
    public static void main(String[] args) {
        String user = "Tony";
        String message = String.format("Hello Jenkins. %s here. Webhooks are enabled!", user);
        System.out.println(message);
    }
}
