package session5;

public class BuildingTypes {
	
	private String generalDescription = null;

	//Constructor
	public BuildingTypes() {
		this.generalDescription = "All buildings have four walls and a roof. ";
	}
	
	public String BuildingOne() {
		String str = "This building type has 1 floor along with the other features. ";
		str = str + generalDescription;
		return str;
	}
	
	public String BuildingTwo() {
		String str = "This building type has 5 floors along with other features listed below. ";
		str = str + generalDescription;
		return str;
	}
	
	public static void main(String[] args) {
		BuildingTypes building = new BuildingTypes();
		System.out.println(building.BuildingOne());
		System.out.println(building.BuildingTwo());
	}

}
