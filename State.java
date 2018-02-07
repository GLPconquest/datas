package datas;

import Resources;

public class State {

	public State() {
		super(resources money, resources food, resources oil, resources electricity);
	}
	
	public int spent(resources money, resources food, resources oil, resources electricity) {
		if (/*Unit buying*/) {
			this.money=money-/*Unit price*/;
		}
		if (/*Unit buying*/) {
			this.food=food-/*Unit price*/;
		}
		if (/*Unit buying*/) {
			this.oil=oil-/*Unit price*/;
		}
		if (/*Unit buying*/) {
			this.electricity=electricité-/*Unit price*/;
		}
	}
	
	public int gainMoney(resources money) {
		 switch(level.mine){
	            case '0':
	                this.money=money+0;
	            break;
	            case '1':
	            	this.money=money+2;
	            break;
	            case '2':
	            	this.money=money+4;
	            break;
	            case '3':
	            	this.money=money+6;
	            break;
	            case '4':
	            	this.money=money+8;
	            break;
		 }
	}
	
	public int gainFood(resources money, resources food) {
		 switch(level.farm){
	            case '0':
	                this.money=money+0;
	                this.food=food+0;
	            break;
	            case '1':
	            	this.money=money+1;
	            	this.food=food+1;
	            break;
	            case '2':
	            	this.money=money+2;
	            	this.food=food+2;
	            break;
	            case '3':
	            	this.money=money+3;
	            	this.food=food+3;
	            break;
	            case '4':
	            	this.money=money+4;
	            	this.food=food+4;
	            break;
		 }
	}
	
	public int gainOil(resources money, resources oil) {
		 switch(level.oilWell){
	            case '0':
	                this.money=money+0;
	                this.oil=oil+0;
	            break;
	            case '1':
	            	this.money=money+1;
	            	this.oil=oil+1;
	            break;
	            case '2':
	            	this.money=money+2;
	            	this.oil=oil+2;
	            break;
	            case '3':
	            	this.money=money+3;
	            	this.oil=oil+3;
	            break;
	            case '4':
	            	this.money=money+4;
	            	this.oil=oil+4;
	            break;
		 }
	}
	
	public int gainElectricity(resources money, resources electricity) {
		 switch(level.nuclearPlant){
	            case '0':
	                this.money=money+0;
	                this.electricity=electricity+0;
	            break;
	            case '1':
	            	this.money=money+1;
	            	this.electricity=electricity+1;
	            break;
	            case '2':
	            	this.money=money+2;
	            	this.electricity=electricity+2;
	            break;
	            case '3':
	            	this.money=money+3;
	            	this.electricity=electricity+3;
	            break;
	            case '4':
	            	this.money=money+4;
	            	this.electricity=electricity+4;
	            break;
		 }
	}

}