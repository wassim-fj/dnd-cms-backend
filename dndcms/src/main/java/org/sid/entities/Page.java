package org.sid.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Page {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	@Column(length = 25)
	private String name;
	
	@Column(length = 25)
	private String code;

	@Column(length = 255)
	private String description;
	
	@Column(length = 100)
	private String route;
	
	@Column(columnDefinition="TEXT")
	private String content;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	private Date createdAt;
}
