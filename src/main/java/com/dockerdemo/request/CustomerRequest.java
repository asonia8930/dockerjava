package com.dockerdemo.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerRequest {

@JsonProperty("customerName")
private String customerName;
@JsonProperty("houseNo")
private String houseNo;
@JsonProperty("street")
private String street;
@JsonProperty("landmark")
private String landmark;
@JsonProperty("city")
private String city;
@JsonProperty("pincode")
private Long pincode;


}
