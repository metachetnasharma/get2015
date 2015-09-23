USE database2;
/*1. Create a View which can be used to display member name and
all issue details of the member using a simple SELECT command*/

CREATE VIEW view
AS
SELECT m.member_name,m.member_id,bi.accession_no,bi.issue_dt,bi.due_dt
FROM member m
INNER JOIN book_issue bi
ON
bi.member_id=m.member_id;

SELECT * FROM view;

/*2.Create a View which contains three columns, member name,
member id and full description of category, i.e., Faculty, Students
and Others instead of F,S and O*/

CREATE  VIEW full_description_of_category
AS
SELECT member_name,member_id,IF(category='F','Faculty',IF(category='S','Student',IF(category='O','Others',NULL))) AS category 
FROM member;
SELECT * FROM full_description_of_category;


/*3. Create a View which contains the information – subject name,
title, member name, category, issue date, due date and return
date. If the books have not been returned, NULL should be
displayed instead of return date*/

CREATE VIEW information
AS
SELECT s.subject_nm,t.title_nm,m.member_name,bi.issue_dt,bi.due_dt,br.return_dt
FROM member m
INNER JOIN book_issue bi
ON
bi.member_id=m.member_id
LEFT JOIN book_return br
ON
bi.member_id=br.member_id
AND
bi.accession_no=br.accession_no
INNER JOIN books b
ON
b.accession_no=bi.accession_no
INNER JOIN title t
ON
t.title_id=b.title_id
INNER JOIN subjects s
ON
s.subject_id=t.subject_id;

SELECT * FROM information;



