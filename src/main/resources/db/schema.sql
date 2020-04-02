create table if not exists user (
  id int not null primary key auto_increment,
  user_name varchar(100),
  user_sex varchar(1),
  user_age NUMBER(3),
  user_id_no VARCHAR(18),
  user_phone_num VARCHAR(11),
  user_email VARCHAR(100),
  create_time DATE,
  modify_time DATE,
  user_state VARCHAR(1));