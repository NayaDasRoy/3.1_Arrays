/*
 * Activity 3.1.1
 */
public class DogArray
{
  public static void main(String[] args)
  {
    Dog[] myDogs = { new Dog("Fido"), new Dog("Luna"), new Dog("Buddy") };
    Dog[] neighborsDogs = new Dog[2];

    System.out.println("My dogs:");
    System.out.println(myDogs[0].getName());
    System.out.println(myDogs[1].getName());
    System.out.println(myDogs[2].getName());

    neighborsDogs[0] = new Dog("Max");
    neighborsDogs[1] = new Dog("Bella");

    System.out.println("Neighbor's dogs:");
    System.out.println(neighborsDogs[0].getName());
    System.out.println(neighborsDogs[1].getName());

    // ERROR: A Dog[] can only hold Dog objects, not String objects.
    // Dog[] friendsDogs = {new Dog("Lady"), new String("Tramp")};
  }
}