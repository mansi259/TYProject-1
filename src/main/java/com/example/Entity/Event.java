package com.example.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
public class Event {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="event_id",updatable = false,length = 4)
		private int event_id;
		@NonNull
		private String event_name;
		@NonNull
		private Date event_startdate;
		@NonNull
		private Date event_enddate;
		@NonNull
		@Temporal(TemporalType.TIME)
		private Date event_starttime;
		@NonNull
		@Temporal(TemporalType.TIME)
		private Date event_endtime;
		@Nullable
		private String event_description;
		public Event() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Event(int event_id, String event_name, Date event_startdate, Date event_enddate, Date event_starttime,
				Date event_endtime, String event_description) {
			super();
			this.event_id = event_id;
			this.event_name = event_name;
			this.event_startdate = event_startdate;
			this.event_enddate = event_enddate;
			this.event_starttime = event_starttime;
			this.event_endtime = event_endtime;
			this.event_description = event_description;
		}
		public int getEvent_id() {
			return event_id;
		}
		public void setEvent_id(int event_id) {
			this.event_id = event_id;
		}
		public String getEvent_name() {
			return event_name;
		}
		public void setEvent_name(String event_name) {
			this.event_name = event_name;
		}
		public Date getEvent_startdate() {
			return event_startdate;
		}
		public void setEvent_startdate(Date event_startdate) {
			this.event_startdate = event_startdate;
		}
		public Date getEvent_enddate() {
			return event_enddate;
		}
		public void setEvent_enddate(Date event_enddate) {
			this.event_enddate = event_enddate;
		}
		public Date getEvent_starttime() {
			return event_starttime;
		}
		public void setEvent_starttime(Date event_starttime) {
			this.event_starttime = event_starttime;
		}
		public Date getEvent_endtime() {
			return event_endtime;
		}
		public void setEvent_endtime(Date event_endtime) {
			this.event_endtime = event_endtime;
		}
		public String getEvent_description() {
			return event_description;
		}
		public void setEvent_description(String event_description) {
			this.event_description = event_description;
		}
		@Override
		public String toString() {
			return "Event [event_id=" + event_id + ", event_name=" + event_name + ", event_startdate=" + event_startdate
					+ ", event_enddate=" + event_enddate + ", event_starttime=" + event_starttime + ", event_endtime="
					+ event_endtime + ", event_description=" + event_description + "]";
		}
		
		
}
