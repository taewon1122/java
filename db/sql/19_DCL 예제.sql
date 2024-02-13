CREATE USER 'taewon'@'%' IDENTIFIED BY 'abc123'; # 사용자 추가

SET PASSWORD FOR 'taewon'@'%' = 'def123'; # 사용자 비번 변경

DROP USER 'taewon'@'%'; # 사용자 삭제

SELECT User, Host FROM mysql.user;

# 권한 부여 : GRANT 권한종류 ON DB명.테이블명 TO '사용자명'@'호스트명';
GRANT ALL PRIVILEGES ON `SHOPPINGMALL`.PRODUCT TO 'taewon'@'%';

# 권한 제거 : REVOKE 권한 종류 ON DB명.테이블명 FROM '사용자명'@'호스트명';
REVOKE ALL PRIVILEGES ON `SHOPPINGMALL`.PRODUCT FROM 'taewon'@'%';

GRANT ALL PRIVILEGES ON `SHOPPINGMALL`.* TO 'taewon'@'%';