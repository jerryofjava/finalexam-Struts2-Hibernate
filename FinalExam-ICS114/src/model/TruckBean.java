package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Trucks")
public class TruckBean {

	private int weightLimit;
	
	@Id
	private int truckNo;
	private int weight;
	private String status;
	
	public int getTruckNo() {
		return truckNo;
	}
	public void setTruckNo(int truckNo) {
		this.truckNo = truckNo;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getWeightLimit() {
		return weightLimit;
	}
	public void setWeightLimit(int weightLimit) {
		this.weightLimit = weightLimit;
	}
}
