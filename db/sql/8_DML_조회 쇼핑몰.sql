# abc123 회원이 주문 내역을 확인
SELECT * FROM `ORDER` WHERE OR_ME_ID = "abc123";

# 기타에 포함된 모든 제품을 조회하는 쿼리
SELECT * FROM PRODUCT WHERE PR_CA_NUM = 1;

# 기타(1), 자동차(5), 의류(2)에 포함된 모든 제품을 조회하는 쿼리
SELECT * FROM PRODUCT WHERE PR_CA_NUM IN (1,3,5);

# 등록된 제품들의 카테고리 번호를 조회하는 쿼리
SELECT DISTINCT PR_CA_NUM FROM PRODUCT;

# 가격이 높은 순으로 제품을 정렬(ORDER BY)하는 쿼리 -> 뒤에있는 속성은 앞의 값이 같을경우 정렬하는 기준
SELECT * FROM PRODUCT ORDER BY PR_PRICE DESC, PR_CODE;

# 제품 페이지에서 1페이지에 있는 제품을 조회하는 쿼리(한 페이지에 제품은 2개 조회)
SELECT * FROM PRODUCT LIMIT 0, 2;
# 2페이지에 있는 제품을 조회하는 쿼리(한 페이지에 제품은 2개 조회)
# 2 = 컨텐츠개수(2) * (현재페이지(2) - 1)
SELECT * FROM PRODUCT LIMIT 2, 2;
# 10페이지에 있는 제품을 조회하는 쿼리
SELECT * FROM PRODUCT LIMIT 18, 2;

# 카테고리 별 등록된 제품의 개수를 조회
SELECT
	PR_CA_NUM AS '카테고리 번호', COUNT(PR_CA_NUM) AS '제품수' 
FROM
	PRODUCT 
GROUP BY
	PR_CA_NUM;
    
# 카테고리 별 등록된 제품의 개수가 2개 이상인 카테고리를 조회
SELECT
	PR_CA_NUM AS '카테고리 번호', COUNT(PR_CA_NUM) AS '제품수' 
FROM
	PRODUCT 
GROUP BY
	PR_CA_NUM
HAVING
	COUNT(PR_CA_NUM) >= 2;

# abc123회원이 지금까지 주문한 총 금액을 조회하는 쿼리를 작성
SELECT
	OR_ME_ID AS '구매아이디', SUM(OR_TOTAL_PRICE) AS '총금액'
FROM
	`ORDER`
WHERE
	OR_ME_ID = "abc123" AND OR_STATE NOT IN("반품", "환불")
GROUP BY
	OR_ME_ID;

# 제품별 판매된 개수를 조회하는 쿼리
SELECT
	OR_PR_CODE AS '제품명', SUM(OR_AMOUNT) AS '판매 개수'
FROM
	`ORDER`
WHERE
	OR_STATE NOT IN("반품", "환불")
GROUP BY
	OR_PR_CODE;

/*
SELECT
FROM
WHERE
GROUP BY
HAVING
ORDER BY -> 정렬
LIMIT 결과 개수 조절
*/
# 제품별 카테고리명을 조회하기 위한 INNER JOIN 쿼리
SELECT PRODUCT.*, CA_NAME
FROM
	PRODUCT
JOIN
	CATEGORY
ON
	# PRODUCT의 외래키를 CATEGORY의 기본키와 연결
    # 속성명이 다르면 테이블명을 생략할 수 있다
	PR_CA_NUM = CA_NUM;
SELECT * FROM CATEGORY;

# 기타로 등록된 제품들을 조회하는 쿼리
SELECT PRODUCT.*, CA_NAME
FROM 
	PRODUCT
JOIN
	CATEGORY
ON
	PR_CA_NUM = CA_NUM
WHERE
	CA_NAME = "기타";
    
# abc123회원이 주문한 제품목록을 조회하는 쿼리
SELECT DISTINCT #중복처리
    PR_TITLE AS 제품명
FROM
    `ORDER`
        JOIN
    PRODUCT ON OR_PR_CODE = PR_CODE
WHERE
    OR_ME_ID = 'abc123' AND OR_STATE NOT IN("환불","반품");
    
# 각 제품별 판매된 개수(판매된 제품에 한해서)
SELECT 
    PR_TITLE, SUM(OR_AMOUNT) AS 판매수
