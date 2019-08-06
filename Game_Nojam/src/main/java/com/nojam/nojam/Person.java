package com.nojam.nojam;

public class Person {
	public int idx;
	public String name;
	public int attackPower;
	public int defencePower;
	public int attackRate;
	public int defenceRate;
	public int HP;
	
	
	Person() {
		
	}
	
	
	Person(String name, int attackPower, int defencePower, int attackRate, int defenceRate, int HP) {
		this.name = name;
		this.attackPower = attackPower;
		this.defencePower = defencePower;
		this.attackRate = attackRate;
		this.defenceRate = defenceRate;
		this.HP = HP;
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
		tagString = tagString + this.attackPower;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.defencePower;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.attackRate;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.defenceRate;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.HP;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + "<a href ='/nojam/startGame?idx=" + this.idx + "'>게임 시작</a>";
		tagString = tagString + "</td>";
		tagString = tagString + "</tr>";
		
		return tagString;
	}
	


}
