create table users(
    id bigint not null auto_increment,
    username varchar(100) not null unique,
    password varchar(100) not null,
    created_at timestamp,
    updated_at timestamp,
    primary key(id)
);