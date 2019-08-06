package com.nojam.nojam;

public class Com {
		public int idx;
		public String name;
		public int attackPower;
		public int defencePower;
		public int attackRate;
		public int defenceRate;
		public int HP;
		
		
		Com() {
			
		}
		
		Com(String name, int attackPower, int defencePower, int attackRate, int defenceRate, int HP) {
			this.name = name;
			this.attackPower = attackPower;
			this.defencePower = defencePower;
			this.attackRate = attackRate;
			this.defenceRate = defenceRate;
			this.HP = HP;
		}
	
		
		
		public String toGameString() {
			String tagString = "";
			tagString = tagString + "<tr>";
			tagString = tagString + "<td>";
			tagString = tagString + this.name;
			tagString = tagString + "</td>";
			tagString = tagString + "</tr>";
			return tagString;
		}
}
