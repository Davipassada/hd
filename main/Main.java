package poo.main;

import poo.gestaodecaixaeletronico.CadastroContas;
import poo.gestaodecaixaeletronico.Terminal;
import poo.gestaodecontas.Cliente;
import poo.gestaodecontas.Conta;

public class Main {

	public static void main(String args[]) {
		Cliente clientes[] = { new Cliente("123", "Maria"), new Cliente("123", "Joao"), new Cliente("123", "Tomaz"), new Cliente("123", "Zila") };
		CadastroContas bd = new CadastroContas(4);
		for (int i = 0; i < clientes.length; i++) {
			bd.adicionaConta(new Conta(i + 101, clientes[i], 123, 1000.0));
		}
		Terminal meuTerminal = new Terminal(bd);
		meuTerminal.iniciaOperacao();
	}
}
