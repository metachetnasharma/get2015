Use database2;

/* SELECT commmand to display of columns of member table*/
SELECT * FROM member;

/*SELECT command to display member_id,member_name,category from table member*/
SELECT member_id,member_name,category FROM member;


/*SELECT command to display member_id,member_name,category from table member where category is F*/
SELECT member_id,member_name,category FROM member
WHERE category='F';

/*SELECT command to display various categories from table member */
SELECT DISTINCT(category) FROM member;

/*SELECT command to display member_name,category from table member in the decending order of member name*/
SELECT member_name,category FROM member ORDER BY member_name DESC;

/*SELECT command to display all the titles,their subjects and publishers*/
SELECT t.title_nm,t.subject_id,p.publisher_nm FROM title t,publishers p WHERE t.publisher_id=p.publisher_id;

/*SELECT command to display count of various categories*/
SELECT category,COUNT(*) From member GROUP BY category;

/*SELECT those members who belongs to category as to which CHETNA belongs */
SELECT m1.member_name FROM member AS m1 JOIN member AS m2 ON m1.category = m2.category WHERE m2.member_name='CHETNA';
 
 /*SELECT command to find status of return books  */
 SELECT issue_dt,member_id,b.accession_no, IF(status = 'NOT_ISSUED',return_dt,'') as book_return FROM books b, book_return br WHERE b.accession_no = br.accession_no;
