package com.danielme.demo.springjpahib;

import java.util.List;

public interface ICountryDao
{
	
	  void addAll(List<Country> list);
	 
	  Country getCountryByName(String name);
	  
	  void deleteAll();
	  
	  List<Country> getAll();	  

}