import java.util.*;
public class Hello {

    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String browserInput = input.next();
		
		String browserName = "";
		switch(browserInput)
		{
		    case "I":
		        browserName = "INTERNET EXPLORER";
		        break;
		    case "G":
		        browserName = "GOOGLE CHROME";
		        break;
		    case "O":
		        browserName = "OPERA";
		        break;
		    case "M":
		        browserName = "MOZILLA FIREFOX";
		        break;
		    case "S":
		        browserName = "SAFARI";
		        break;
		    default:
		        browserName = "UNKNOWN";
		        break;
		}
		
		System.out.println(browserName);
	}
}
