-- first_half 테이블이 icecream_info 테이블을 참조하는 구조.
-- 외래 키는 flavor다.

SELECT a.flavor from first_half as a
inner join icecream_info as b 
on a.flavor = b.flavor
where total_order >= 3000 and ingredient_type ='fruit_based'
order by total_order desc