/**
 * 
 */
package com.springboot.config.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author TTDKOC
 *
 */
@Entity
@Table(name = "my_properties")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MyProperties implements Serializable{

	private static final long serialVersionUID = 6747531716778688077L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="application")
	private String application;
	@Column(name="profile")
	private String profile;
	@Column(name="label")
	private String label;
	@Column(name="property_key")
	private String key;
	@Column(name="property_value")
	private String value;
}
