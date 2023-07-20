INSERT INTO roles(id, name)
VALUES
(1, 'USER'),
(2, 'ADMIN');

INSERT INTO users(id, full_name, email, password, role_id)
VALUES
(1, 'Цецко Ђорђевић', 'cecko@gmail.com', '$2y$10$WXGU0jeEnWwSy56zxb2uteTBFxltPsj/OknOPIK3QNljO.CPlo25e', 2),
(2, 'Марко Вучковић', 'marko@gmail.com', '$2y$10$aPMWVsf9oHyZ5W7q0FwO/uDtf7zrPBIJyYcew/BpZ7jOG6fDDgJwy', 1);

INSERT INTO author(id, full_name, date_of_birth)
VALUES
(1, 'Фјодор Достојевски', '1821-11-11'),
(2, 'Иво Андрић', '1892-10-10');

INSERT INTO book(id, title, author_id)
VALUES
(1, 'Проклета Авлија', 2),
(2, 'На Дрини Ћуприја', 2),
(3, 'Злочин и Казна', 1),
(4, 'Записи из подземља', 1),
(5, 'Идиот', 1);