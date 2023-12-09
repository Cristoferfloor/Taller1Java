package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class testcuenta {

    public static void main(String[] args) {
        // Llamada del primer constructor 
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(675);

        // llamada del segundo constructor 
        Cuenta cuenta2 = new Cuenta("03476", "C", 98);

        // laamada del primer contructor pero seteando el tipo ya que estaba predifinido anteriormente 
        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");

        
        System.out.println("--Valores Iniciales--");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        System.out.println("---------------------------------");

       
        cuenta1.setSaldo(444);
        
        cuenta3.setSaldo(567);
        
        cuenta2.setTipo("D");

        
        System.out.println("--Valores Modificados--");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        System.out.println("----------------------------------");

        
        Cuenta cuenta4 = new Cuenta("0987");
        cuenta4.setTipo("A");
        cuenta4.setSaldo(10);

       
        Cuenta cuenta5 = new Cuenta("0557", "C", 10);

        
        Cuenta cuenta6 = new Cuenta("0666");
        cuenta6.imprimirConMiEstilo(); 
        cuenta6.setTipo("A");
        cuenta6.setSaldo(0);
        cuenta6.imprimirConMiEstilo(); 
    }
}
