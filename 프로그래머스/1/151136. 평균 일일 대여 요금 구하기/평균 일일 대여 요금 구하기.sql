select round(avg(daily_fee),0) as daily_fee from car_rental_company_car
where car_type = 'suv'
group by car_type;



