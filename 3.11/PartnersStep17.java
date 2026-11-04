/*
 * Activity 3.1.1
 */
public class PartnersStep17
{
  public static void main(String[] args)
  {
    String[] days = {
      "Sunday", "Monday", "Tuesday", "Wednesday",
      "Thursday", "Friday", "Saturday"
    };

    String[] partners = new String[7];
    partners[1] = "Ava";
    partners[3] = "Leo";
    partners[5] = "Zoe";

    String[] friendPartners = partners;

    partners[1] = "Mia";
    partners[3] = "Sam";
    partners[5] = "Nia";

    System.out.println(days[1] + " practice partner: " + partners[1]);
    System.out.println(days[3] + " practice partner: " + partners[3]);
    System.out.println(days[5] + " practice partner: " + partners[5]);
    System.out.println("friendPartners[1] = " + friendPartners[1]);
    System.out.println("friendPartners[3] = " + friendPartners[3]);
    System.out.println("friendPartners[5] = " + friendPartners[5]);
  }
}

