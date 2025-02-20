-- 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 조회
SELECT USER_ID, NICKNAME, SUM(PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD B
JOIN USED_GOODS_USER U
ON B.WRITER_ID = U.USER_ID
WHERE STATUS = 'DONE'
GROUP BY USER_ID
HAVING SUM(PRICE) >= 700000
ORDER BY SUM(PRICE) ASC