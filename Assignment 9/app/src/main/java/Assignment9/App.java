/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Assignment9;
import java.util.Arrays;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
         Utility utility=new Utility();
         final String[] c = utility.Repeated("This is a repeated word test this is a A"); 

        System.out.println(Arrays.toString(c));//Should print [a, 3] 

        final String[] c1 = utility.Repeated("This is a repeated word test this this this this this this"); 

        System.out.println(Arrays.toString(c1));//Should print [this, 7] 

        final String[] c2 = utility.Repeated("This is a repeated word test this word word word"); 

        System.out.println(Arrays.toString(c2));//Should print [word, 4] 

} 
         
    }
