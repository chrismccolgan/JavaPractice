package academy.learnprogramming;

public class IntByteShortLong {

  public static void intByteShortLong() {
    int myValue = 10000;

    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer Min Value = " + myMinIntValue);
    System.out.println("Integer Max Value = " + myMaxIntValue);
    System.out.println("Overflow: " + (myMaxIntValue + 1));
    System.out.println("Underflow: " + (myMinIntValue - 1));

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Min Value = " + myMinByteValue);
    System.out.println("Byte Max Value = " + myMaxByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Min Value = " + myMinShortValue);
    System.out.println("Short Max Value = " + myMaxShortValue);

    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long Min Value = " + myMinLongValue);
    System.out.println("Long Max Value = " + myMaxLongValue);
    long myLongValue = 300_000_000_000L;
    System.out.println(myLongValue);

    byte myNewByteValue = (byte) (myMinByteValue / 2);

    byte myByte = 100;
    short myShort = 20000;
    int myInt = 20;
    long myLong = 50000L + 10L * (myByte + myShort + myInt);
    System.out.println(myLong);
  }
}
