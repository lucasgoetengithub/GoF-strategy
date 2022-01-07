package com.estudo.gof;

public class Strat {
	public static void main(String[] args) {
		padronizar();
	}

	public static void padronizar() {
		MeuArray m = new MeuArray(10);
		m.addValorEmPos(6, 1);
		m.addValorEmPos(8, 0);
		m.addValorEmPos(1, 4);
		m.addValorEmPos(7, 9);
		System.out.println("Formato Corrente:");
		m.setEstrategia(new FormatoPadrao());
		System.out.println("Formato Posicional:");
		m.setEstrategia(new FormatoPosicional());
	}
}
