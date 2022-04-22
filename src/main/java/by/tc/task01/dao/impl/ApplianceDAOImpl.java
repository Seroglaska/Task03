package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.createapp.CreateAppliance;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO{


	@Override
	public List <Appliance> find(Criteria criteria) {
		List <Appliance> appliances = new ArrayList<>();
		String filePath = Objects.requireNonNull(getClass().getResource("/appliances_db.txt")).getPath();
		File file = new File(filePath);
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try{
			String line;
			String criteriaClassName = criteria.getGroupSearchName();
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) !=null){
				if(line.contains(criteriaClassName)){
					appliances.add(makeApp(criteria, line));
				}
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File not found!");
		}
		catch (IOException e){
			System.out.println();
		}
		finally {
			try{
				bufferedReader.close();
			}
			catch(IOException e){
				System.out.println("Stream closing problem!");
			}
		}
		return appliances;
	}

	private Map<String, Object> infFromDb = new HashMap<>();
	private Appliance makeApp(Criteria criteria, String line){
		boolean access = compareCriteria(makeMap(spliter(line)), criteria);
				if(access == true){
					switch (criteria.getGroupSearchName()) {
						case "Laptop":
							return new CreateAppliance().createLaptop(makeMap(spliter(line)));
						case "Oven":
							return new CreateAppliance().createOven(makeMap(spliter(line)));
						case "Refrigerator":
							return new CreateAppliance().createRefrigerator(makeMap(spliter(line)));
						case "Speakers":
							return new CreateAppliance().createSpeakers(makeMap(spliter(line)));
						case "TabletPC":
							return new CreateAppliance().createTabletPC(makeMap(spliter(line)));
						case "VacuumCleaner":
							return new CreateAppliance().createVacuumCleaner(makeMap(spliter(line)));
						default:
							throw new RuntimeException("The name of appliance is not correct!");
					}
				}
				else{
					return null;
				}
	}

	private Map<String, Object> map = new HashMap<>();
	private Map<String, Object> makeMap(String [] infFromDB){
		for(int i = 1; i < infFromDB.length; i+=2){
			map.put(infFromDB[i], infFromDB[i + 1]);
		}
		return map;
	}


	private String [] spliter(String line){
		String [] infFromDB = line.replaceAll("(;|:|=|,|\\s)+", " ").split(" ");
		return infFromDB;
	}

	private boolean compareCriteria(Map<String, Object> mapToCompare, Criteria criteria){
		int count = 0;
		for(Map.Entry<String, Object> entryMapToCompare: mapToCompare.entrySet()){
			for(Map.Entry<String, Object> entryCriteriaMap: criteria.getCriteriaMap().entrySet()){
				if(entryMapToCompare.getKey().equals(entryCriteriaMap.getKey())
						&& entryMapToCompare.getValue().toString().equalsIgnoreCase(String.valueOf(entryCriteriaMap.getValue()))){
					count++;
				}
			}
		}
		if(count == criteria.getCriteriaMap().size()){
			return true;
		}
		else{
			return false;
		}
	}
}


