/*realize un programa que permita hacer la suma de dos  numeros biginteger. 
oserbacion aberiaguar como funciona el biginteger
-------------------------------------------
big integer:
es un numero mucho ams grande que un int normal
soporte para las mismas operaciones del integer normal
soporte adicional para operaciones aritmeticas, manipulacion de bits, etc


*/

package paquete;
import java.math.BigInteger;
import java.util.Scanner;

public class Operaciones {
    Scanner s;
    BigInteger num1 ;
    BigInteger num2 ;
    BigInteger rts ;
    
    Operaciones(){
        System.out.println("constructor de operaciones");
        s =new Scanner(System.in);
    }
    
    void suma(){
        System.out.println("ingrese un numero muuuy grande");
        num1 = s.nextBigInteger();
        System.out.println("ingrese otro numero muuuy grande");
        num2 = s.nextBigInteger();
        BigInteger rst = num1.add(num2);
        System.out.println("la suma  muuy grande es: "+ rst);
    }
    
}
