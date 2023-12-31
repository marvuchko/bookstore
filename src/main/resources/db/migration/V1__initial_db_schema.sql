-- INITIAL TABLES

CREATE TABLE users (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role_id BIGINT NOT NULL
) ENGINE=InnoDB CHARACTER SET=UTF8MB4;

CREATE TABLE roles (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL
) ENGINE=InnoDB CHARACTER SET=UTF8MB4;

CREATE TABLE author (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(100) NOT NULL,
    date_of_birth DATE NOT NULL
) ENGINE=InnoDB CHARACTER SET=UTF8MB4;

CREATE TABLE book (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    author_id BIGINT NOT NULL
) ENGINE=InnoDB CHARACTER SET=UTF8MB4;

-- FOREIGN KEY CONSTRAINTS

ALTER TABLE users
ADD CONSTRAINT role_fk FOREIGN KEY(role_id) REFERENCES roles(id);

ALTER TABLE book
ADD CONSTRAINT author_fk FOREIGN KEY(author_id) REFERENCES author(id);