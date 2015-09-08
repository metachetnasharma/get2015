CREATE DATABASE database2;
USE database2;

/*
Create all tables of Library as described and mentioned in Slides
*/

CREATE TABLE member(
  member_id VARCHAR(100),
  member_name VARCHAR(100),
  address1 VARCHAR(100),
  address2 VARCHAR(100),
  category VARCHAR(100),
  PRIMARY KEY(member_id)
  );
  
CREATE TABLE books(
accession_no INT,
title_id VARCHAR(100),
purchase_dt DATE,
price DOUBLE,
status VARCHAR(100),
 PRIMARY KEY(accession_no)
);

CREATE TABLE title(
title_id VARCHAR(100),
title_nm VARCHAR(100),
subject_id VARCHAR(100),
publisher_id VARCHAR(100),
PRIMARY KEY(title_id)
);

CREATE TABLE authors(
author_nm VARCHAR(100),
author_id VARCHAR(100),
PRIMARY KEY(author_id)
);

CREATE TABLE title_author(
title_id VARCHAR(100),
author_id VARCHAR(100),
PRIMARY KEY(title_id,author_id), 
  FOREIGN KEY(title_id) REFERENCES title(title_id) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY(author_id) REFERENCES authors(author_id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE publishers(
publisher_id VARCHAR(100),
publisher_nm VARCHAR(100),
PRIMARY KEY(publisher_id)
);


CREATE TABLE subjects(
subject_id VARCHAR(100),
subject_nm VARCHAR(100),
PRIMARY KEY(subject_id)
);

CREATE TABLE book_issue(
issue_dt TIMESTAMP,
accession_no INT,
member_id VARCHAR(100),
due_dt DATE,
 FOREIGN KEY(member_id) REFERENCES member(member_id) ON DELETE CASCADE ON UPDATE CASCADE,
 FOREIGN KEY(accession_no) REFERENCES books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
 PRIMARY KEY(accession_no,member_id,issue_dt)
);

CREATE TABLE book_return(
return_dt DATE,
accession_no INT,
member_id VARCHAR(100),
issue_dt DATE,
PRIMARY KEY(accession_no,member_id,issue_dt),
 FOREIGN KEY(member_id) REFERENCES member(member_id) ON DELETE CASCADE ON UPDATE CASCADE,
 FOREIGN KEY(accession_no) REFERENCES books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE
);

/*
 a command to display all the table names present in database2
 */
show tables;




