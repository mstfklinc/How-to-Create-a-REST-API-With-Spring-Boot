package com.javaCourse.RESTApiHibernateAndJPA.BussinessLayer;

import java.util.List;

import com.javaCourse.RESTApiHibernateAndJPA.Entities.City;

public interface ICityService {
	
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);

}
