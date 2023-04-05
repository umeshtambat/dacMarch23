import java.text.SimpleDateFormat;
import java.util.*;

// class Date{
//   int day;
//   int month;
//   int year;

//    Date(){
//     this(int day, int month, int year ); 
//    }
//  public Date( int day, int month, int year )
//   { System.out.println("Inside Parameter COnstructor");
//     this.day = day;
//     this.month = month;
//     this.year = year;
//   }
// }
class Ques1{
  public static void main(String[] args) {
   
//    Date dt1 = new Date();
 
//    Date dt2=new Date(12,10,2000);
//   }
 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Day in D format");
  int day=sc.nextInt();
  System.out.println("Enter Month in M format");
  int month=sc.nextInt();
  System.out.println("Enter Year in YYYY format");
  int year=sc.nextInt();  

  Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.setTimeInMillis(0);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        Date date = calendar.GMT

        // Default format returned by Date#toString
        System.out.println(date);

        // Custom format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
  }
}