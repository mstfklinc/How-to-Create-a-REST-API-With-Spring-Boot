package com.javaCourse.RESTApiHibernateAndJPA.BussinessLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;
import com.javaCourse.RESTApiHibernateAndJPA.DataAccessLayer.ICityDataAccessLayer;
import com.javaCourse.RESTApiHibernateAndJPA.Entities.City;

@Service
public class CityManager implements ICityService{

	private ICityDataAccessLayer cityDataAccessLayer;
	
	
	@Autowired
	public CityManager(ICityDataAccessLayer cityDataAccessLayer) {
		
		this.cityDataAccessLayer = cityDataAccessLayer;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		
		return cityDataAccessLayer.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		
		this.cityDataAccessLayer.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		
		this.cityDataAccessLayer.update(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		
		this.cityDataAccessLayer.delete(city);
		
	}

	@Override
	@Transactional
	public City getById(int id) {
		
		return this.cityDataAccessLayer.getById(id);
	}

	

	
	

}
