package com.pinaki.user.service.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Rating {
	private String rId;
	private String userId;
	private String movieId;
	private int rating;
	private String reviews;
	private Movie movie;

}
