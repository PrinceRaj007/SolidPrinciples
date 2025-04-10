package InterfaceSegregationPrinciple.complaint;

class MultiPurposePrinterUpdatedDriver{
	public static void  main(String[] args) {
		PrintMachine printer = new NormalPrinter();
		printer.print();
		WorkStationPrinter multiPurposePrinter = new WorkStationPrinter();
		multiPurposePrinter.print();
		multiPurposePrinter.scan();
		multiPurposePrinter.fax();
	}
}
interface PrintMachine{
	public void print();
}
interface ScanMachine{
	public void scan();
}
interface FaxMachine{
	public void fax();
}
class WorkStationPrinter implements PrintMachine, ScanMachine, FaxMachine {

	@Override
	public void print() {
		System.out.println("Work Station Printer is Printing !!");
	}

	@Override
	public void scan() {
		System.out.println("Work Station Printer is Scanning !!");
	}

	@Override
	public void fax() {
		System.out.println("Work Station Printer is Sending Fax !!");
	}
	
}
class HpScannerPrinter implements PrintMachine, ScanMachine{

	@Override
	public void print() {
		System.out.println("Hp Scanner Printer is Printing !!");
	}

	@Override
	public void scan() {
		System.out.println("Hp Scanner Printer is Scanning !!");
	}	
}
class NormalPrinter implements PrintMachine{

	@Override
	public void print() {
		System.out.println("Normal Printer is Printing !!");		
	}
	
}
