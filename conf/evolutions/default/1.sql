# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table academic_year (
  id                        bigint auto_increment not null,
  academic_year             varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  constraint pk_academic_year primary key (id))
;

create table application_type (
  id                        bigint auto_increment not null,
  type_name                 varchar(255),
  description               varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  employee_id               bigint,
  constraint pk_application_type primary key (id))
;

create table bank_account (
  id                        bigint auto_increment not null,
  bank_name                 varchar(255),
  account_number            bigint,
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  constraint pk_bank_account primary key (id))
;

create table branch (
  id                        bigint auto_increment not null,
  branch_name               varchar(255),
  branch_address            varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  employee_id               bigint,
  constraint pk_branch primary key (id))
;

create table class_section (
  id                        bigint auto_increment not null,
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  classes_id                bigint,
  section_id                bigint,
  constraint pk_class_section primary key (id))
;

create table classes (
  id                        bigint auto_increment not null,
  classes_name              varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  section_id                bigint,
  constraint pk_classes primary key (id))
;

create table course (
  id                        bigint auto_increment not null,
  sub_course                varchar(255),
  course_code               bigint,
  nber_credit               bigint,
  nber_hours                bigint,
  max_cat                   bigint,
  max_exam                  bigint,
  total_max                 bigint,
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  classes_id                bigint,
  constraint pk_course primary key (id))
;

create table department (
  id                        bigint auto_increment not null,
  department_name           varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  faculty_id                bigint,
  constraint pk_department primary key (id))
;

create table education_background (
  id                        bigint auto_increment not null,
  school_name               varchar(255),
  school_address            varchar(255),
  option                    varchar(255),
  marks                     double,
  grade                     varchar(255),
  diploma_no                varchar(255),
  end_year                  varchar(255),
  files_upload              varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  student_id                bigint,
  constraint pk_education_background primary key (id))
;

create table employee (
  id                        bigint auto_increment not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  phone_number              bigint,
  email                     varchar(255),
  location                  varchar(255),
  address                   varchar(255),
  qualification             varchar(255),
  active                    tinyint(1) default 0,
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  constraint pk_employee primary key (id))
;

create table employee_skills (
  id                        bigint auto_increment not null,
  skills_id                 bigint,
  employee_id               bigint,
  constraint pk_employee_skills primary key (id))
;

create table faculty (
  id                        bigint auto_increment not null,
  faculty_name              varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  branch_id                 bigint,
  constraint pk_faculty primary key (id))
;

create table job_assignment (
  id                        bigint auto_increment not null,
  start_time                datetime,
  end_time                  datetime,
  employee_id               bigint,
  constraint pk_job_assignment primary key (id))
;

create table job_description (
  id                        bigint auto_increment not null,
  description_title         varchar(255),
  attach_description        varchar(255),
  job_description_id        bigint,
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  constraint pk_job_description primary key (id))
;

create table lecture (
  id                        bigint auto_increment not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  phone_number              bigint,
  location                  varchar(255),
  address                   varchar(255),
  qualification             varchar(255),
  email_address             varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  constraint pk_lecture primary key (id))
;

create table marks (
  id                        bigint auto_increment not null,
  obtained_marks            bigint,
  semester_id               bigint,
  course_id                 bigint,
  constraint pk_marks primary key (id))
;

create table payment (
  id                        bigint auto_increment not null,
  bankslip_number           bigint,
  bank_slip                 varchar(255),
  paid_amount               bigint,
  payment_status            varchar(255),
  observation               varchar(255),
  student_id                bigint,
  constraint pk_payment primary key (id))
;

create table payment_mode (
  id                        bigint auto_increment not null,
  installement              varchar(255),
  payment_percentage        bigint,
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  constraint pk_payment_mode primary key (id))
;

create table position (
  id                        bigint auto_increment not null,
  position_name             varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  constraint pk_position primary key (id))
;

create table section (
  id                        bigint auto_increment not null,
  section_name              varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  department_id             bigint,
  constraint pk_section primary key (id))
