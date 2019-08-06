package com.cc.java0805;

public class Student {
//		public int IDX;
		public String REGIONSEG1;
	/* public String PRODUCTSEG1; */
		public String PRODUCTSEG2;
		public String REGIONSEG2;
		public String REGIONSEG3;
		public String PRODUCTSEG3;
		public int YEARWEEK;
		public int YEAR;
		public int WEEK;
		public int QTY;
		public int MA;
		public int SEASONALITY;
		public int FCST;
		public int NEW_SEASONALITY;
		public int NEW_FCST;
		
		public Student() {
			
		}
//		public Student(String REGIONSEG1, String PRODUCTSEG1, String PRODUCTSEG2,String REGIONSEG2,String REGIONSEG3,
//				String PRODUCTSEG3,int YEARWEEK,int YEAR,int WEEK,int QTY,int MA,int SEASONALITY,int FCST,int NEW_SEASONALITY,int NEW_FCST) {
////			this.IDX = IDX;
//			this.REGIONSEG1 = REGIONSEG1;
//		/* this.PRODUCTSEG1 = PRODUCTSEG1; */
//			this.PRODUCTSEG2 = PRODUCTSEG2;
//			this.REGIONSEG2 = REGIONSEG2;
//			this.REGIONSEG3 = REGIONSEG3;
//			this.PRODUCTSEG3 = PRODUCTSEG3;
//			this.YEARWEEK = YEARWEEK;
//			this.YEAR = YEAR;
//			this.WEEK = WEEK;
//			this.QTY = QTY;
//			this.MA = MA;
//			this.SEASONALITY = SEASONALITY;
//			this.FCST = FCST;
//			this.NEW_SEASONALITY = NEW_SEASONALITY;
//			this.NEW_FCST = NEW_FCST;
//			
//		}
	   
	   public String toTableTagString() {
			String tagString = "";
			tagString = tagString + "<tr>";
			tagString = tagString + "<td>";
			tagString = tagString + this.REGIONSEG1;
			tagString = tagString + "</td>";
//			tagString = tagString + "<td>";
//			tagString = tagString + this.PRODUCTSEG1;
//			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.PRODUCTSEG2;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.REGIONSEG2;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.REGIONSEG3;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.PRODUCTSEG3;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.YEARWEEK;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.YEAR;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.WEEK;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.QTY;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.MA;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.SEASONALITY;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.FCST;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.NEW_SEASONALITY;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.NEW_FCST;
			tagString = tagString + "</td>";
			tagString = tagString + "</tr>";
			return tagString;
		}
	}