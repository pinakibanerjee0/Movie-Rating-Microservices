package com.pinaki.movie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Movie")
public class Movie {
	@Id
	@Column(name = "Movie Id")
	private String mId;
	@Column(name = "Movie Name")
	private String movieName;
	@Column(name = "Movie Description")
	private String desc;

}
