create table my_users(
    userid varchar_ignorecase(50) not null primary key,
    pwd varchar_ignorecase(50) not null,
    enabled boolean not null
);

create table my_authorities (
    userid varchar_ignorecase(50) not null,
    authority varchar_ignorecase(50) not null,
    constraint fk_authorities_users foreign key(userid) references my_users(userid)
);
create unique index ix_auth_userid on my_authorities (userid,authority);