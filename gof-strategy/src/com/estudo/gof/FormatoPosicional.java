package com.estudo.gof;

public class FormatoPosicional implements ArrayFormata {
	public void mostrar(int[] arr) {
		for (int n = 0; n < arr.length; n++)
			System.out.println("Arr [" + n + "] = " + arr[n]);
	}
}
