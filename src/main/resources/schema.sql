DROP TABLE IF EXISTS profile;

CREATE TABLE profile
  (
     id     SERIAL NOT NULL PRIMARY KEY,
     firstName VARCHAR(64) NOT NULL,
     lastName VARCHAR(64) NOT NULL,
     employeeId VARCHAR(64) unique NOT NULL,
     gender VARCHAR(64) NOT NULL,
     department VARCHAR(64) unique NOT NULL,
     currentStatus VARCHAR(64) NOT NULL
  );

DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users
  (
     id     SERIAL NOT NULL PRIMARY KEY,
     username VARCHAR(64) unique NOT NULL,
     password VARCHAR(128) NOT NULL
  );

INSERT INTO users(username, password) VALUES('rafi', '$08$yI3HNSrpzBKPbSUaAtTxB.DgkicwoYkLFoIsupYMV6BqJ1x9zeyHO');