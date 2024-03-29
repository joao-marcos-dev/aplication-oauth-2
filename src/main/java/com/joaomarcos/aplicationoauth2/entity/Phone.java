package com.joaomarcos.aplicationoauth2.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_phone")
public class Phone implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Getter
	@Setter
	private String number;

	@Getter
	@Setter
	private String note;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_client")
	@Getter
	@Setter
	private Client client;
	
	
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "id_phone_type")
	private PhoneType phoneType;
	
}
