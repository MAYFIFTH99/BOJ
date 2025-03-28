SELECT
    A.CAR_ID,
    A.CAR_TYPE,
    ROUND(A.DAILY_FEE * 30 * (100 - P.DISCOUNT_RATE) / 100) AS FEE
FROM
    CAR_RENTAL_COMPANY_CAR A
JOIN
    CAR_RENTAL_COMPANY_DISCOUNT_PLAN P
    ON A.CAR_TYPE = P.CAR_TYPE
WHERE
    A.CAR_TYPE IN ('세단', 'SUV')
    AND P.DURATION_TYPE = '30일 이상'
    AND A.CAR_ID NOT IN (
        SELECT CAR_ID
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE NOT (
            END_DATE < '2022-11-01' OR START_DATE > '2022-11-30'
        )
    )
    AND ROUND(A.DAILY_FEE * 30 * (100 - P.DISCOUNT_RATE) / 100) BETWEEN 500000 AND 1999999
ORDER BY
    FEE DESC, A.CAR_TYPE, A.CAR_ID DESC;
