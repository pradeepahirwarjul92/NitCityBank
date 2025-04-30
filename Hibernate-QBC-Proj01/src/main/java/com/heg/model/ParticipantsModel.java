package com.heg.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "LND_TRAINING_DETAILS_BKP1")
public class ParticipantsModel {

	@Id
	private Long sch_id;
	private Long assesor_trainer;
	private Long trainer2empno;
	private Long trainer3empno;
	private Long hr_ir_representative;

	private Double trduration;
	private Long upload_by;
	private Integer tcat;
	private Integer ttyp;
	private Integer trainer2deptno;
	private Integer trainer3deptno;
	private Integer no_of_member;

	private Date sch_fdate;
	private Date sch_tdate;
	private Date upload_date;
	private Date act_fdate;
	private Date act_tdate;

	private String trainer_dept;
	private String hr_type;
	private String mode_training;
	private String trainer2name;
	private String trainer3name;
	private String extrnl_name;
	private String mis_file;
	private String content_file;
	private String feedback_stat;
	private String status;
	private String training_type;
	private String training_mode;
	private String venue;
	private String training_title;
	private String shop_name;
	private String trainer_name;

	
	
	public ParticipantsModel(Long sch_id, Long assesor_trainer, Long trainer2empno, Long trainer3empno,
			Long hr_ir_representative, Double trduration, Long upload_by, Integer tcat, Integer ttyp,
			Integer trainer2deptno, Integer trainer3deptno, Integer no_of_member, Date sch_fdate, Date sch_tdate,
			Date upload_date, Date act_fdate, Date act_tdate, String trainer_dept, String hr_type, String mode_training,
			String trainer2name, String trainer3name, String extrnl_name, String mis_file, String content_file,
			String feedback_stat, String status, String training_type, String training_mode, String venue,
			String training_title, String shop_name, String trainer_name) {
		super();
		this.sch_id = sch_id;
		this.assesor_trainer = assesor_trainer;
		this.trainer2empno = trainer2empno;
		this.trainer3empno = trainer3empno;
		this.hr_ir_representative = hr_ir_representative;
		this.trduration = trduration;
		this.upload_by = upload_by;
		this.tcat = tcat;
		this.ttyp = ttyp;
		this.trainer2deptno = trainer2deptno;
		this.trainer3deptno = trainer3deptno;
		this.no_of_member = no_of_member;
		this.sch_fdate = sch_fdate;
		this.sch_tdate = sch_tdate;
		this.upload_date = upload_date;
		this.act_fdate = act_fdate;
		this.act_tdate = act_tdate;
		this.trainer_dept = trainer_dept;
		this.hr_type = hr_type;
		this.mode_training = mode_training;
		this.trainer2name = trainer2name;
		this.trainer3name = trainer3name;
		this.extrnl_name = extrnl_name;
		this.mis_file = mis_file;
		this.content_file = content_file;
		this.feedback_stat = feedback_stat;
		this.status = status;
		this.training_type = training_type;
		this.training_mode = training_mode;
		this.venue = venue;
		this.training_title = training_title;
		this.shop_name = shop_name;
		this.trainer_name = trainer_name;
	}

	public ParticipantsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ParticipantsModel [sch_id=" + sch_id + ", assesor_trainer=" + assesor_trainer + ", trainer2empno="
				+ trainer2empno + ", trainer3empno=" + trainer3empno + ", hr_ir_representative=" + hr_ir_representative
				+ ", trduration=" + trduration + ", upload_by=" + upload_by + ", tcat=" + tcat + ", ttyp=" + ttyp
				+ ", trainer2deptno=" + trainer2deptno + ", trainer3deptno=" + trainer3deptno + ", no_of_member="
				+ no_of_member + ", sch_fdate=" + sch_fdate + ", sch_tdate=" + sch_tdate + ", upload_date="
				+ upload_date + ", act_fdate=" + act_fdate + ", act_tdate=" + act_tdate + ", trainer_dept="
				+ trainer_dept + ", hr_type=" + hr_type + ", mode_training=" + mode_training + ", trainer2name="
				+ trainer2name + ", trainer3name=" + trainer3name + ", extrnl_name=" + extrnl_name + ", mis_file="
				+ mis_file + ", content_file=" + content_file + ", feedback_stat=" + feedback_stat + ", status="
				+ status + ", training_type=" + training_type + ", training_mode=" + training_mode + ", venue=" + venue
				+ ", training_title=" + training_title + ", shop_name=" + shop_name + ", trainer_name=" + trainer_name
				+ "]";
	}

	public Long getSch_id() {
		return sch_id;
	}

