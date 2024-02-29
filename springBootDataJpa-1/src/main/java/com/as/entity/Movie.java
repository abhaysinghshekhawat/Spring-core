package com.as.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sp_movie")
public class Movie implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // default value
	@Column(name="MID")
	private Integer mid;
	@Column(name="MNAME",length=20,nullable=false)
	private String mname;
	@Column(name="YEAR",length=20)
	private String year;
	@Column(name="RATING")
	private Integer rating;
}
