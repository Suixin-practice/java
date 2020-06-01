package javaooOne.userdemo.printdemo;

import javaooOne.userdemo.printdemo.impl.A4PaperImpl;
import javaooOne.userdemo.printdemo.impl.ColorInkBoxImpl;

public class printerTest {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.setInkbox(new ColorInkBoxImpl());
		printer.setPaper(new A4PaperImpl());
		printer.print("≤‚ ‘");
	}
}
