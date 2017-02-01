package com.course.buildings;

public class House extends Building{
	int bedroomNo,bathNo;

	public void setBedroomNo(int b){
		bedroomNo=b;
	}

	public void setBathNo(int b){
		bathNo=b;
	}

	public int getBedroomNo(){
		return bedroomNo;
	}

	public int getBathNo(){
		return bathNo;
	}
}