package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		
		// 1. Creación de instancias con diferentes constructores
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(897);
		
		Cuenta cuenta2 = new Cuenta("03476", "D", 98);
		
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		
		//2. Visualización inicial
		System.out.println("-------- Valores Iniciales ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		Cuenta cuenta4 = new Cuenta("2206103606");
		cuenta4.setSaldo(700.50);
		
		Cuenta cuenta5 = new Cuenta("2206103606");
		cuenta5.setTipo("F");
		cuenta5.setSaldo(800.75);
		
		Cuenta cuenta6 = new Cuenta("2206103606");
		cuenta6.setTipo("C");
		cuenta6.setSaldo(999.99);
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();

	}

}
