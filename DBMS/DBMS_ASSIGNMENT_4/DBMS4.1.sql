USE database2;

/* 1.Write a SELECT command to display name of those members
who belong to the category as to which member
“CHETNA” belongs*/

SELECT member_name FROM member
WHERE category = (SELECT category FROM member WHERE member_name = 'CHETNA');

/* 2.Write a SELECT command to display information on the books
that have not been returned till date. The information should
include book issue date, title, member name and due date*/

SELECT bi.issue_dt,t.title_nm,m.member_name,bi.due_dt 
FROM book_issue bi,title t,member m,books b
WHERE (bi.accession_no,bi.member_id) 
NOT IN (SELECT br.accession_no,br.member_id FROM book_return br) 
AND (bi.member_id=m.member_id) 
AND (bi.accession_no=b.accession_no) 
AND (b.title_id=t.title_id);

/*3. Write a SELECT command to display information on the books
that have been returned after their due dates. The information
should include book issue date, title, member name and due
date*/

SELECT bi.issue_dt,t.title_nm,m.member_name,bi.due_dt 
FROM book_issue bi,title t,member m,books b
WHERE ((DATEDIFF((SELECT br.return_dt FROM book_return br 
WHERE br.accession_no= bi.accession_no AND bi.member_id=br.member_id AND DATEDIFF(bi.issue_dt,br.issue_dt)=0),bi.due_dt)) > 0) 
AND (bi.member_id = m.member_id) 
AND (bi.accession_no=b.accession_no) 
AND (b.title_id=t.title_id);


/*4.Write a SELECT command to display information of those books
whose price is equal to the most expensive book purchase so far*/

SELECT  accession_no,title_id,price
FROM books
WHERE price = (SELECT max(price) FROM books);

/*5.Write a SELECT command to display the second maximum price
of a book*/

SELECT title_id,price
from books
WHERE price = (SELECT max(price) FROM books WHERE price < (SELECT max(price) FROM books));





