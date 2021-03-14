DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    id       LONG AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(250) NOT NULL

);

INSERT INTO users (username)
VALUES ('DaisyDuck'),
       ('DanielDüsentrieb'),
       ('GustavGans');