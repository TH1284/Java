package com.cc.test0615;

public class Person {
	public int idx;
	public String name;
	public String favoriteColor;
	public String address;
	public String birthday;
	public String id;
	public String password;
	
	
	Person() {
	}
	
	
	Person(String name, String favoriteColor, String address, String birthday, String id, String password) {
		this.name = name;
		this.favoriteColor = favoriteColor;
		this.address = address;
		this.birthday = birthday;
		this.id = id;
		this.password = password;
	}
	
	Person(String name, String address, String birthday, String favoriteColor ) {
		this.name = name;
		this.address = address;
		this.birthday = birthday; 
		this.favoriteColor = favoriteColor;
	}
	
	
	public String toTableTagString() {
		String tagString = "";
		tagString = tagString + "<tr>";
		tagString = tagString + "<td>";
		tagString = tagString + this.idx;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.name;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.favoriteColor;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.address;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.birthday;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.id;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.password;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + "<a href ='modify?idx=" + this.idx + "'>수정하기</a>";
		tagString = tagString + "</td>";
		tagString = tagString + "</tr>";
		
		return tagString;
	}
}
