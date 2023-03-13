/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1;

/**
 *
 * @author ED05
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //refactor -- rename
        CCuenta miCuenta;
        double saldoActual;
        float cantidad = 3000;
        
        operativa_cuenta(cantidad);
    }

    public static void operativa_cuenta(float cantidad) {
        CCuenta miCuenta;
        double saldoActual;
        miCuenta = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        miCuenta = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        //refactor -- introduce method
        //Refactor -- changed metod parameters
        
        try 
        {
            miCuenta.retirar(2300);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        try
        {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = miCuenta.getEstado();
        System.out.println("El saldo actual es"+ saldoActual );
    }

}
