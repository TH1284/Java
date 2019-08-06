package com.cc.Moth;



public class Player {
	public int idx;
	public String name;
	public String middleTest;
	public String finalTest;
	
	Player() {

	}
	Player(String name, String middleTest, String finalTest) {
		this.name = name;
		this.middleTest = middleTest;
		this.finalTest = finalTest;
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
		tagString = tagString + this.middleTest;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.finalTest;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + "<a href='update?idx=" + this.idx + "'>수정하기</a>";
		tagString = tagString + "</td>";
		tagString = tagString + "</tr>";
		return tagString;
	}
}
