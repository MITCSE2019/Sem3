package com.course.buildings;

public class School extends Building{
	int classrooms,gradeLevel;

	public void setClassroom(int c){
		classrooms=c;
	}

	public void setGradeLevel(int g){
		gradeLevel=g;
	}

	public int getClassroom(){
		return classrooms;
	}

	public int getGradeLevel(){
		return gradeLevel;
	}
}