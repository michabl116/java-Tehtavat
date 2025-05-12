USE currency_converter;
SELECT * FROM currencies WHERE code = 'EUR';
SELECT COUNT(*) AS total_currencies FROM currencies;
SELECT * FROM currencies ORDER BY exchange_rate DESC LIMIT 1;