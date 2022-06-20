DROP TABLE IF EXISTS account;

CREATE TABLE account
  (
     id     SERIAL NOT NULL PRIMARY KEY,
     name   VARCHAR,
     salary INT,
     email  VARCHAR
  );

DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users
  (
     id     SERIAL NOT NULL PRIMARY KEY,
     username VARCHAR(64) NOT NULL,
     password VARCHAR(128) NOT NULL
  )

--INSERT INTO loginUser(username, password) VALUES('hoge', '$08$yI3HNSrpzBKPbSUaAtTxB.DgkicwoYkLFoIsupYMV6BqJ1x9zeyHO');