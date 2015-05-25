# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table login (
  employee_number           integer not null,
  user_number               integer,
  password                  varchar(255),
  permission_id             integer,
  constraint pk_login primary key (employee_number))
;

create table task (
  id                        integer not null,
  name                      varchar(255),
  constraint pk_task primary key (id))
;

create table thankyou (
  thankyou_id               integer not null,
  date                      timestamp,
  section_id                varchar(255),
  you_name                  varchar(255),
  employee_number           varchar(255),
  vote_number               integer,
  help_contents             varchar(255),
  check_id                  integer,
  constraint pk_thankyou primary key (thankyou_id))
;

create sequence login_seq;

create sequence task_seq;

create sequence thankyou_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists login;

drop table if exists task;

drop table if exists thankyou;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists login_seq;

drop sequence if exists task_seq;

drop sequence if exists thankyou_seq;

