
-- liquibase formatted sql

-- changeset liquibase:1
CREATE TABLE item
(
       id varchar2(40) primary key ,
       name varchar2(100),
       description varchar2(100),
       features  varchar2(100),
       price number,
       keywords varchar(100),
       url varchar(100),
       category varchar(30),
       subcategory varchar(30)
);
