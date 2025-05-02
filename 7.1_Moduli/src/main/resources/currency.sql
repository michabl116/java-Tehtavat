DROP DATABASE IF EXISTS currency_converter;
CREATE DATABASE currency_converter;
USE currency_converter;
CREATE TABLE currencies (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            code CHAR(3) NOT NULL UNIQUE,
                            `name` VARCHAR(50) NOT NULL,
                            exchange_rate DECIMAL(15, 6) NOT NULL,
                            last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;
INSERT INTO currencies (code, name, exchange_rate) VALUES
                                                       ('USD', 'US Dollar', 1.000000),
                                                       ('EUR', 'Euro', 0.930000),
                                                       ('GBP', 'British Pound', 0.790000),
                                                       ('JPY', 'Japanese Yen', 151.670000),
                                                       ('CAD', 'Canadian Dollar', 1.360000),
                                                       ('AUD', 'Australian Dollar', 1.520000),
                                                       ('CHF', 'Swiss Franc', 0.910000),
                                                       ('CNY', 'Chinese Yuan', 7.240000),
                                                       ('MXN', 'Mexican Peso', 16.850000);
DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY '1234!';
GRANT SELECT, INSERT, UPDATE ON currency_converter.currencies TO 'appuser'@'localhost';
FLUSH PRIVILEGES;