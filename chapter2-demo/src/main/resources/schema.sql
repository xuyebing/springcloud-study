drop table if exists tbProduct;
drop table if exists tbProduct_Comment;
drop table if exists tbUser;
-- create product table
create table tbProduct(
    id int unsigned not null auto_increment comment '主键',
    name varchar(100) comment 'product name',
    cover_image varchar(100) comment 'product image',
    price int not null default 0 comment 'product price',
    primary key (id)
);

-- create product comment table
create table tbProduct_Comment(
    id int unsigned not null auto_increment comment '主键',
    product_id int unsigned comment 'product id',
    author_id int unsigned comment 'user id',
    content varchar(200) comment 'comment',
    created TIMESTAMP comment 'created time',
    primary key (id)
);

-- create user table
create table tbUser (
    id int unsigned not null auto_increment comment '主键',
    nickname varchar(50) comment 'user nickname',
    avatar varchar(255) comment 'user avatar',
    primary key (id)
);