	public void setSch_id(Long sch_id) {
		this.sch_id = sch_id;
	}

	public Long getAssesor_trainer() {
		return assesor_trainer;
	}

	public void setAssesor_trainer(Long assesor_trainer) {
		this.assesor_trainer = assesor_trainer;
	}

	public Long getTrainer2empno() {
		return trainer2empno;
	}

	public void setTrainer2empno(Long trainer2empno) {
		this.trainer2empno = trainer2empno;
	}

	public Long getTrainer3empno() {
		return trainer3empno;
	}

	public void setTrainer3empno(Long trainer3empno) {
		this.trainer3empno = trainer3empno;
	}

	public Long getHr_ir_representative() {
		return hr_ir_representative;
	}

	public void setHr_ir_representative(Long hr_ir_representative) {
		this.hr_ir_representative = hr_ir_representative;
	}

	public Double getTrduration() {
		return trduration;
	}

	public void setTrduration(Double trduration) {
		this.trduration = trduration;
	}

	public Long getUpload_by() {
		return upload_by;
	}

	public void setUpload_by(Long upload_by) {
		this.upload_by = upload_by;
	}

	public Integer getTcat() {
		return tcat;
	}

	public void setTcat(Integer tcat) {
		this.tcat = tcat;
	}

	public Integer getTtyp() {
		return ttyp;
	}

	public void setTtyp(Integer ttyp) {
		this.ttyp = ttyp;
	}

	public Integer getTrainer2deptno() {
		return trainer2deptno;
	}

	public void setTrainer2deptno(Integer trainer2deptno) {
		this.trainer2deptno = trainer2deptno;
	}

	public Integer getTrainer3deptno() {
		return trainer3deptno;
	}

	public void setTrainer3deptno(Integer trainer3deptno) {
		this.trainer3deptno = trainer3deptno;
	}

	public Integer getNo_of_member() {
		return no_of_member;
	}

	public void setNo_of_member(Integer no_of_member) {
		this.no_of_member = no_of_member;
	}

	public Date getSch_fdate() {
		return sch_fdate;
	}

	public void setSch_fdate(Date sch_fdate) {
		this.sch_fdate = sch_fdate;
	}

	public Date getSch_tdate() {
		return sch_tdate;
	}

	public void setSch_tdate(Date sch_tdate) {
		this.sch_tdate = sch_tdate;
	}

	public Date getUpload_date() {
		return upload_date;
	}

	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}

	public Date getAct_fdate() {
		return act_fdate;
	}

	public void setAct_fdate(Date act_fdate) {
		this.act_fdate = act_fdate;
	}

	public Date getAct_tdate() {
		return act_tdate;
	}

	public void setAct_tdate(Date act_tdate) {
		this.act_tdate = act_tdate;
	}

	public String getTrainer_dept() {
		return trainer_dept;
	}

	public void setTrainer_dept(String trainer_dept) {
		this.trainer_dept = trainer_dept;
	}

	public String getHr_type() {
		return hr_type;
	}

	public void setHr_type(String hr_type) {
		this.hr_type = hr_type;
	}

	public String getMode_training() {
		return mode_training;
	}

	public void setMode_training(String mode_training) {
		this.mode_training = mode_training;
	}

	public String getTrainer2name() {
		return trainer2name;
	}

	public void setTrainer2name(String trainer2name) {
		this.trainer2name = trainer2name;
	}

	public String getTrainer3name() {
		return trainer3name;
	}

	public void setTrainer3name(String trainer3name) {
		this.trainer3name = trainer3name;
	}

	public String getExtrnl_name() {
		return extrnl_name;
	}

	public void setExtrnl_name(String extrnl_name) {
		this.extrnl_name = extrnl_name;
	}

	public String getMis_file() {
		return mis_file;
	}

	public void setMis_file(String mis_file) {
		this.mis_file = mis_file;
	}

	public String getContent_file() {
		return content_file;
	}

	public void setContent_file(String content_file) {
		this.content_file = content_file;
	}

	public String getFeedback_stat() {
		return feedback_stat;
	}

	public void setFeedback_stat(String feedback_stat) {
		this.feedback_stat = feedback_stat;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTraining_type() {
		return training_type;
	}

	public void setTraining_type(String training_type) {
		this.training_type = training_type;
	}

	public String getTraining_mode() {
		return training_mode;
	}

	public void setTraining_mode(String training_mode) {
		this.training_mode = training_mode;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getTraining_title() {
		return training_title;
	}

	public void setTraining_title(String training_title) {
		this.training_title = training_title;
	}

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	public String getTrainer_name() {
		return trainer_name;
	}

	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}

}
