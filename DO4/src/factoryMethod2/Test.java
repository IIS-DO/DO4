package factoryMethod2;

class Test {

	public static void main(String[] args) {
		ProcessBill processBill = new ProcessBillFactory();
		processBill.storeBill("gas");

	}

}
