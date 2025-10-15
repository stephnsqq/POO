package AE2.VERSION_A;

public class Principal {
    public static void main(String[] args){
        // CUENTA 1
        System.out.println("Creando cuenta 1 de banco");
        CuentaBancaria cuenta1 = new CuentaBancaria("PAUL SANCHEZ","1222336",10.0);
        System.out.println(cuenta1.toString());
        cuenta1.depositar(100);
        cuenta1.retirar(200);
        System.out.println(cuenta1.toString());


        // CUENTA 2
        System.out.println("*************************************************************************************************************");
        System.out.println("Creando cuenta 2 de banco");
        CuentaBancaria cuenta2 = new CuentaBancaria("","245",-200);
        System.out.println(cuenta2.toString());
        cuenta2.depositar(-50);
        cuenta2.retirar(1000);
        System.out.println(cuenta2.toString());
        System.out.println("*************************************************************************************************************");
    }
}