package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		int count = 0;
		for(String str : criteria.getCriteriaMap().keySet()){
			for (Class<?> enumClass : SearchCriteria.class.getClasses()){
				if(enumClass.getSimpleName().equals(criteria.getGroupSearchName())){
					for(Object enumConstant : enumClass.getEnumConstants()){
						if(str.equals(enumConstant.toString())){
							count++;
						}
					}
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

