package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "OUTPATIENT")
public class OutPatient {
	@Id
	@Column(name = "PATID")
	public String patientId;

	@Column(name = "CLINIC_CODE", nullable = true)
	public String clinicCode;

	@Column(name = "APPT_DATE", nullable = true)
	public Date appointmentDate;

	@Column(name = "REF_REASON", nullable = true)
	public String referenceReason;

	@Column(name = "OP_BOOKINGS_ID", nullable = true)
	public int opBookingsId;

	@Column(name = "DOC_CODE", nullable = true)
	public String docCode;

	@Column(name = "APPT_TIME", nullable = true)
	public Date appointmentTime;

	@Column(name = "ARRIVE_TIME_RECEPTION", nullable = true)
	public Date arriveTimeReception;

	@Column(name = "SEEN_TIME", nullable = true)
	public Date seenTimeStart;

	@Column(name = "APPT_TYPE", nullable = true)
	public String appointmentType;

	@Column(name = "PATIENT_NAME", nullable = true)
	public String patientName;

	@Column(name = "SERVICE", nullable = true)
	public String service;

	@Column(name = "DEPARTMENT", nullable = true)
	public String department;

	@Column(name = "SEEN_TIME_END", nullable = true)
	public Date seenTimeEnd;

	@Column(name = "BOOKING_COMMENT", nullable = true)
	public String bookingComment;

	@Column(name = "BOOK_TYPE", nullable = true)
	public String bookType;

	@Column(name = "BOOK_TYPE_1", nullable = true)
	public String bookType1;

	@Column(name = "DOC_NAME", nullable = true)
	public String doctorName;

	@Column(name = "SESSION_ID", nullable = true)
	public int sessionId;

	@Column(name = "HOSP", nullable = true)
	public int hosp;

	@Column(name = "TEAM_CODE", nullable = true)
	public String teamCode;
}