FROM
    `ORDER`
        JOIN
    PRODUCT ON OR_PR_CODE = PR_CODE
WHERE
	OR_STATE NOT IN("반품","환불")
GROUP BY
    PR_CODE;
    
# 각 제품별 판매된 개수(모든 제품에 한해서)
SELECT 
	# IFNULL(속성, 값A) : 속성이 NULL인 경우 NULL대신 값A로 변경
    # LEFTJOIN (왼쪽테이블 기준)
    # RIGHTJOIN (오른쪽테이블 기준)
    PR_TITLE, IFNULL(SUM(OR_AMOUNT), 0) AS 판매수량
FROM
    PRODUCT
        LEFT JOIN
    `ORDER` ON PR_CODE = OR_PR_CODE
WHERE    
	OR_STATE IS NULL OR OR_STATE NOT IN("환불","반품")
GROUP BY
	PR_CODE;
    
SELECT 
    PR_TITLE, IFNULL(SUM(OR_AMOUNT), 0) AS 판매수량
FROM
    `ORDER`
        RIGHT JOIN
    PRODUCT ON PR_CODE = OR_PR_CODE
WHERE    
	OR_STATE IS NULL OR OR_STATE NOT IN("환불","반품")
GROUP BY
	PR_CODE;

# 모든 제품을 조회하는 쿼리 (O)
SELECT * FROM PRODUCT;

# 모든 카테고리를 조회하는 쿼리 (O)
SELECT * FROM CATEGORY;

# 제품별 카테고리를 조회, 카테고리, 제품을 조회 (O)
SELECT 
    CA_NAME AS 카테고리 , PR_TITLE AS 제품명 
FROM
    PRODUCT
        JOIN
    CATEGORY ON CA_NUM = PR_CA_NUM;
    
# 기타 카테고리에 포함된 모든 제품을 조회 (O)
SELECT 
    CA_NAME AS 카테고리 , PR_TITLE AS 제품명
FROM
    PRODUCT
        JOIN
    CATEGORY ON CA_NUM = PR_CA_NUM
WHERE
    CA_NAME = '기타';

# abc123회운이 주문한 제품 목록을 조회
SELECT 
    ME_ID AS 아이디, PR_TITLE AS 제품명
FROM
    MEMBER
        JOIN
    `ORDER` ON ME_ID = OR_ME_ID
        JOIN
    PRODUCT ON PR_CODE = OR_PR_CODE
WHERE
    ME_ID = 'ABC123';
#-----------------------------------------
SELECT 
    OR_DATE, OR_STATE, OR_AMOUNT, OR_TOTAL_PRICE, PR_TITLE
FROM
    `ORDER` 
        JOIN
    PRODUCT ON PR_CODE = OR_PR_CODE
WHERE
    OR_ME_ID = 'ABC123';

# 제품별 판매수량을 조회하는 쿼리
SELECT 
    PR_TITLE, OR_AMOUNT
FROM
    PRODUCT
        JOIN
    `ORDER` ON PR_CODE = OR_PR_CODE;
#-----------------------------------------
SELECT 
	PRODUCT.*, IFNULL(SUM(OR_AMOUNT),0) AS '판매수량' 
FROM 
	`ORDER`
	RIGHT JOIN PRODUCT
		ON PR_CODE = OR_PR_CODE
WHERE OR_STATE NOT IN('반품','환불') OR OR_STATE IS NULL
GROUP BY PR_CODE;

# 인기 제품 조회, 인기 제품은 누적 판매량을 기준으로 상위 5개 제품
SELECT 
	PRODUCT.*, IFNULL(SUM(OR_AMOUNT),0) AS '판매수량' 
FROM 
	`ORDER`
	RIGHT JOIN PRODUCT
		ON PR_CODE = OR_PR_CODE
WHERE OR_STATE NOT IN('반품','환불') OR OR_STATE IS NULL
GROUP BY PR_CODE
ORDER BY 판매수량 DESC, PR_PRICE ASC
LIMIT 0, 5;

# 가격이 제일 비싼 제품을 조회
SELECT * FROM PRODUCT
ORDER BY PR_PRICE DESC
LIMIT 0, 1;







    
    
    
    
    
    