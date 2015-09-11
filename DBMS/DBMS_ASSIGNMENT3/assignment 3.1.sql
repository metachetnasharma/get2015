USE database2;

/* 1.display information on books issued for more than two months*/
SELECT m.member_name,i.member_id,t.title_nm,i.accession_no,i.issue_dt,i.due_dt,(DATEDIFF(r.return_dt,r.issue_dt))/30 AS issue_for_Months
FROM book_issue AS i
INNER JOIN 
member AS m
ON
i.member_id=m.member_id
INNER JOIN
books AS b
ON
i.accession_no=b.accession_no
INNER JOIN
title AS t
ON
b.title_id=t.title_id
INNER JOIN
book_return AS r
ON 
i.accession_no=r.accession_no AND i.member_id=r.member_id
WHERE (b.status='Not Issued' AND DATEDIFF(r.return_dt,r.issue_dt)>60)
UNION
SELECT m.member_name,i.member_id,t.title_nm,i.accession_no,i.issue_dt,i.due_dt,(DATEDIFF(CURDATE(),i.issue_dt))/30 AS issue_for_Months
FROM book_issue AS i
INNER JOIN 
member AS m
ON
i.member_id=m.member_id
INNER JOIN
books AS b
ON
i.accession_no=b.accession_no
INNER JOIN
title AS t
ON
b.title_id=t.title_id
WHERE (b.status='Issued' AND DATEDIFF(CURDATE(),i.issue_dt)>60);


/*2. to display rows from member table having maximum length*/
SELECT member_name, LENGTH(member_name) AS max_length
FROM member 
WHERE LENGTH(member_name)= (SELECT MAX(LENGTH(member_name))
FROM member);

/*3.to display count of number of books issued*/
SELECT COUNT(accession_no) AS total_issued_books
FROM book_issue;




