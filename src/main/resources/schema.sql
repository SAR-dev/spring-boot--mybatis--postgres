DROP TABLE IF EXISTS account;

CREATE TABLE account
  (
     id     SERIAL NOT NULL PRIMARY KEY,
     name   VARCHAR,
     salary INT,
     email  VARCHAR
  );
