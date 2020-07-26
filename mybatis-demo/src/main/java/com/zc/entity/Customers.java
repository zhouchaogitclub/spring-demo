package com.zc.entity;

import java.io.Serializable;

/**
 * (Customers)实体类
 *
 * @author makejava
 * @since 2020-07-24 21:52:57
 */
public class Customers implements Serializable {
	private static final long serialVersionUID = -10888892799319179L;

	private Integer customernumber;

	private String customername;

	private String contactlastname;

	private String contactfirstname;

	private String phone;

	private String addressline1;

	private String addressline2;

	private String city;

	private String state;

	private String postalcode;

	private String country;

	private Integer salesrepemployeenumber;

	private Double creditlimit;

	@Override
	public String toString() {
		return "Customers{" +
				"customernumber=" + customernumber +
				", customername='" + customername + '\'' +
				", contactlastname='" + contactlastname + '\'' +
				", contactfirstname='" + contactfirstname + '\'' +
				", phone='" + phone + '\'' +
				", addressline1='" + addressline1 + '\'' +
				", addressline2='" + addressline2 + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", postalcode='" + postalcode + '\'' +
				", country='" + country + '\'' +
				", salesrepemployeenumber=" + salesrepemployeenumber +
				", creditlimit=" + creditlimit +
				'}';
	}

	public Integer getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(Integer customernumber) {
		this.customernumber = customernumber;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getContactlastname() {
		return contactlastname;
	}

	public void setContactlastname(String contactlastname) {
		this.contactlastname = contactlastname;
	}

	public String getContactfirstname() {
		return contactfirstname;
	}

	public void setContactfirstname(String contactfirstname) {
		this.contactfirstname = contactfirstname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getSalesrepemployeenumber() {
		return salesrepemployeenumber;
	}

	public void setSalesrepemployeenumber(Integer salesrepemployeenumber) {
		this.salesrepemployeenumber = salesrepemployeenumber;
	}

	public Double getCreditlimit() {
		return creditlimit;
	}

	public void setCreditlimit(Double creditlimit) {
		this.creditlimit = creditlimit;
	}

}