
USE database2;
/*1. display the bookwise information have status as 'NOT_ISSUED' 
information include subject name, subject id, accession no of book*/

SELECT 
    s.subject_id,
    s.subject_nm,
    COUNT(s.subject_id) AS TOTAL_BOOKS
from
    books b
        inner join
    title t
        inner join
    subjects s
where
    ((b.title_id = t.title_id) AND (t.subject_id = s.subject_id))
group by s.subject_id ;

/*2. Display those rows from book issue table where difference between issue
date and due date is greater than 2 */
SELECT * from book_issue
WHERE (DATEDIFF(due_dt,issue_dt)>60) ;

/*3.display the list of books having price greater than the minimum price*/
SELECT t.title_nm
FROM title t
INNER JOIN books b
ON
b.title_id = t.title_id
WHERE b.price > (SELECT(MIN(price)) FROM books);
