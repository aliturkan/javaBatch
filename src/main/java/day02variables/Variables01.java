    package day02variables;

    public class Variables01 {

        //Primitive Data Types: byte - short - int - long - float - double - char - boolean
        //                      byte - short - int - long are for "whole numbers"
        //                      float - double are for "decimal values"
        //                      char is for "single characters"
        //                      boolean is for "true - false values"

        //char data type: char is for a single character. Like A, ?, 5 etc.
        //                When you use a value for "char"s, put it between single quotes
        //                char uses 16 bits(2 bytes) in memory
        public char initial = 'A';

        //byte data type: byte is for whole numbers. Like 23, 120, 8, -98, etc.
        //                byte can have values from -128 to 127
        //                byte uses 8 bits(1 byte) in memory
        public byte age = 45;

        //short data type:short is for whole numbers. Like 23, 145, 2987, etc.
        //                short can have values from -32768 to 32767
        //                short uses 16 bits(2 bytes) in memory
        public short numOfPeopleInAnApartment = 2500;

        //int data type: int is for whole numbers.Like 43, 23987, 23000000, 1000000000, etc.
        //               int can have values from -2,147,483,648 to 2,147,483,647
        //               int uses 32 bits(4 bytes) in memory
        public int populationOfCountry = 4500000;

        //long data type: long is for whole numbers. Like 45000000, etc.
        //                long can have values from  -9,223,372,036,854,755,808 to 9,223,372,036,854,755,807
        //                long uses 64 bits(8 bytes) in memory.
        //Note: If the value of a "long variable" is out of range of the "int", put "L" to the end of the value
        public long populationOfTheWorld = 7200000000L;
        public long profit = 23000000;

        //float data type: float is for decimal values. Like 2.34 - 5.234 - etc.
        //                 float uses 32 bits in memory
        public float priceOfShirt = 12.99F;

        //double data type: double is for decimal values. Like 3.24356897
        //                  double uses 64 bits in memory
        public double weightOfACell = 0.00000000000234;
    }
