package ChapterNine.boxing_examples;

public class autoboxingUnboxing {
    public static void main(String[] args) {
        // Autoboxing all Primitive data type to wrapper class
        // Integer
        int number = 14500;
        Integer wInteger = number;
        System.out.println("Integer Primitive: " + number + " and Wrapper: " + wInteger);

        // Character
        char charFirst = 'S';
        Character wCharacter = charFirst;
        System.out.println("Character Primitive: " + charFirst + " and Wrapper: " + wCharacter);

        // Short
        short shortFirst = 12823;
        Short wShort = shortFirst;
        System.out.println("Short Primitive: " + shortFirst + " and Wrapper: " + wShort);

        // Boolean
        boolean boolFirst = true;
        Boolean wBoolean = boolFirst;
        System.out.println("Boolean Primitive: " + boolFirst + " and Wrapper: " + wBoolean);

        // Float
        float floatFirst = 20.3f;
        Float wFloat = floatFirst;
        System.out.println("Float Primitive: " + floatFirst + " and Wrapper: " + wFloat);

        // Long
        long longFirst = 918297612;
        Long wLong = longFirst;
        System.out.println("Long Primitive: " + longFirst + " and Wrapper: " + wLong);

        // Double
        double doubleFirst = 912837812126.912313d;
        Double wDouble = doubleFirst;
        System.out.println("Double Primitive: " + doubleFirst + " and Wrapper: " + wDouble);

        // Byte
        byte byteFirst = 127;
        Byte wByte = byteFirst;
        System.out.println("Byte Primitive: " + byteFirst + " and Wrapper: " + wByte);

        // Unboxing all Primitive data type to wrapper class
        // Integer
        Integer uInteger = new Integer(123422689);
        int numberTwo = uInteger;
        System.out.println("Integer Wrapper: " + uInteger + " and Primitive: " + numberTwo);

        // Byte
        Byte uByte = new Byte((byte) 127);
        byte byteTwo = uByte;
        System.out.println("Byte Wrapper: " + uByte + " and Primitive: " + byteTwo);

        // Long
        Long uLong = new Long(123422689);
        long longTwo = uLong;
        System.out.println("Long Wrapper: " + uLong + " and Primitive: " + longTwo);
    }
}
