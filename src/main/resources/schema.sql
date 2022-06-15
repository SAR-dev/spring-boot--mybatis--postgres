drop table if exists account;
create table account
(
    id serial not null primary key,
    name varchar,
    salary int
);