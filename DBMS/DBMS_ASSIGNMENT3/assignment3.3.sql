USE database2;

/* 1.display total number of student, total number of faculty and total numbers of others in library */

SELECT category,COUNT(category)
FROM member
GROUP BY category;

/* 2.display titles that have been issued more than 2 times*/

SELECT t.title_nm,COUNT(b.accession_no) as count
FROM title t
INNER JOIN books b
ON
b.title_id = t.title_id
INNER JOIN book_issue bi
ON
bi.accession_no = b.accession_no
GROUP BY(t.title_nm)
HAVING COUNT(b.accession_no)>=2;

/*3. Display information on books issued to members of catagory other than F*/

SELECT  m.member_name, m.member_id, t.title_nm, bi.accession_no, s.subject_nm FROM book_issue bi

INNER JOIN  member m

ON bi.member_id = m.member_id AND m.category NOT IN("F")

INNER JOIN books b

ON b.accession_no = bi.accession_no

INNER JOIN title t

ON b.title_id = t.title_id

INNER JOIN subjects s

ON s.subject_id = t.subject_id;

/*4. Display information on those authors for which at least one book has been status as "NOT_ISSUED"*/

SELECT a.author_nm, ta.author_id, b.title_id FROM books b

INNER JOIN title_author ta

ON b.title_id = ta.title_id

INNER JOIN authors a
WHERE b.status = "NOT_ISSUED";
