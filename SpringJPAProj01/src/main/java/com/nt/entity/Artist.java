  package com.nt.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;

@Entity
@Table(name="ARTIST_INFO")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class Artist {
@Column (name="AID")
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int aid;

@NonNull
@Column(name="ANAME",length=40)
private String aname;
@NonNull
@Column (length=30)
private String category;
@NonNull

private Double fee;

}










