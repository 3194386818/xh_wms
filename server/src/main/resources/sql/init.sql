# 产品类型表(product_type)
create table product_type(
    id int primary key auto_increment,
    name varchar(50) not null unique
);
insert into product_type(name) values ('摄像头'), ('IPTV');

# 用户表(user)
CREATE TABLE user (
    uid VARCHAR(20) PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    passwd VARCHAR(100) NOT NULL,
    name VARCHAR(50) NOT NULL,
    img_base64 LONGTEXT ,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP ,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

# 库存表(inventory)
create table inventory(
    sn VARCHAR(255) primary key ,
    mac VARCHAR(255) not null ,
    uid varchar(255) not null ,
    product_type_id int not null ,
    status enum('IN_STOCK', 'OUT_STOCK') not null ,
    last_operation_time datetime not null ,
    foreign key (product_type_id) references product_type(id),
    foreign key (uid) references user(uid)
);

# 操作记录表(inventory_operation)
create table inventory_operation(
    id bigint primary key auto_increment,
    sn varchar(255) not null ,
    mac varchar(255) not null ,
    uid varchar(255) not null ,
    product_type_id int not null ,
    operation_type ENUM('IN', 'OUT') NOT NULL,
    operation_time datetime not null ,
    operation_uid varchar(255) not null ,
    foreign key (product_type_id) references product_type(id),
    foreign key (uid) references user(uid),
    foreign key (operation_uid) references user(uid)
);
