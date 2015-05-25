# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table login (
  id                        integer not null,
  name                      varchar(255),
  constraint pk_login primary key (id))
;

create table permission (
  permission_id             integer not null,
  permission_name           varchar(255),
  constraint pk_permission primary key (permission_id))
;

create table task (
  id                        integer not null,
  name                      varchar(255),
  constraint pk_task primary key (id))
;

create sequence login_seq;

create sequence permission_seq;

create sequence task_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists login;

drop table if exists permission;

drop table if exists task;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists login_seq;

drop sequence if exists permission_seq;

drop sequence if exists task_seq;

