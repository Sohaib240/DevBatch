package com.example.demo.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "OUTPATIENT")
public class OutPatient {
	@Id
	@GeneratedValue
	@Column(name = "PATID")
	public String patientId;

	@Column(name = "CLINIC_CODE", nullable = false)
	public String clinicCode;

	@Column(name = "APPT_DATE", nullable = false)
	public Date appointmentDate;

	@Column(name = "REF_REASON", nullable = false)
	public String referenceReason;

	@Column(name = "OP_BOOKINGS_ID", nullable = false)
	public int opBookingsId;

	@Column(name = "DOC_CODE", nullable = false)
	public String docCode;

	@Column(name = "APPT_TIME", nullable = false)
	public Date appointmentTime;

	@Column(name = "ARRIVE_TIME_RECEPTION", nullable = false)
	public Date arriveTimeReception;

	@Column(name = "SEEN_TIME", nullable = false)
	public Date seenTimeStart;

	@Column(name = "APPT_TYPE", nullable = false)
	public String appointmentType;

	@Column(name = "PATIENT_NAME", nullable = false)
	public String patientName;

	@Column(name = "SERVICE", nullable = false)
	public String service;

	@Column(name = "DEPARTMENT", nullable = false)
	public String department;

	@Column(name = "SEEN_TIME_END", nullable = false)
	public Date seenTimeEnd;

	@Column(name = "BOOKING_COMMENT", nullable = false)
	public String bookingComment;

	@Column(name = "BOOK_TYPE", nullable = false)
	public String bookType;

	@Column(name = "BOOK_TYPE_1", nullable = false)
	public String bookType1;

	@Column(name = "DOC_NAME", nullable = false)
	public String doctorName;

	@Column(name = "SESSION_ID", nullable = false)
	public int sessionId;

	@Column(name = "HOSP", nullable = false)
	public int hosp;

	@Column(name = "TEAM_CODE", nullable = false)
	public String teamCode;
}