;

create table semester (
  id                        bigint auto_increment not null,
  semester_name             varchar(255),
  academic_year             bigint,
  constraint pk_semester primary key (id))
;

create table skills (
  id                        bigint auto_increment not null,
  skills                    varchar(255),
  skills_description        varchar(255),
  constraint pk_skills primary key (id))
;

create table skills_type (
  id                        bigint auto_increment not null,
  skills_type               varchar(255),
  constraint pk_skills_type primary key (id))
;

create table sponsor (
  id                        bigint auto_increment not null,
  sponsor_name              varchar(255),
  sponsor_address           varchar(255),
  sponsor_email             varchar(255),
  sponsor_phone             varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  constraint pk_sponsor primary key (id))
;

create table student (
  id                        bigint auto_increment not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  gender                    varchar(255),
  nationality               varchar(255),
  dob                       varchar(255),
  age                       bigint,
  phone                     varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  role                      varchar(255),
  fathert_name              varchar(255),
  mother_name               varchar(255),
  province                  varchar(255),
  districts                 varchar(255),
  sector                    varchar(255),
  cell                      varchar(255),
  address                   varchar(255),
  photo                     varchar(255),
  active                    tinyint(1) default 0,
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  constraint pk_student primary key (id))
;

create table student_application (
  id                        bigint auto_increment not null,
  registrar_status          varchar(255),
  registrar_comments        varchar(255),
  h_od_status               varchar(255),
  ho_dcomments              varchar(255),
  fn_status                 varchar(255),
  fn_comments               varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  student_id                bigint,
  classes_id                bigint,
  academic_year_id          bigint,
  application_type_id       bigint,
  constraint pk_student_application primary key (id))
;

create table student_sponsor (
  id                        bigint auto_increment not null,
  attach_file               varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  student_id                bigint,
  sponsor_id                bigint,
  constraint pk_student_sponsor primary key (id))
;

create table teach (
  id                        bigint auto_increment not null,
  start_time                datetime,
  end_time                  datetime,
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  lecture_id                bigint,
  course_id                 bigint,
  constraint pk_teach primary key (id))
;

create table test (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  pwd                       varchar(255),
  phone                     varchar(255),
  email                     varchar(255),
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  constraint pk_test primary key (id))
;

create table user (
  id                        bigint auto_increment not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  role                      varchar(255),
  phone                     varchar(255),
  email                     varchar(255),
  photo                     varchar(255),
  username                  varchar(255),
  password                  varchar(255),
  active                    tinyint(1) default 0,
  delete_status             tinyint(1) default 0,
  delete_reason             varchar(255),
  done_by                   varchar(255),
  done_at                   datetime,
  constraint pk_user primary key (id))
;

