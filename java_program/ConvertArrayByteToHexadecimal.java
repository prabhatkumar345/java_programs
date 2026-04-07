import java.util.Scanner;

public class ConvertArrayByteToHexadecimal{
    public static String byteToHex(byte b) {
        char[] hexChars = new char[2];
        int value = b;
        if (value < 0) {
            value = value + 256; 
        }
       int first = value / 16;
        int second = value % 16;
hexChars[0] = getHexChar(first);
hexChars[1] = getHexChar(second);
 return new String(hexChars);
    }
    public static char getHexChar(int num) {
        if (num < 10)
            return (char) ('0' + num);
        else
            return (char) ('A' + (num - 10));
    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter number of bytes: ");
        int n = sc.nextInt();

        byte[] arr = new byte[n];
        System.out.println("Enter byte values (-128 to 127):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextByte();
        }
        System.out.print("Hexadecimal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(byteToHex(arr[i]) + " ");
        }
        sc.close();
    }
}