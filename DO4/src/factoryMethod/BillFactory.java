package factoryMethod;

public class BillFactory {
	
	public Bill createBill(String type) {
		switch(type){
		case "electricity":
			return new ElectricityBill();
		case "gas":
			return new GasBill();
		default:
			return null;
		}
	}

}
