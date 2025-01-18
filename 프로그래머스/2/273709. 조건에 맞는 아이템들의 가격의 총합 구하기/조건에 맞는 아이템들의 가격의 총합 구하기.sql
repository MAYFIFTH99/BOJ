SELECT sum(price) as total_price
FROM ITEM_INFO
group by rarity
having rarity = 'LEGEND'