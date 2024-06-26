-- 코드를 입력하세요
SELECT U.USER_ID, U.NICKNAME, 
    CONCAT_WS(" ",U.CITY,U.STREET_ADDRESS1,U.STREET_ADDRESS2) AS '전체주소', 
    CONCAT_WS("-",SUBSTR(U.TLNO,1,3),SUBSTR(U.TLNO,4,4),SUBSTR(U.TLNO,8,4))AS '전화번호'
FROM USED_GOODS_USER U
LEFT JOIN USED_GOODS_BOARD B
ON U.USER_ID = B.WRITER_ID
GROUP BY WRITER_ID
HAVING COUNT(WRITER_ID) >= 3 
ORDER BY USER_ID DESC;