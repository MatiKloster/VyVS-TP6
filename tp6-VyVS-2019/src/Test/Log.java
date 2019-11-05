package Test;

import java.io.PrintStream;

public class Log {
	private PrintStream stream;
	public Log() {
		stream=System.out;
	}
	public void show(String cadena) {
		stream.println(cadena);
	}
}
