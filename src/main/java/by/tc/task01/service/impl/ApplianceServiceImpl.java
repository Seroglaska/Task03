package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.util.Collections;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List <Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return Collections.emptyList();
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliance = applianceDAO.find(criteria);

		return appliance;
	}

}

//you may add your own new classes
