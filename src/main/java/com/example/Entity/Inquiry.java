package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
public class Inquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="inquiry_id",updatable = false,length = 4)
	private int inquiry_id;
	@NonNull
	private String contactno;
	@NonNull
	private String inquiry_message;
	@Nullable
	private String inquiry_response;
	public Inquiry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inquiry(int inquiry_id, String contactno, String inquiry_message, String inquiry_response) {
		super();
		this.inquiry_id = inquiry_id;
		this.contactno = contactno;
		this.inquiry_message = inquiry_message;
		this.inquiry_response = inquiry_response;
	}
	public int getInquiry_id() {
		return inquiry_id;
	}
	public void setInquiry_id(int inquiry_id) {
		this.inquiry_id = inquiry_id;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getInquiry_message() {
		return inquiry_message;
	}
	public void setInquiry_message(String inquiry_message) {
		this.inquiry_message = inquiry_message;
	}
	public String getInquiry_response() {
		return inquiry_response;
	}
	public void setInquiry_response(String inquiry_response) {
		this.inquiry_response = inquiry_response;
	}
	@Override
	public String toString() {
		return "Inquiry [inquiry_id=" + inquiry_id + ", contactno=" + contactno + ", inquiry_message=" + inquiry_message
				+ ", inquiry_response=" + inquiry_response + "]";
	}
	
	
}
