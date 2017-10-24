package com.infiniteskills.data.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "time_test")
public class TimeTest {
	@Id
	@GeneratedValue
	@Column(name = "TIME_TEST_ID")
	private Long timeTestId;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATETIME_COLUMN")
	private Date DateTimeColumn;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TIMESTAMP_COLUMN")
	private Date TimeStampColumn;
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_COLUMN")
	private Date DateColumn;
	@Temporal(TemporalType.TIME)
	@Column(name = "TIME_COLUMN")
	private Date TimeColumn;

	@Column(name = "SQL_DATETIME_COLUMN")
	private java.sql.Timestamp SqlDateTimeColumn;

	@Column(name = "SQL_TIMESTAMP_COLUMN")
	private java.sql.Timestamp SqlTimeStampColumn;

	@Column(name = "SQL_DATE_COLUMN")
	private java.sql.Date SqlDateColumn;

	@Override
	public String toString() {
		return "TimeTest [timeTestId=" + timeTestId + ", DateTimeColumn=" + DateTimeColumn + ", TimeStampColumn="
				+ TimeStampColumn + ", DateColumn=" + DateColumn + ", TimeColumn=" + TimeColumn + ", SqlDateTimeColumn="
				+ SqlDateTimeColumn + ", SqlTimeStampColumn=" + SqlTimeStampColumn + ", SqlDateColumn=" + SqlDateColumn
				+ ", SqlTimeColumn=" + SqlTimeColumn + "]";
	}

	@Column(name = "SQL_TIME_COLUMN")
	private java.sql.Time SqlTimeColumn;
	
	public Long getTimeTestId() {
		return timeTestId;
	}

	public void setTimeTestId(Long timeTestId) {
		this.timeTestId = timeTestId;
	}

	public Date getDateTimeColumn() {
		return DateTimeColumn;
	}

	public void setDateTimeColumn(Date dateTimeColumn) {
		DateTimeColumn = dateTimeColumn;
	}

	public Date getTimeStampColumn() {
		return TimeStampColumn;
	}

	public void setTimeStampColumn(Date timeStampColumn) {
		TimeStampColumn = timeStampColumn;
	}

	public Date getDateColumn() {
		return DateColumn;
	}

	public void setDateColumn(Date dateColumn) {
		DateColumn = dateColumn;
	}

	public Date getTimeColumn() {
		return TimeColumn;
	}

	public void setTimeColumn(Date timeColumn) {
		TimeColumn = timeColumn;
	}

	public java.sql.Timestamp getSqlDateTimeColumn() {
		return SqlDateTimeColumn;
	}

	public void setSqlDateTimeColumn(java.sql.Timestamp sqlDateTimeColumn) {
		SqlDateTimeColumn = sqlDateTimeColumn;
	}

	public java.sql.Timestamp getSqlTimeStampColumn() {
		return SqlTimeStampColumn;
	}

	public void setSqlTimeStampColumn(java.sql.Timestamp sqlTimeStampColumn) {
		SqlTimeStampColumn = sqlTimeStampColumn;
	}

	public java.sql.Date getSqlDateColumn() {
		return SqlDateColumn;
	}

	public void setSqlDateColumn(java.sql.Date sqlDateColumn) {
		SqlDateColumn = sqlDateColumn;
	}

	public java.sql.Time getSqlTimeColumn() {
		return SqlTimeColumn;
	}

	public void setSqlTimeColumn(java.sql.Time sqlTimeColumn) {
		SqlTimeColumn = sqlTimeColumn;
	}

	public TimeTest()
	{
		
	}
	
	public TimeTest(Date date)
	{
		this.TimeStampColumn = date;
		this.DateTimeColumn = date;
		this.TimeColumn=date;
		this.TimeStampColumn=date;
		this.DateColumn=date;
		
		this.SqlDateColumn=new java.sql.Date(date.getDate());
		this.SqlTimeColumn=new java.sql.Time(date.getTime());
		this.SqlTimeStampColumn=new java.sql.Timestamp(date.getTime());
		this.SqlDateTimeColumn=new java.sql.Timestamp(date.getTime());
	}
}
