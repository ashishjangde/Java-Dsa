package practice;

public class Datatypes {
    public static void main(String[] args) {
        byte a = 1;  // byte: Size = 1 byte (8 bits), Range = -128 to 127
        short b = 2;  // short: Size = 2 bytes (16 bits), Range = -32,768 to 32,767
        char c = 'j';  // char: Size = 2 bytes (16 bits), Range = 0 to 65,535 (unicode characters)  a to z and A to Z
        boolean d = true;  // boolean: Size = 1 bit (true or false)
        float e = 3.14f;  // float: Size = 4 bytes (32 bits), Range = ±3.4e−38 to ±3.4e+38
        long f = 123456789;  // long: Size = 8 bytes (64 bits), Range = -2^63 to 2^63 - 1
        double g = 12278.45445;  // double: Size = 8 bytes (64 bits), Range = ±4.9e−324 to ±1.8e+308

        System.out.printf("%d %d %c %b %.2f %d %.5f%n", a, b, c, d, e, f, g);

//        we have more data types available that we will discuss later
//                String ,
//                Object ,
//                Class ,
//                Array ,
//                Interface ,

    }
}
