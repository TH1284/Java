package com.cc.tt;

public class People {
	public int idx;
	public String name;
	public String favoriteColor;
	public String address;
	
	People() {
	}
	People(String name, String favoriteColor, String address) {
		this.name = name;
		this.favoriteColor = favoriteColor;
		this.address = address;
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
		tagString = tagString + "<a href='modify?idx=" + this.idx+ "'>수정하기</a>";
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + "<a href='delete?idx=" + this.idx+ "'>삭제하기</a>";
		tagString = tagString + "</td>";
		tagString = tagString + "</tr>";
		return tagString;
	}
}