alter table application_type add constraint fk_application_type_employee_1 foreign key (employee_id) references employee (id) on delete restrict on update restrict;
create index ix_application_type_employee_1 on application_type (employee_id);
alter table branch add constraint fk_branch_employee_2 foreign key (employee_id) references employee (id) on delete restrict on update restrict;
create index ix_branch_employee_2 on branch (employee_id);
alter table class_section add constraint fk_class_section_classes_3 foreign key (classes_id) references classes (id) on delete restrict on update restrict;
create index ix_class_section_classes_3 on class_section (classes_id);
alter table class_section add constraint fk_class_section_section_4 foreign key (section_id) references section (id) on delete restrict on update restrict;
create index ix_class_section_section_4 on class_section (section_id);
alter table classes add constraint fk_classes_section_5 foreign key (section_id) references section (id) on delete restrict on update restrict;
create index ix_classes_section_5 on classes (section_id);
alter table course add constraint fk_course_classes_6 foreign key (classes_id) references classes (id) on delete restrict on update restrict;
create index ix_course_classes_6 on course (classes_id);
alter table department add constraint fk_department_faculty_7 foreign key (faculty_id) references faculty (id) on delete restrict on update restrict;
create index ix_department_faculty_7 on department (faculty_id);
alter table education_background add constraint fk_education_background_student_8 foreign key (student_id) references student (id) on delete restrict on update restrict;
create index ix_education_background_student_8 on education_background (student_id);
alter table employee_skills add constraint fk_employee_skills_skills_9 foreign key (skills_id) references skills (id) on delete restrict on update restrict;
create index ix_employee_skills_skills_9 on employee_skills (skills_id);
alter table employee_skills add constraint fk_employee_skills_employee_10 foreign key (employee_id) references employee (id) on delete restrict on update restrict;
create index ix_employee_skills_employee_10 on employee_skills (employee_id);
alter table faculty add constraint fk_faculty_branch_11 foreign key (branch_id) references branch (id) on delete restrict on update restrict;
create index ix_faculty_branch_11 on faculty (branch_id);
alter table job_assignment add constraint fk_job_assignment_employee_12 foreign key (employee_id) references employee (id) on delete restrict on update restrict;
create index ix_job_assignment_employee_12 on job_assignment (employee_id);
alter table job_description add constraint fk_job_description_JobDescription_13 foreign key (job_description_id) references job_description (id) on delete restrict on update restrict;
create index ix_job_description_JobDescription_13 on job_description (job_description_id);
alter table marks add constraint fk_marks_semester_14 foreign key (semester_id) references semester (id) on delete restrict on update restrict;
create index ix_marks_semester_14 on marks (semester_id);
alter table marks add constraint fk_marks_course_15 foreign key (course_id) references course (id) on delete restrict on update restrict;
create index ix_marks_course_15 on marks (course_id);
alter table payment add constraint fk_payment_student_16 foreign key (student_id) references student (id) on delete restrict on update restrict;
create index ix_payment_student_16 on payment (student_id);
alter table section add constraint fk_section_department_17 foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_section_department_17 on section (department_id);
alter table student_application add constraint fk_student_application_student_18 foreign key (student_id) references student (id) on delete restrict on update restrict;
create index ix_student_application_student_18 on student_application (student_id);
alter table student_application add constraint fk_student_application_classes_19 foreign key (classes_id) references classes (id) on delete restrict on update restrict;
create index ix_student_application_classes_19 on student_application (classes_id);
alter table student_application add constraint fk_student_application_academicYear_20 foreign key (academic_year_id) references academic_year (id) on delete restrict on update restrict;
create index ix_student_application_academicYear_20 on student_application (academic_year_id);
alter table student_application add constraint fk_student_application_applicationType_21 foreign key (application_type_id) references application_type (id) on delete restrict on update restrict;
create index ix_student_application_applicationType_21 on student_application (application_type_id);
alter table student_sponsor add constraint fk_student_sponsor_student_22 foreign key (student_id) references student (id) on delete restrict on update restrict;
create index ix_student_sponsor_student_22 on student_sponsor (student_id);
alter table student_sponsor add constraint fk_student_sponsor_sponsor_23 foreign key (sponsor_id) references sponsor (id) on delete restrict on update restrict;
create index ix_student_sponsor_sponsor_23 on student_sponsor (sponsor_id);
alter table teach add constraint fk_teach_lecture_24 foreign key (lecture_id) references lecture (id) on delete restrict on update restrict;
create index ix_teach_lecture_24 on teach (lecture_id);
alter table teach add constraint fk_teach_course_25 foreign key (course_id) references course (id) on delete restrict on update restrict;
create index ix_teach_course_25 on teach (course_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table academic_year;

drop table application_type;

drop table bank_account;

drop table branch;

drop table class_section;

drop table classes;

drop table course;

drop table department;

drop table education_background;

drop table employee;

drop table employee_skills;

drop table faculty;

drop table job_assignment;

drop table job_description;

drop table lecture;

drop table marks;

drop table payment;

drop table payment_mode;

drop table position;

drop table section;

drop table semester;

drop table skills;

drop table skills_type;

drop table sponsor;

drop table student;

drop table student_application;

drop table student_sponsor;

drop table teach;

drop table test;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

