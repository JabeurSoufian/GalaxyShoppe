CREATE TABLE customer_order (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_id INT,
    order_date DATE,
    quantity INT,
    order_paid BOOLEAN
);
