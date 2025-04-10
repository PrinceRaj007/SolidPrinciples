package InterfaceSegregationPrinciple.noncomplaint;

/*ISP states Clients should not be forced to be depended on their interface they don not use*/
class MultiFunctionPrinterDriver{
	public static void main(String[] args) {
		MultiFunctionPrinter newMachine = new WorkStationPrinter();
		newMachine.print();
		newMachine.scan();
		newMachine.fax();
		MultiFunctionPrinter oldMachine = new NormalPrinter();
		oldMachine.print();
		oldMachine.scan(); // Will not do anything
	}
}
interface MultiFunctionPrinter {
	public void print();
	public void scan();
	public void fax();
}
class WorkStationPrinter implements MultiFunctionPrinter{
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
class HpScannerPrinter implements MultiFunctionPrinter{

	@Override
	public void print() {
		System.out.println("Hp Scanner Printer is Printing !!");
	}

	@Override
	public void scan() {
		System.out.println("Hp Scanner Printer is Scanning !!");
	}

	@Override
	public void fax() {
		// TODO Auto-generated method stub
		
	}
	
}
class NormalPrinter implements MultiFunctionPrinter{

	@Override
	public void print() {
		System.out.println("Normal Printer is Printing !!");		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fax() {
		// TODO Auto-generated method stub
		
	}
	
}
