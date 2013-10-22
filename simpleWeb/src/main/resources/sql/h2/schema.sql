drop table if exists tbl_task;
drop table if exists tbl_user;
drop table if exists tbl_recipe;

create table tbl_task (
	id bigint generated by default as identity,
	title varchar(128) not null,
	description varchar(255),
	user_id bigint not null,
    primary key (id)
);

create table tbl_user (
	id bigint generated by default as identity,
	login_name varchar(64) not null unique,
	name varchar(64) not null,
	password varchar(255) not null,
	salt varchar(64) not null,
	roles varchar(255) not null,
	register_date timestamp not null,
	primary key (id)
);

create table tbl_recipe (
	id bigint generated by default as identity,
	name varchar(64) not null,
	description varchar(255) ,
	steps varchar(255),
	metal varchar(255),
	pic varchar(255),
	create_Date timestamp,
	Last_Modify_Date timestamp,
	user_id bigint not null,
	primary key (id)
);

