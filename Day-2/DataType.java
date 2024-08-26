public class DataType {
    public static void main(String args[]){
        // byte size = 8 bit
        byte minValuesOfByte = -128;
        byte maxValuesOfByte = 127;
        System.out.println("min value of byte: "+ minValuesOfByte +"\n"+ "max value Of byte: "+ maxValuesOfByte);

        // short size = 16 bit
        short minValuesOfShort = -32768;
        short maxValuesOfShort = 32767;
        System.out.println("min value of short: "+ minValuesOfShort +"\n"+ "max value of short: "+ maxValuesOfShort);

        // int size = 32 bit
        int minValuesOfint = -2147483648;
        int maxValuesOfint = 2147483647;
        System.out.println("min value of int: "+ minValuesOfint +"\n"+ "max value of int: "+ maxValuesOfint);

        // long size = 64 bit
        // long value =  2147483647354345; //Error
        long value = 2147483647354345L; 
        long value1 = 2147483647354345l; 

        // In this case no suffix like L/l is required. By default value 2147483647 is considered by java compiler is int type. Internal type casting is done by compiler and int is auto promoted to Long type.
        long value3 = 2147483647;
        // Here we need to put suffix as L to treat the literal 2147483648 as long type by java compiler.
        long value4 = 2147483647L;

        System.out.println("long data: "+value);
        System.out.println("long data: "+value);
        System.out.println("long data: "+value3);
        System.out.println("long data: "+value4);


        // float 32 bit
        // range 3.4e-038 to 3.4e+038
        // Decimal Digits: 6
        // default value: 0.0f

        // float height = 10.8573; //Error
        float height = 10; 
        float height1 = 10.034F;
        float height2 = 10.034f;
        System.out.println("float data: "+height);
        System.out.println("float data: "+height1);
        System.out.println("float data: "+height2);

        // double 64 bit
        // range 1.7e-308 to 1.7e+308
        // Decimal Digits: 15
        // default value: 0.0d

        double width0 = 10.8573; 
        double width = 10; 
        double width1 = 10.034D;
        double width2 = 10.034d;
        System.out.println("double data: "+width0);
        System.out.println("double data: "+width);
        System.out.println("double data: "+width1);
        System.out.println("double data: "+width2);


        // boolean : take only true or false 
        // default value: false
        boolean b = true;
        boolean b1 = false;
        // boolean b2 = True; //Error
        System.out.println("boolean data: "+b);
        System.out.println("boolean data: "+b1);

        // char 16 bit
        // range: 0 to 65535
        // default Value: 0

        char a = 'a';
        char c = 99;
        System.out.println("char data: "+a);
        System.out.println("char data: "+c);
    }
}