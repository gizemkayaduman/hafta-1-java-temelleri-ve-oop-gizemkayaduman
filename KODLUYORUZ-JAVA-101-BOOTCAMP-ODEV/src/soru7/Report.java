package soru7;

import java.util.Date;

public class Report {

	private String name;
	private String result;
	Date createDate = new Date();
	
	public String getName(){
		return this.name;
	}
	
	public String getResult(){
		return this.result;
	}
	public Date getDate(){
		return this.createDate;
	}
	
	public void setName(String name){
		this.name=name;	
	}
	
	public void setResult(String result){
		this.result=result;	
	}
	public void setDate(){
		this.createDate= createDate;
	}
	
}
