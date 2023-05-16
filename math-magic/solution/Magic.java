public class Magic {
  public static void main(String[] args) {

    int myNumber = 99;
    int magicNumber = myNumber;

    magicNumber *= magicNumber; // Equivalent to: magicNumber = magicNumber * magicNumber;
    magicNumber += myNumber;    // Equivalent to: magicNumber = magicNumber + myNumber;
    magicNumber /= myNumber;    // Equivalent to: magicNumber = magicNumber / myNumber;
    magicNumber += 17;          // Equivalent to: magicNumber = magicNumber + 17;
    magicNumber -= myNumber;    // Equivalent to: magicNumber = magicNumber - myNumber;
    magicNumber /= 6;           // Equivalent to: magicNumber = magicNumber / 6;

    System.out.println(magicNumber);
  }
}
