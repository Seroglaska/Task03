package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	private static String available = "This appliance is available.";
	private static String notAvailable = "This Appliance is not available.";
	
	public static void print(List<Appliance> appliance) {
		if (!appliance.isEmpty()) {
			for (Appliance elemOfAppliance : appliance) {
				if(elemOfAppliance == null){
					System.out.println(notAvailable + "\n");
				}
				else{
					System.out.println(elemOfAppliance.toString() + "\n" + available + "\n");
				}
			}
		}
	}
}
