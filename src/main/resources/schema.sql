DROP TABLE IF EXISTS PUBLIC.USER;
create table PUBLIC.USER
(
    id bigint auto_increment,
    birth_date TIMESTAMP(26,6),
    name VARCHAR(255)
);

create unique index USER_id_index
    on PUBLIC.USER (id);

alter table PUBLIC.USER
    add constraint USER_pk
        primary key (id);


DROP TABLE IF EXISTS PUBLIC.POST;
create table PUBLIC.POST
(
    id bigint auto_increment,
    post varchar(255),
    user_id bigint
);


create unique index POST_id_index
    on PUBLIC.POST (id);

alter table PUBLIC.POST
    add constraint POST_pk
        primary key (id);

alter table PUBLIC.POST
    add constraint POST_USER_ID_fk
        foreign key (user_id) references PUBLIC.USER;

