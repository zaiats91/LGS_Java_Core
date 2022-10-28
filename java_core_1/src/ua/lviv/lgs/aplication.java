package ua.lviv.lgs;

public class aplication {
	
public static void main(String[] args) {
	
	// task 1
	byte a = 1;
	short b = 11;
	int c = 21;
	long d = 31L;
	float e = 41;
	double f = 51F;
	char g = 'q';
	boolean h = false;
	
	System.out.println("byte = "+ a);
	System.out.println("short = "+ b);	
	System.out.println("int = "+ c);
	System.out.println("long = "+ d);
	System.out.println("float = "+ e);
	System.out.println("double = "+ f);
	System.out.println("char = "+ g);
	System.out.println("boolean = "+ h);
	System.out.println();
	
	// task 2
	System.out.println("byte_min = " + Byte.MIN_VALUE);
	System.out.println("byte_max = " + Byte.MAX_VALUE);
	System.out.println("short_min = " + Short.MIN_VALUE);
	System.out.println("short_max = " + Short.MAX_VALUE);
	System.out.println("int_min = " + Integer.MIN_VALUE);
	System.out.println("int_max = " + Integer.MAX_VALUE);
	System.out.println("long_min = " + Long.MIN_VALUE);
	System.out.println("long_max = " + Long.MAX_VALUE);	
	System.out.println("float_max = " + Float.MAX_VALUE);
	System.out.println("float_min = " + Float.MIN_VALUE);
	System.out.println("double_min = " + Double.MIN_VALUE);
	System.out.println("double_max = " + Double.MAX_VALUE);
	System.out.println("char_min = " + (int)  Character.MIN_VALUE);
	System.out.println("char_max = " + (int) Character.MAX_VALUE);

	// task 3
	
	int [ ] array = {10, 5, 7, -3 , 8, 57, -1, -67, 0, 2};
	
	int min = array[0];
	int max = array[0];
	
	for (int i = 0; i < array.length; i++) {
		if (min > array[i]){
			min = array[i];			
		}
		if (max < array[i]){
			max = array[i];			
		}
	}
	
	System.out.println("min  = " + min);
	System.out.println("max  = " + max);
}
	
}
