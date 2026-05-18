-- liquibase formatted sql

--changeset Sauchanka:1
create table users_credentials
(
    id         bigserial primary key not null,
    email      varchar(255) unique   not null,
    password   varchar(255)          not null,
    first_name varchar(255)          not null,
    last_name  varchar(255)          not null,
    role       varchar(50)           not null,
    active     boolean               not null,
    created_at timestamp,
    updated_at timestamp
);
create index users_credentials_email_idx on
    users_credentials (email);

create table refresh_token (
    id         bigserial primary key not null,
    user_id bigint not null,
    token varchar(512) unique not null,
    expiration_date date not null,
    created_at      timestamp,
    updated_at      timestamp,
    revoked boolean not null,
    constraint refresh_token_user_id_fk
    foreign key (user_id) references users_credentials(id) on DELETE cascade
);