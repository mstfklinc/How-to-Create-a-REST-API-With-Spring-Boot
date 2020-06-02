package com.javaCourse.RESTApiHibernateAndJPA.DataAccessLayer;

import com.javaCourse.RESTApiHibernateAndJPA.Entities.City;

import java.util.List;

public interface ICityDataAccessLayer {
	
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
	

}
