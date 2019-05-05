DROP TABLE IF EXISTS PUBLIC.USER;
DROP SEQUENCE IF EXISTS PUBLIC.user_seq;
CREATE SEQUENCE user_seq;
CREATE TABLE PUBLIC.USER
(
    id bigint  default user_seq.nextval auto_increment primary key ,
    birth_date TIMESTAMP(26,6),
    name VARCHAR(255)
);

DROP TABLE IF EXISTS PUBLIC.POST;
DROP SEQUENCE IF EXISTS PUBLIC.post_seq;
CREATE SEQUENCE post_seq;
DROP TABLE IF EXISTS PUBLIC.POST;
create table PUBLIC.POST
(
    id bigint  default post_seq.nextval auto_increment primary key ,
    post varchar(255),
    user_id bigint
);


alter table PUBLIC.POST
    add constraint POST_USER_ID_fk
        foreign key (user_id) references PUBLIC.USER;

