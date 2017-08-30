-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 18, 2017 at 04:42 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `umsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `academic_year`
--

CREATE TABLE `academic_year` (
  `id` bigint(20) NOT NULL,
  `academic_year` varchar(255) DEFAULT NULL,
  `start_at` datetime NOT NULL,
  `end_at` datetime NOT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `academic_year`
--

INSERT INTO `academic_year` (`id`, `academic_year`, `start_at`, `end_at`, `delete_status`, `delete_reason`, `done_by`, `done_at`) VALUES
(1, '2017-2018', '2017-07-24 00:00:00', '2017-08-15 00:00:00', 0, '', '', '2017-07-18 10:25:32');

-- --------------------------------------------------------

--
-- Table structure for table `application_type`
--

CREATE TABLE `application_type` (
  `id` bigint(20) NOT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL,
  `employee_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `application_type`
--

INSERT INTO `application_type` (`id`, `type_name`, `description`, `delete_status`, `delete_reason`, `done_by`, `done_at`, `employee_id`) VALUES
(1, 'Undergraduate', '', 0, '', '', '2017-07-17 12:42:01', 2),
(2, 'Postgraduate', '', 0, '', '', '2017-07-17 13:36:45', 2);

-- --------------------------------------------------------

--
-- Table structure for table `bank_account`
--

