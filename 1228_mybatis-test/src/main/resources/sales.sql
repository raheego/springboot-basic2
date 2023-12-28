
-- 테이블 생성 시 AUTO_INCREMENT로 설정
CREATE TABLE Sales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    item VARCHAR(50) NOT NULL,
    quantity INT NOT NULL,
    amount DECIMAL(18,2)
);

-----------------------------------------------------------
DELIMITER //

CREATE TRIGGER SALE_BEFORE_INSERT_TRG
BEFORE INSERT ON Sales FOR EACH ROW
BEGIN
    IF NEW.id IS NULL THEN
        SET NEW.id = NULL;   -- AUTO_INCREMENT 컬럼이므로 NULL로 설정
    END IF;
END //

DELIMITER ;

-------------------------------------------------------------
INSERT INTO Sales (item, quantity, amount) VALUES ('Product A', 10, 100.50);

SELECT LAST_INSERT_ID();
----------------------------------------------
commit;














