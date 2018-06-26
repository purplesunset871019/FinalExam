package com.exam;

import java.util.ArrayList;
import java.util.List;


public class Meals {
	
	static List<Meals> meal = new ArrayList<>();
	
	int numbering;
	String name;
	int cost;
	int kcal;
	int number;

	public Meals(int numbering,String name,	int cost,int kcal){
		this.numbering = numbering;
		this.name = name;
		this.cost = cost;
		this.kcal = kcal;

	}



	public void setNumbering(int numbering){
		this.numbering = numbering;
	}
	
	public int getNumbering(){
		return numbering;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setCost(int cost){
		this.cost = cost;
	}
	
	public int getCost(){
		return cost;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public int getNumber(){
		return number;
	}
	
	public List<Meals> getMeals(){
		return meal;
	}
}
