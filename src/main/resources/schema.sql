CREATE SCHEMA IF NOT EXISTS todo_test;
CREATE TABLE IF NOT EXISTS todo_test.todos (
                                          id BIGINT NOT NULL AUTO_INCREMENT,
                                          title VARCHAR(255) NOT NULL,
                                          finished BOOLEAN NOT NULL,
                                          PRIMARY KEY (id)
);

CREATE SCHEMA IF NOT EXISTS todo;

CREATE TABLE IF NOT EXISTS todo.todos (
                                     id BIGINT NOT NULL AUTO_INCREMENT,
                                     title VARCHAR(255) NOT NULL,
                                     finished BOOLEAN NOT NULL,
                                     PRIMARY KEY (id)
);

INSERT INTO todo.todos (title, finished) VALUES ('Buy groceries', false);
INSERT INTO todo.todos (title, finished) VALUES ('Complete Kotlin project', true);
INSERT INTO todo.todos (title, finished) VALUES ('Call the bank', false);
INSERT INTO todo.todos (title, finished) VALUES ('Schedule a meeting', true);
INSERT INTO todo.todos (title, finished) VALUES ('Write blog post', false);
INSERT INTO todo.todos (title, finished) VALUES ('Read a book', true);
INSERT INTO todo.todos (title, finished) VALUES ('Clean the house', false);
INSERT INTO todo.todos (title, finished) VALUES ('Exercise for 30 minutes', false);
INSERT INTO todo.todos (title, finished) VALUES ('Prepare presentation', true);
INSERT INTO todo.todos (title, finished) VALUES ('Watch a tutorial video', false);
