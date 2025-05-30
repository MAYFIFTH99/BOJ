-- 코드를 입력하세요
SELECT A.FLAVOR
FROM FIRST_HALF AS A
JOIN (SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL_ORDER FROM JULY GROUP BY FLAVOR) B
ON A.FLAVOR = B.FLAVOR
GROUP BY A.FLAVOR
ORDER BY (A.TOTAL_ORDER + B.TOTAL_ORDER) DESC
LIMIT 3