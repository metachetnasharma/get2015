USE database2;

 /*
 Alter definitions of following database2 tables to provide the default constraints
 */
ALTER TABLE book_issue
MODIFY COLUMN issue_dt TIMESTAMP not NULL DEFAULT NOW();

DELIMITER //

CREATE TRIGGER book
BEFORE INSERT ON book_issue
FOR EACH ROW 
BEGIN
SET NEW.due_dt = NOW() + INTERVAL 15 day;
END; //

DELIMITER ;

/*
 a command to remove Members table of the  database2
*/

ALTER TABLE book_issue 
DROP FOREIGN KEY book_issue_ibfk_1;

ALTER TABLE book_return 
DROP FOREIGN KEY book_return_ibfk_1;

DROP TABLE member;
select * from member;

/*
Create the member table again
*/

CREATE TABLE member(
  member_id VARCHAR(100),
  member_name VARCHAR(100),
  address1 VARCHAR(100),
  address2 VARCHAR(100),
  category VARCHAR(100),
  PRIMARY KEY(member_id)
  );
 
 ALTER TABLE book_issue
ADD FOREIGN KEY (member_id)
REFERENCES members(member_id);

ALTER TABLE book_return
ADD FOREIGN KEY (member_id)
REFERENCES members(member_id);

 /*
 Insert sample data in database2 tables by using SQL files
 */
 
  INSERT INTO member VALUES('m1','CHETNA','JHOTWARA','RAJASTHAN','XYZ');
  INSERT INTO member VALUES('m2','SUMAN','GOPALPURA','RAJASTHAN','ABC');
  INSERT INTO member VALUES('m3','ANJITA','PRATAPNAGAR','RAJASTHAN','XYZ');
  
  INSERT INTO books VALUES(101,'JAVA','2015-01-04',500.00,'ISSUED');
  INSERT INTO books VALUES(102,'C','2015-04-06',700.00,'NOT_ISSUED');
  INSERT INTO books VALUES(103,'DBMS','2015-02-14',400.00,'ISSUED');
  
  INSERT INTO title VALUES('JAVA','COMPLETE REFERENCES','OOP1','P');
  INSERT INTO title VALUES('C','LET US C','C1','bmb');
  INSERT INTO title VALUES('DBMS','DBMS','MYSQL','TMH');
  
  INSERT INTO authors VALUES('KHALID A MUGHAL','X');
  INSERT INTO authors VALUES('YASHVANT KANETKAR','Y');
  INSERT INTO authors VALUES('DIBABRATA SAHOO','Z');
  
  INSERT INTO title_author VALUES('JAVA','X');
  INSERT INTO title_author VALUES('C','Y');
  INSERT INTO title_author VALUES('DBMS','Z');
  
  INSERT INTO publishers VALUES('p','PEARSON');
  INSERT INTO publishers VALUES('bpb','BPB PUBLICATION');
  INSERT INTO publishers VALUES('TMH','THE MCGRAW HILL');
  
  INSERT INTO subjects VALUES('C1','CPIT');
  INSERT INTO subjects VALUES('OOP1','OOP');

  INSERT INTO book_issue VALUES('2015-09-08',101,'m1','2015-09-23');
  INSERT INTO book_issue VALUES('2015-09-05',102,'m2','2015-09-20');
  
  INSERT INTO book_return VALUES('2015-09-10',101,'m1','2015-09-08');
  INSERT INTO book_return VALUES('2015-09-07',102,'m2','2015-09-05');
 
    
  select * from member;
 
 INSERT INTO member VALUES('m4','NIDHI','GANDHI NAGAR','JAIPUR','F');


/*
Change value of addressLine1 column of Members table with value “EPIP, Sitapura” for the members belonging to category “F”
*/

UPDATE member set address1=' EPIP,Sitapura' where category = 'F';
 
 /*
Change value of addressLine2 column of Members table with “Jaipur”
*/

 UPDATE member set address2='Jaipur';
  ALTER TABLE book_issue
MODIFY COLUMN issue_dt TIMESTAMP not NULL DEFAULT NOW();

set foreign_key_checks = 0;
drop table title;
set foreign_key_checks = 1;
drop table title;
  
DROP TABLE SUBJECTS;
CREATE TABLE title(
title_id VARCHAR(100),
title_nm VARCHAR(100),
subject_id VARCHAR(100) References subjects(subject_id),
publisher_id VARCHAR(100),
FOREIGN KEY(publisher_id) References publishers(publisher_id),
PRIMARY KEY(title_id)
);


 /*
 Delete all the rows from Publishers table

 */
 delete from publishers;
  
 /* 
 Insert the sample data back in Publishers table using substitution variables
 */
  
  select * from title;
  select * from publishers;
  
  set @name = 'PEARSON';
  SET @ID = 'p';
  
INSERT INTO publishers VALUES(@ID, @name);


SELECT * FROM TITLE;

alter table publishers
modify publisher_id varchar(100) ;

/*
Delete those rows of Titles table belonging to Publisher with publisher_id = 1
*/
delete from title
where publisher_id= 'P';

