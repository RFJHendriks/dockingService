package com.example.demo3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.NaturalId;

@Entity(name = "DOCKINGSTATION")
public class DockingStation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long dockingId;
	
	@NaturalId
	@Column(name = "NAAM", unique = true)
	@NotBlank(message = "DockingStationName cant be empty")
	private String naam;
	
	private Double lng;
	private Double lat;
	private int capacity;
	private Boolean active;
	private String city;
	private int bikes;
	
	public DockingStation() {
		
	}

	public long getDockingId() {
		return dockingId;
	}

	public void setDockingId(long dockingId) {
		this.dockingId = dockingId;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getBikes() {
		return bikes;
	}

	public void setBikes(int bikes) {
		this.bikes = bikes;
	}
	
	
	
	

}
