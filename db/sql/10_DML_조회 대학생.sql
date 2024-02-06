# 컴퓨터공학 고길동 학생이 수강신청한 강의 개수를 조회하는 쿼리
SELECT 
    ST_NAME AS "이름", ST_MAJOR AS "전공", COUNT(*) AS "신청한 강의 수"
FROM
    COURSE
        JOIN
	STUDENT ON CO_ST_NUM = ST_NUM
WHERE
    ST_MAJOR = "컴퓨터공학" AND ST_NAME = "고길동";
    
# 컴퓨터공학 고길동 학생이 수강 신청한 학점을 조회하는 쿼리
/*
SELECT 
     ST_NAME AS "이름", ST_MAJOR AS "전공", LE_POINT AS "신청 학점"
FROM
    LECTURE
        JOIN
    COURSE ON LE_NUM = CO_LE_NUM
		JOIN
	STUDENT ON ST_NUM = CO_ST_NUM
WHERE 
	ST_NUM = "2024160001" AND ST_NAME = "고길동";
*/

SELECT 
    ST_NAME AS "이름", ST_MAJOR AS "전공",SUM(LE_POINT) AS "신청한 학점 수"
FROM
    COURSE
        JOIN
	STUDENT ON CO_ST_NUM = ST_NUM
		JOIN
	LECTURE ON CO_LE_NUM = LE_NUM
WHERE
    ST_MAJOR = "컴퓨터공학" AND ST_NAME = "고길동";           
    
# 24학년 신입생을 조회하는 쿼리
SELECT 
    *
FROM
    STUDENT
WHERE
    ST_NUM LIKE '2024%' AND ST_GRADE = 1;

# 각 전공별 학생수를 조회하는 쿼리
SELECT 
    ST_MAJOR AS '전공', COUNT(*) AS "학생수"
FROM
    STUDENT
GROUP BY ST_MAJOR;

# 강의별 수강신청한 학생 수를 조회하는 쿼리 : 강의명, 학생수 순으로 조회
SELECT 
    LE_TITLE AS "강의명", COUNT(CO_ST_NUM) AS '학생수'
FROM
    COURSE
        JOIN
    LECTURE ON CO_LE_NUM = LE_NUM
GROUP BY LE_NUM;

SELECT * FROM STUDENT;
# 컴퓨터공학을 다니는 학생 정보를 조회하는 쿼리를 작성 (O)
SELECT * FROM STUDENT WHERE ST_MAJOR = "컴퓨터공학";

# 컴퓨터공학을 다니는 1학년 학생 정보를 조회 (O)
SELECT * FROM STUDENT WHERE ST_MAJOR = "컴퓨터공학" AND ST_GRADE = 1;

# 컴퓨터공학 또는 화학공학을 다니는 1학년 학생 정보를 조회 (X) => HAVING 썻음 OR AND가 여러개인경우 괄호로 우선순위 매겨줌
SELECT * FROM STUDENT WHERE (ST_MAJOR = "컴퓨터공학" OR ST_MAJOR = "화학공학") AND ST_GRADE = 1;
SELECT * FROM STUDENT WHERE ST_MAJOR IN('컴퓨터공학', '화학공학') AND ST_GRADE = 1;

# 컴퓨터공학을 다니는 학생 수를 조회 (O)
SELECT COUNT(*) AS 학생수 FROM STUDENT WHERE ST_MAJOR = "컴퓨터공학" GROUP BY ST_MAJOR;

# 학생들이 등록된 학과를 조회 (O)
SELECT ST_MAJOR FROM STUDENT GROUP BY ST_MAJOR;
SELECT DISTINCT ST_MAJOR FROM STUDENT;

# 학생들이 3명이상 등록된 학과들을 조회 (X)
SELECT ST_MAJOR FROM STUDENT GROUP BY ST_MAJOR HAVING COUNT(ST_NUM) >= 3;

# 컴퓨터개론을 수강하는 학생 수를 조회 (X) -> 정보가 없으면 JOIN해서 정보 가지고 와야함
SELECT * FROM COURSE;
SELECT 
    COUNT(*)
FROM
    COURSE
        JOIN
    LECTURE ON CO_LE_NUM = LE_NUM
WHERE
    LE_TITLE = '컴퓨터개론'
GROUP BY CO_LE_NUM;

# 각 강의별 수강하는 학생수를 조회, 강의명과 학생수를 조회 (X) GROUP BY 틀림 LE_TITLE로 함
SELECT LE_TITLE AS 강의명 ,COUNT(CO_ST_NUM) AS 학생수 
FROM
	COURSE 
JOIN
	LECTURE 
ON
	CO_LE_NUM = LE_NUM 
GROUP BY
	CO_LE_NUM;
    
# 홍길동 학생이 수강하는 강의목록을 조회 (X) GROUP BY.,,,,,,,,,,
SELECT 
    ST_NAME, LE_TITLE
FROM
    COURSE
        JOIN
    STUDENT ON CO_ST_NUM = ST_NUM
		JOIN
	LECTURE ON CO_LE_NUM = LE_NUM
WHERE
    ST_NAME = '홍길동';

# 기계공학에 소속된 교수의 수를 조회 (O)
SELECT COUNT(*) FROM PROFESSOR WHERE PR_MAJOR = "기계공학";

# 김교수가 강의하는 강의명을 조회 (X) 강의 하고있는걸 조회해야해서 COURSE를 기준으로 해야함
SELECT 
    LE_TITLE
FROM
    LECTURE
        JOIN
    PROFESSOR ON PR_NUM = LE_PR_NUM
WHERE
    PR_NAME = '김교수';


SELECT DISTINCT
    PR_NAME, LE_TITLE
FROM
    COURSE
        JOIN
    LECTURE ON CO_LE_NUM = LE_NUM
        JOIN
    PROFESSOR ON LE_PR_NUM = PR_NUM
WHERE
    PR_NAME = '김교수';