CREATE TABLE `bank_account` (
  `id` bigint(20) NOT NULL,
  `bank_name` varchar(255) DEFAULT NULL,
  `account_number` bigint(20) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `branchTable`
--

CREATE TABLE `branchTable` (
  `id` bigint(20) NOT NULL,
  `branch_name` varchar(255) DEFAULT NULL,
  `branch_address` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL,
  `employee_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `branchTable`
--

INSERT INTO `branchTable` (`id`, `branch_name`, `branch_address`, `delete_status`, `delete_reason`, `done_by`, `done_at`, `employee_id`) VALUES
(1, 'Nyagatare Campus', 'Nyagatare around Akagera National Park', 0, '', '', '2017-07-14 10:19:12', 1),
(2, 'Gisenyi Campus', 'GIsenyi,Near Lake Kivu', 0, '', '', '2017-07-14 10:20:16', 3);

-- --------------------------------------------------------

--
-- Table structure for table `classes`
--

CREATE TABLE `classes` (
  `id` bigint(20) NOT NULL,
  `classes_name` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL,
  `section_id` bigint(20) DEFAULT NULL,
  `department_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `classes`
--

INSERT INTO `classes` (`id`, `classes_name`, `delete_status`, `delete_reason`, `done_by`, `done_at`, `section_id`, `department_id`) VALUES
(1, 'Year 1', 0, '', '', '2017-07-14 10:28:23', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `class_section`
--

CREATE TABLE `class_section` (
  `id` bigint(20) NOT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL,
  `classes_id` bigint(20) DEFAULT NULL,
  `section_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `id` bigint(20) NOT NULL,
  `sub_course` varchar(255) DEFAULT NULL,
  `course_code` bigint(20) DEFAULT NULL,
  `nber_credit` bigint(20) DEFAULT NULL,
  `nber_hours` bigint(20) DEFAULT NULL,
  `max_cat` bigint(20) DEFAULT NULL,
  `max_exam` bigint(20) DEFAULT NULL,
  `total_max` bigint(20) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL,
  `classes_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `id` bigint(20) NOT NULL,
  `department_name` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL,
  `faculty_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`id`, `department_name`, `delete_status`, `delete_reason`, `done_by`, `done_at`, `faculty_id`) VALUES
(1, 'Forest', 0, '', '', '2017-07-14 10:21:54', 1);

-- --------------------------------------------------------

--
-- Table structure for table `education_background`
--

CREATE TABLE `education_background` (
  `id` bigint(20) NOT NULL,
  `school_name` varchar(255) DEFAULT NULL,
  `school_address` varchar(255) DEFAULT NULL,
  `option` varchar(255) DEFAULT NULL,
  `marks` double DEFAULT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `diploma_no` varchar(255) DEFAULT NULL,
  `end_year` varchar(255) DEFAULT NULL,
  `files_upload` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_number` bigint(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `qualification` varchar(255) DEFAULT NULL,
  `active` tinyint(1) DEFAULT '0',
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `first_name`, `last_name`, `phone_number`, `email`, `password`, `location`, `address`, `qualification`, `active`, `delete_status`, `delete_reason`, `done_by`, `done_at`) VALUES
(1, 'KATUSHABE', 'Winnie', 728407275, 'katuwin@gmail.com', '12345', 'Kanombe', 'Kicukiro Kanombe', 'A2', 1, 0, '', '', '2017-07-14 09:48:33'),
(2, 'MANZI', 'Roger', 726183049, 'hasua.mr@gmail.com', '12345', 'Kamonyi', 'Nkoto,Kamonyi', 'A2', 1, 0, '', '', '2017-07-14 09:52:32'),
(3, 'MUGISHA', 'Germain', 782499060, 'germainmugisha250@gmail.com', '12345', 'Nyamirambo', 'Nyarugenge,Nyamirambo', 'A0', 1, 0, '', '', '2017-07-14 10:00:43'),
(4, 'HAKIZIMANA', 'Dieudonne', 728074726, 'dieudo250@gmail.com', '12345', 'Murehe', 'Kamonyi,Rukoma Murehe', 'A2', 1, 0, '', '', '2017-07-14 10:02:09'),
(5, 'BIKORIMANA', 'Paterne', 725563327, 'patbiko@yahoo.com', '12345', 'Murehe', 'Kamonyi,Ngamba Karuri', 'A1', 1, 0, '', '', '2017-07-14 10:04:26');

-- --------------------------------------------------------

--
-- Table structure for table `employee_skills`
--

CREATE TABLE `employee_skills` (
  `id` bigint(20) NOT NULL,
  `skills_id` bigint(20) DEFAULT NULL,
  `employee_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `id` bigint(20) NOT NULL,
  `faculty_name` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL,
  `branch_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`id`, `faculty_name`, `delete_status`, `delete_reason`, `done_by`, `done_at`, `branch_id`) VALUES
(1, 'Tourism', 0, '', '', '2017-07-14 10:20:39', 1);

-- --------------------------------------------------------

--
-- Table structure for table `job_assignment`
--

CREATE TABLE `job_assignment` (
  `id` bigint(20) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `employee_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `job_description`
--

CREATE TABLE `job_description` (
  `id` bigint(20) NOT NULL,
  `description_title` varchar(255) DEFAULT NULL,
  `attach_description` varchar(255) DEFAULT NULL,
  `job_description_id` bigint(20) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lecture`
--

CREATE TABLE `lecture` (
  `id` bigint(20) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_number` bigint(20) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `qualification` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `id` bigint(20) NOT NULL,
  `obtained_marks` bigint(20) DEFAULT NULL,
  `semester_id` bigint(20) DEFAULT NULL,
  `course_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `id` bigint(20) NOT NULL,
  `bankslip_number` bigint(20) DEFAULT NULL,
  `bank_slip` varchar(255) DEFAULT NULL,
  `paid_amount` bigint(20) DEFAULT NULL,
  `payment_status` varchar(255) DEFAULT NULL,
  `observation` varchar(255) DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `payment_mode`
--

CREATE TABLE `payment_mode` (
  `id` bigint(20) NOT NULL,
  `installement` varchar(255) DEFAULT NULL,
  `payment_percentage` bigint(20) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `play_evolutions`
--

CREATE TABLE `play_evolutions` (
  `id` int(11) NOT NULL,
  `hash` varchar(255) NOT NULL,
  `applied_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `apply_script` text,
  `revert_script` text,
  `state` varchar(255) DEFAULT NULL,
  `last_problem` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `play_evolutions`
--

INSERT INTO `play_evolutions` (`id`, `hash`, `applied_at`, `apply_script`, `revert_script`, `state`, `last_problem`) VALUES
(1, '4cd6ebdbf1be6da6cc329d75eab46c4aa88ef419', '2017-07-14 07:30:39', 'create table academic_year (\nid                        bigint auto_increment not null,\nacademic_year             varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_academic_year primary key (id))\n;\n\ncreate table application_type (\nid                        bigint auto_increment not null,\ntype_name                 varchar(255),\ndescription               varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nemployee_id               bigint,\nconstraint pk_application_type primary key (id))\n;\n\ncreate table bank_account (\nid                        bigint auto_increment not null,\nbank_name                 varchar(255),\naccount_number            bigint,\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_bank_account primary key (id))\n;\n\ncreate table branchTable (\nid                        bigint auto_increment not null,\nbranch_name               varchar(255),\nbranch_address            varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nemployee_id               bigint,\nconstraint pk_branch primary key (id))\n;\n\ncreate table class_section (\nid                        bigint auto_increment not null,\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nclasses_id                bigint,\nsection_id                bigint,\nconstraint pk_class_section primary key (id))\n;\n\ncreate table classes (\nid                        bigint auto_increment not null,\nclasses_name              varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nsection_id                bigint,\ndepartment_id             bigint,\nconstraint pk_classes primary key (id))\n;\n\ncreate table course (\nid                        bigint auto_increment not null,\nsub_course                varchar(255),\ncourse_code               bigint,\nnber_credit               bigint,\nnber_hours                bigint,\nmax_cat                   bigint,\nmax_exam                  bigint,\ntotal_max                 bigint,\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nclasses_id                bigint,\nconstraint pk_course primary key (id))\n;\n\ncreate table department (\nid                        bigint auto_increment not null,\ndepartment_name           varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nfaculty_id                bigint,\nconstraint pk_department primary key (id))\n;\n\ncreate table education_background (\nid                        bigint auto_increment not null,\nschool_name               varchar(255),\nschool_address            varchar(255),\noption                    varchar(255),\nmarks                     double,\ngrade                     varchar(255),\ndiploma_no                varchar(255),\nend_year                  varchar(255),\nfiles_upload              varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nstudent_id                bigint,\nconstraint pk_education_background primary key (id))\n;\n\ncreate table employee (\nid                        bigint auto_increment not null,\nfirst_name                varchar(255),\nlast_name                 varchar(255),\nphone_number              bigint,\nemail                     varchar(255),\nlocation                  varchar(255),\naddress                   varchar(255),\nqualification             varchar(255),\nactive                    tinyint(1) default 0,\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_employee primary key (id))\n;\n\ncreate table employee_skills (\nid                        bigint auto_increment not null,\nskills_id                 bigint,\nemployee_id               bigint,\nconstraint pk_employee_skills primary key (id))\n;\n\ncreate table faculty (\nid                        bigint auto_increment not null,\nfaculty_name              varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nbranch_id                 bigint,\nconstraint pk_faculty primary key (id))\n;\n\ncreate table job_assignment (\nid                        bigint auto_increment not null,\nstart_time                datetime,\nend_time                  datetime,\nemployee_id               bigint,\nconstraint pk_job_assignment primary key (id))\n;\n\ncreate table job_description (\nid                        bigint auto_increment not null,\ndescription_title         varchar(255),\nattach_description        varchar(255),\njob_description_id        bigint,\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_job_description primary key (id))\n;\n\ncreate table lecture (\nid                        bigint auto_increment not null,\nfirst_name                varchar(255),\nlast_name                 varchar(255),\nphone_number              bigint,\nlocation                  varchar(255),\naddress                   varchar(255),\nqualification             varchar(255),\nemail_address             varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_lecture primary key (id))\n;\n\ncreate table marks (\nid                        bigint auto_increment not null,\nobtained_marks            bigint,\nsemester_id               bigint,\ncourse_id                 bigint,\nconstraint pk_marks primary key (id))\n;\n\ncreate table payment (\nid                        bigint auto_increment not null,\nbankslip_number           bigint,\nbank_slip                 varchar(255),\npaid_amount               bigint,\npayment_status            varchar(255),\nobservation               varchar(255),\nstudent_id                bigint,\nconstraint pk_payment primary key (id))\n;\n\ncreate table payment_mode (\nid                        bigint auto_increment not null,\ninstallement              varchar(255),\npayment_percentage        bigint,\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_payment_mode primary key (id))\n;\n\ncreate table position (\nid                        bigint auto_increment not null,\nposition_name             varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_position primary key (id))\n;\n\ncreate table section (\nid                        bigint auto_increment not null,\nsection_name              varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_section primary key (id))\n;\n\ncreate table semester (\nid                        bigint auto_increment not null,\nsemester_name             varchar(255),\nacademic_year             bigint,\nconstraint pk_semester primary key (id))\n;\n\ncreate table skills (\nid                        bigint auto_increment not null,\nskills                    varchar(255),\nskills_description        varchar(255),\nconstraint pk_skills primary key (id))\n;\n\ncreate table skills_type (\nid                        bigint auto_increment not null,\nskills_type               varchar(255),\nconstraint pk_skills_type primary key (id))\n;\n\ncreate table sponsor (\nid                        bigint auto_increment not null,\nsponsor_name              varchar(255),\nsponsor_address           varchar(255),\nsponsor_email             varchar(255),\nsponsor_phone             varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_sponsor primary key (id))\n;\n\ncreate table student (\nid                        bigint auto_increment not null,\nfirst_name                varchar(255),\nlast_name                 varchar(255),\ngender                    varchar(255),\nnationality               varchar(255),\ndob                       varchar(255),\nage                       bigint,\nphone                     varchar(255),\nemail                     varchar(255),\npassword                  varchar(255),\nrole                      varchar(255),\nfather_name               varchar(255),\nmother_name               varchar(255),\nprovince                  varchar(255),\ndistricts                 varchar(255),\nsector                    varchar(255),\ncell                      varchar(255),\naddress                   varchar(255),\nphoto                     varchar(255),\nactive                    tinyint(1) default 0,\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_student primary key (id))\n;\n\ncreate table student_application (\nid                        bigint auto_increment not null,\nregistrar_status          varchar(255),\nregistrar_comments        varchar(255),\nh_od_status               varchar(255),\nho_dcomments              varchar(255),\nfn_status                 varchar(255),\nfn_comments               varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nstudent_id                bigint,\nclasses_id                bigint,\nacademic_year_id          bigint,\napplication_type_id       bigint,\nconstraint pk_student_application primary key (id))\n;\n\ncreate table student_sponsor (\nid                        bigint auto_increment not null,\nattach_file               varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nstudent_id                bigint,\nsponsor_id                bigint,\nconstraint pk_student_sponsor primary key (id))\n;\n\ncreate table teach (\nid                        bigint auto_increment not null,\nstart_time                datetime,\nend_time                  datetime,\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nlecture_id                bigint,\ncourse_id                 bigint,\nconstraint pk_teach primary key (id))\n;\n\ncreate table test (\nid                        bigint auto_increment not null,\nname                      varchar(255),\npwd                       varchar(255),\nphone                     bigint,\nemail                     varchar(255),\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_test primary key (id))\n;\n\ncreate table user (\nid                        bigint auto_increment not null,\nfirst_name                varchar(255),\nlast_name                 varchar(255),\nrole                      varchar(255),\nphone                     varchar(255),\nemail                     varchar(255),\nphoto                     varchar(255),\nusername                  varchar(255),\npassword                  varchar(255),\nactive                    tinyint(1) default 0,\ndelete_status             tinyint(1) default 0,\ndelete_reason             varchar(255),\ndone_by                   varchar(255),\ndone_at                   datetime,\nconstraint pk_user primary key (id))\n;\n\nalter table application_type add constraint fk_application_type_employee_1 foreign key (employee_id) references employee (id) on delete restrict on update restrict;\ncreate index ix_application_type_employee_1 on application_type (employee_id);\nalter table branchTable add constraint fk_branch_employee_2 foreign key (employee_id) references employee (id) on delete restrict on update restrict;\ncreate index ix_branch_employee_2 on branchTable (employee_id);\nalter table class_section add constraint fk_class_section_classes_3 foreign key (classes_id) references classes (id) on delete restrict on update restrict;\ncreate index ix_class_section_classes_3 on class_section (classes_id);\nalter table class_section add constraint fk_class_section_section_4 foreign key (section_id) references section (id) on delete restrict on update restrict;\ncreate index ix_class_section_section_4 on class_section (section_id);\nalter table classes add constraint fk_classes_section_5 foreign key (section_id) references section (id) on delete restrict on update restrict;\ncreate index ix_classes_section_5 on classes (section_id);\nalter table classes add constraint fk_classes_department_6 foreign key (department_id) references department (id) on delete restrict on update restrict;\ncreate index ix_classes_department_6 on classes (department_id);\nalter table course add constraint fk_course_classes_7 foreign key (classes_id) references classes (id) on delete restrict on update restrict;\ncreate index ix_course_classes_7 on course (classes_id);\nalter table department add constraint fk_department_faculty_8 foreign key (faculty_id) references faculty (id) on delete restrict on update restrict;\ncreate index ix_department_faculty_8 on department (faculty_id);\nalter table education_background add constraint fk_education_background_student_9 foreign key (student_id) references student (id) on delete restrict on update restrict;\ncreate index ix_education_background_student_9 on education_background (student_id);\nalter table employee_skills add constraint fk_employee_skills_skills_10 foreign key (skills_id) references skills (id) on delete restrict on update restrict;\ncreate index ix_employee_skills_skills_10 on employee_skills (skills_id);\nalter table employee_skills add constraint fk_employee_skills_employee_11 foreign key (employee_id) references employee (id) on delete restrict on update restrict;\ncreate index ix_employee_skills_employee_11 on employee_skills (employee_id);\nalter table faculty add constraint fk_faculty_branch_12 foreign key (branch_id) references branchTable (id) on delete restrict on update restrict;\ncreate index ix_faculty_branch_12 on faculty (branch_id);\nalter table job_assignment add constraint fk_job_assignment_employee_13 foreign key (employee_id) references employee (id) on delete restrict on update restrict;\ncreate index ix_job_assignment_employee_13 on job_assignment (employee_id);\nalter table job_description add constraint fk_job_description_JobDescription_14 foreign key (job_description_id) references job_description (id) on delete restrict on update restrict;\ncreate index ix_job_description_JobDescription_14 on job_description (job_description_id);\nalter table marks add constraint fk_marks_semester_15 foreign key (semester_id) references semester (id) on delete restrict on update restrict;\ncreate index ix_marks_semester_15 on marks (semester_id);\nalter table marks add constraint fk_marks_course_16 foreign key (course_id) references course (id) on delete restrict on update restrict;\ncreate index ix_marks_course_16 on marks (course_id);\nalter table payment add constraint fk_payment_student_17 foreign key (student_id) references student (id) on delete restrict on update restrict;\ncreate index ix_payment_student_17 on payment (student_id);\nalter table student_application add constraint fk_student_application_student_18 foreign key (student_id) references student (id) on delete restrict on update restrict;\ncreate index ix_student_application_student_18 on student_application (student_id);\nalter table student_application add constraint fk_student_application_classes_19 foreign key (classes_id) references classes (id) on delete restrict on update restrict;\ncreate index ix_student_application_classes_19 on student_application (classes_id);\nalter table student_application add constraint fk_student_application_academicYear_20 foreign key (academic_year_id) references academic_year (id) on delete restrict on update restrict;\ncreate index ix_student_application_academicYear_20 on student_application (academic_year_id);\nalter table student_application add constraint fk_student_application_applicationType_21 foreign key (application_type_id) references application_type (id) on delete restrict on update restrict;\ncreate index ix_student_application_applicationType_21 on student_application (application_type_id);\nalter table student_sponsor add constraint fk_student_sponsor_student_22 foreign key (student_id) references student (id) on delete restrict on update restrict;\ncreate index ix_student_sponsor_student_22 on student_sponsor (student_id);\nalter table student_sponsor add constraint fk_student_sponsor_sponsor_23 foreign key (sponsor_id) references sponsor (id) on delete restrict on update restrict;\ncreate index ix_student_sponsor_sponsor_23 on student_sponsor (sponsor_id);\nalter table teach add constraint fk_teach_lecture_24 foreign key (lecture_id) references lecture (id) on delete restrict on update restrict;\ncreate index ix_teach_lecture_24 on teach (lecture_id);\nalter table teach add constraint fk_teach_course_25 foreign key (course_id) references course (id) on delete restrict on update restrict;\ncreate index ix_teach_course_25 on teach (course_id);', 'SET FOREIGN_KEY_CHECKS=0;\n\ndrop table academic_year;\n\ndrop table application_type;\n\ndrop table bank_account;\n\ndrop table branchTable;\n\ndrop table class_section;\n\ndrop table classes;\n\ndrop table course;\n\ndrop table department;\n\ndrop table education_background;\n\ndrop table employee;\n\ndrop table employee_skills;\n\ndrop table faculty;\n\ndrop table job_assignment;\n\ndrop table job_description;\n\ndrop table lecture;\n\ndrop table marks;\n\ndrop table payment;\n\ndrop table payment_mode;\n\ndrop table position;\n\ndrop table section;\n\ndrop table semester;\n\ndrop table skills;\n\ndrop table skills_type;\n\ndrop table sponsor;\n\ndrop table student;\n\ndrop table student_application;\n\ndrop table student_sponsor;\n\ndrop table teach;\n\ndrop table test;\n\ndrop table user;\n\nSET FOREIGN_KEY_CHECKS=1;', 'applied', '');

-- --------------------------------------------------------

--
-- Table structure for table `position`
--

CREATE TABLE `position` (
  `id` bigint(20) NOT NULL,
  `position_name` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `section`
--

CREATE TABLE `section` (
  `id` bigint(20) NOT NULL,
  `section_name` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `section`
--

INSERT INTO `section` (`id`, `section_name`, `delete_status`, `delete_reason`, `done_by`, `done_at`) VALUES
(1, 'Day', 0, '', '', '2017-07-14 10:22:09'),
(2, 'Evening', 0, '', '', '2017-07-15 14:03:31');

-- --------------------------------------------------------

--
-- Table structure for table `semester`
--

CREATE TABLE `semester` (
  `id` bigint(20) NOT NULL,
  `semester_name` varchar(255) DEFAULT NULL,
  `academic_year` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `skills`
--

CREATE TABLE `skills` (
  `id` bigint(20) NOT NULL,
  `skills` varchar(255) DEFAULT NULL,
  `skills_description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `skills_type`
--

CREATE TABLE `skills_type` (
  `id` bigint(20) NOT NULL,
  `skills_type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sponsor`
--

CREATE TABLE `sponsor` (
  `id` bigint(20) NOT NULL,
  `sponsor_name` varchar(255) DEFAULT NULL,
  `sponsor_address` varchar(255) DEFAULT NULL,
  `sponsor_email` varchar(255) DEFAULT NULL,
  `sponsor_phone` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sponsor`
--

INSERT INTO `sponsor` (`id`, `sponsor_name`, `sponsor_address`, `sponsor_email`, `sponsor_phone`, `delete_status`, `delete_reason`, `done_by`, `done_at`) VALUES
(1, 'FARG', 'KG 11 Ave, Kigali', 'farg@info.rw', '0780000001', 0, '', '', '2017-07-14 10:30:00');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` bigint(20) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `nationality` varchar(255) DEFAULT NULL,
  `dob` varchar(255) DEFAULT NULL,
  `age` bigint(20) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `father_name` varchar(255) DEFAULT NULL,
  `mother_name` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `districts` varchar(255) DEFAULT NULL,
  `sector` varchar(255) DEFAULT NULL,
  `cell` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `active` tinyint(1) DEFAULT '0',
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `first_name`, `last_name`, `gender`, `nationality`, `dob`, `age`, `phone`, `email`, `password`, `role`, `father_name`, `mother_name`, `province`, `districts`, `sector`, `cell`, `address`, `photo`, `active`, `delete_status`, `delete_reason`, `done_by`, `done_at`) VALUES
(1, 'Kwizera', 'Eric', '', '', '', 0, '', 'kwizeraemile250@gmail.com', '12345', 'STUDENT', '', '', '', '', '', '', '', '', 1, 0, '', '', '2017-07-14 11:18:46'),
(2, 'Kwizera', 'Emile', '', '', '', 0, '', 'kwizeraemile@gmail.com', '12345', 'STUDENT', '', '', '', '', '', '', '', '', 1, 0, '', '', '2017-07-14 11:20:33'),
(3, 'HAVUGIMANA', 'Emmanuel', '', '', '', 0, '', 'havemmy@yahoo.fr', '12345', 'STUDENT', '', '', '', '', '', '', '', '', 1, 0, '', '', '2017-07-14 11:23:28');

-- --------------------------------------------------------

--
-- Table structure for table `student_application`
--

CREATE TABLE `student_application` (
  `id` bigint(20) NOT NULL,
  `registrar_status` varchar(255) DEFAULT NULL,
  `registrar_comments` varchar(255) DEFAULT NULL,
  `h_od_status` varchar(255) DEFAULT NULL,
  `ho_dcomments` varchar(255) DEFAULT NULL,
  `fn_status` varchar(255) DEFAULT NULL,
  `fn_comments` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL,
  `classes_id` bigint(20) DEFAULT NULL,
  `academic_year_id` bigint(20) DEFAULT NULL,
  `application_type_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student_sponsor`
--

CREATE TABLE `student_sponsor` (
  `id` bigint(20) NOT NULL,
  `attach_file` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL,
  `sponsor_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teach`
--

CREATE TABLE `teach` (
  `id` bigint(20) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL,
  `lecture_id` bigint(20) DEFAULT NULL,
  `course_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `phone` bigint(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `active` tinyint(1) DEFAULT '0',
  `delete_status` tinyint(1) DEFAULT '0',
  `delete_reason` varchar(255) DEFAULT NULL,
  `done_by` varchar(255) DEFAULT NULL,
  `done_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `first_name`, `last_name`, `role`, `phone`, `email`, `photo`, `username`, `password`, `active`, `delete_status`, `delete_reason`, `done_by`, `done_at`) VALUES
(1, 'roger', 'roger', 'admin', '07883021245', 'roger@gmail.com', '', 'admin', 'admin', 1, 0, '', 'default', '2017-07-14 11:06:15');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `academic_year`
--
ALTER TABLE `academic_year`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `application_type`
--
ALTER TABLE `application_type`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_application_type_employee_1` (`employee_id`);

--
-- Indexes for table `bank_account`
--
ALTER TABLE `bank_account`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `branchTable`
--
ALTER TABLE `branchTable`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_branch_employee_2` (`employee_id`);

--
-- Indexes for table `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_classes_section_5` (`section_id`),
  ADD KEY `ix_classes_department_6` (`department_id`);

--
-- Indexes for table `class_section`
--
ALTER TABLE `class_section`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_class_section_classes_3` (`classes_id`),
  ADD KEY `ix_class_section_section_4` (`section_id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_course_classes_7` (`classes_id`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_department_faculty_8` (`faculty_id`);

--
-- Indexes for table `education_background`
--
ALTER TABLE `education_background`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_education_background_student_9` (`student_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee_skills`
--
ALTER TABLE `employee_skills`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_employee_skills_skills_10` (`skills_id`),
  ADD KEY `ix_employee_skills_employee_11` (`employee_id`);

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_faculty_branch_12` (`branch_id`);

--
-- Indexes for table `job_assignment`
--
ALTER TABLE `job_assignment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_job_assignment_employee_13` (`employee_id`);

--
-- Indexes for table `job_description`
--
ALTER TABLE `job_description`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_job_description_JobDescription_14` (`job_description_id`);

--
-- Indexes for table `lecture`
--
ALTER TABLE `lecture`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `marks`
--
ALTER TABLE `marks`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_marks_semester_15` (`semester_id`),
  ADD KEY `ix_marks_course_16` (`course_id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_payment_student_17` (`student_id`);

--
-- Indexes for table `payment_mode`
--
ALTER TABLE `payment_mode`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `play_evolutions`
--
ALTER TABLE `play_evolutions`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `position`
--
ALTER TABLE `position`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `section`
--
ALTER TABLE `section`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `semester`
--
ALTER TABLE `semester`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `skills`
--
ALTER TABLE `skills`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `skills_type`
--
ALTER TABLE `skills_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sponsor`
--
ALTER TABLE `sponsor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student_application`
--
ALTER TABLE `student_application`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_student_application_student_18` (`student_id`),
  ADD KEY `ix_student_application_classes_19` (`classes_id`),
  ADD KEY `ix_student_application_academicYear_20` (`academic_year_id`),
  ADD KEY `ix_student_application_applicationType_21` (`application_type_id`);

--
-- Indexes for table `student_sponsor`
--
ALTER TABLE `student_sponsor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_student_sponsor_student_22` (`student_id`),
  ADD KEY `ix_student_sponsor_sponsor_23` (`sponsor_id`);

--
-- Indexes for table `teach`
--
ALTER TABLE `teach`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_teach_lecture_24` (`lecture_id`),
  ADD KEY `ix_teach_course_25` (`course_id`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `academic_year`
--
ALTER TABLE `academic_year`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `application_type`
--
ALTER TABLE `application_type`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `bank_account`
--
ALTER TABLE `bank_account`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `branchTable`
--
ALTER TABLE `branchTable`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `classes`
--
ALTER TABLE `classes`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `class_section`
--
ALTER TABLE `class_section`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `education_background`
--
ALTER TABLE `education_background`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `employee_skills`
--
ALTER TABLE `employee_skills`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `faculty`
--
ALTER TABLE `faculty`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `job_assignment`
--
ALTER TABLE `job_assignment`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `job_description`
--
ALTER TABLE `job_description`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `lecture`
--
ALTER TABLE `lecture`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `marks`
--
ALTER TABLE `marks`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `payment_mode`
--
ALTER TABLE `payment_mode`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `position`
--
ALTER TABLE `position`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `section`
--
ALTER TABLE `section`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `semester`
--
ALTER TABLE `semester`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `skills`
--
ALTER TABLE `skills`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `skills_type`
--
ALTER TABLE `skills_type`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `sponsor`
--
ALTER TABLE `sponsor`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `student_application`
--
ALTER TABLE `student_application`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `student_sponsor`
--
ALTER TABLE `student_sponsor`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `teach`
--
ALTER TABLE `teach`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `test`
--
ALTER TABLE `test`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `application_type`
--
ALTER TABLE `application_type`
  ADD CONSTRAINT `fk_application_type_employee_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`);

--
-- Constraints for table `branchTable`
--
ALTER TABLE `branchTable`
  ADD CONSTRAINT `fk_branch_employee_2` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`);

--
-- Constraints for table `classes`
--
ALTER TABLE `classes`
  ADD CONSTRAINT `fk_classes_department_6` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`),
  ADD CONSTRAINT `fk_classes_section_5` FOREIGN KEY (`section_id`) REFERENCES `section` (`id`);

--
-- Constraints for table `class_section`
--
ALTER TABLE `class_section`
  ADD CONSTRAINT `fk_class_section_classes_3` FOREIGN KEY (`classes_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_class_section_section_4` FOREIGN KEY (`section_id`) REFERENCES `section` (`id`);

--
-- Constraints for table `course`
--
ALTER TABLE `course`
  ADD CONSTRAINT `fk_course_classes_7` FOREIGN KEY (`classes_id`) REFERENCES `classes` (`id`);

--
-- Constraints for table `department`
--
ALTER TABLE `department`
  ADD CONSTRAINT `fk_department_faculty_8` FOREIGN KEY (`faculty_id`) REFERENCES `faculty` (`id`);

--
-- Constraints for table `education_background`
--
ALTER TABLE `education_background`
  ADD CONSTRAINT `fk_education_background_student_9` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`);

--
-- Constraints for table `employee_skills`
--
ALTER TABLE `employee_skills`
  ADD CONSTRAINT `fk_employee_skills_employee_11` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`),
  ADD CONSTRAINT `fk_employee_skills_skills_10` FOREIGN KEY (`skills_id`) REFERENCES `skills` (`id`);

--
-- Constraints for table `faculty`
--
ALTER TABLE `faculty`
  ADD CONSTRAINT `fk_faculty_branch_12` FOREIGN KEY (`branch_id`) REFERENCES `branchTable` (`id`);

--
-- Constraints for table `job_assignment`
--
ALTER TABLE `job_assignment`
  ADD CONSTRAINT `fk_job_assignment_employee_13` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`);

--
-- Constraints for table `job_description`
--
ALTER TABLE `job_description`
  ADD CONSTRAINT `fk_job_description_JobDescription_14` FOREIGN KEY (`job_description_id`) REFERENCES `job_description` (`id`);

--
-- Constraints for table `marks`
--
ALTER TABLE `marks`
  ADD CONSTRAINT `fk_marks_course_16` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`),
  ADD CONSTRAINT `fk_marks_semester_15` FOREIGN KEY (`semester_id`) REFERENCES `semester` (`id`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `fk_payment_student_17` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`);

--
-- Constraints for table `student_application`
--
ALTER TABLE `student_application`
  ADD CONSTRAINT `fk_student_application_academicYear_20` FOREIGN KEY (`academic_year_id`) REFERENCES `academic_year` (`id`),
  ADD CONSTRAINT `fk_student_application_applicationType_21` FOREIGN KEY (`application_type_id`) REFERENCES `application_type` (`id`),
  ADD CONSTRAINT `fk_student_application_classes_19` FOREIGN KEY (`classes_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_student_application_student_18` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`);

--
-- Constraints for table `student_sponsor`
--
ALTER TABLE `student_sponsor`
  ADD CONSTRAINT `fk_student_sponsor_sponsor_23` FOREIGN KEY (`sponsor_id`) REFERENCES `sponsor` (`id`),
  ADD CONSTRAINT `fk_student_sponsor_student_22` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`);

--
-- Constraints for table `teach`
--
ALTER TABLE `teach`
  ADD CONSTRAINT `fk_teach_course_25` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`),
  ADD CONSTRAINT `fk_teach_lecture_24` FOREIGN KEY (`lecture_id`) REFERENCES `lecture` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
