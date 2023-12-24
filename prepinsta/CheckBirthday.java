package prepinsta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CheckBirthday {
	public static void main(String[] args) {
		String birthday="";
		System.out.println("Enter DOB");
		Scanner sc = new Scanner(System.in);
		birthday = sc.nextLine();
		
		// simpledateformat is used for proper formatting of the date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        
        // try block for successful execution
        try {
            Date date = sdf.parse(birthday);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            
            // Taking current date
            Calendar today = Calendar.getInstance();
            
            // comparing today's date with the birth date
            if(cal.get(Calendar.MONTH) == today.get(Calendar.MONTH) 
              && cal.get(Calendar.DATE) == today.get(Calendar.DATE))
                // Prints if today is the birthdate
                System.out.println("Happy Birthday!");
            else
                System.out.println("Valid birthday, but not today.");
        } catch (Exception e) {
            System.out.println("Invalid birthday.");
        }
	sc.close();
	}
}
