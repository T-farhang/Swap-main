/*
 *      
                Tahereh Farhang , Barbod Accademy , 2nd session , 8th excercise.
 *                      Swapping twe numbers
 */
package swap.main;

public class SwapMain {

    public static void main(String[] args) {
        Swap c = new Swap();
        c.setA(100);
        c.setB(200);
        System.out.println("Before swap A is " + c.getA());
        System.out.println("Before swap B is " + c.getB());
        Swap d = new Swap(c.getA(), c.getB());
        System.out.println("After swap A is " + d.getA());
        System.out.println("After swap B is " + d.getB());
    }
}
