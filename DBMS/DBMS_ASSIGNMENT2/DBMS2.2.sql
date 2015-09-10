/*Modify the SELECT command written for Question 9 to display results in ascending order of issue date 
and within issue date in ascending order of members name*/
USE DATABASE2;

SELECT br.issue_dt,member_name,br.member_id,br.accession_no,
IF(b.status = 'NOT_ISSUED', return_dt,' ')  FROM books b,book_return br,member m
WHERE ((b.accession_no = br.accession_no) && (br.member_id = m.member_id))
ORDER BY issue_dt asc,member_name asc;

