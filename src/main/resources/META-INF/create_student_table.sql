CREATE DATABASE IF NOT EXISTS helixlab_jpa;

CREATE  TABLE student (
student_id INT NOT NULL ,
student_name VARCHAR(45) NOT NULL ,
student_age INT NOT NULL ,
PRIMARY KEY (student_id) );