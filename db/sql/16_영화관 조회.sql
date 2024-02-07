# 영화 웡카의 영화 정보를 검색하는 쿼리(배우X, 감독X, 제작국가X, 장르X)
SELECT * FROM MOVIE WHERE MO_TITLE = '웡카';

# 영화 웡카에 출연한 배우 및 감독을 조회하는 쿼리
SELECT 
    MO_TITLE AS 제목, CH_NAME AS 이름, MP_ROLE AS 역할
FROM
    MOVIE
        JOIN
    `JOIN` ON JO_MO_NUM = MO_NUM
        JOIN
    MOVIE_PERSON ON MP_NUM = JO_MP_NUM
		JOIN
	`CHARACTER` ON CH_NUM = MP_CH_NUM
WHERE
    MO_TITLE = '웡카';
    
# 