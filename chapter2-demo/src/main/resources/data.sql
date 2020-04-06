-- import products test data
insert into tbProduct(id, name, cover_image, price) values (1, 'testProduct-001', '/products/cover/001.png', 100);
insert into tbProduct(id, name, cover_image, price) values (2, 'testProduct-002', '/products/cover/002.png', 200);
insert into tbProduct(id, name, cover_image, price) values (3, 'testProduct-003', '/products/cover/003.png', 300);
insert into tbProduct(id, name, cover_image, price) values (4, 'testProduct-004', '/products/cover/004.png', 400);
insert into tbProduct(id, name, cover_image, price) values (5, 'testProduct-005', '/products/cover/005.png', 500);

-- import user test data
insert into tbUser(id, nickname, avatar) values (1, 'ZhangSan', '/users/avatar/zhansan.png');
insert into tbUser(id, nickname, avatar) values (2, 'LiSi', '/users/avatar/lisi.png');
insert into tbUser(id, nickname, avatar) values (3, 'WangWu', '/users/avatar/wangwu.png');
insert into tbUser(id, nickname, avatar) values (4, 'YanXiaoliu', '/users/avatar/yanxiaoliu.png');

-- import product comment test data
insert into tbProduct_Comment(id, product_id, author_id, content, created) values (1, 3, 1, 'Very good product', CURRENT_TIMESTAMP());
insert into tbProduct_Comment(id, product_id, author_id, content, created) values (2, 3, 3, 'Very good product+1', CURRENT_TIMESTAMP());
insert into tbProduct_Comment(id, product_id, author_id, content, created) values (3, 3, 4, 'haha, who uses who knows', CURRENT_TIMESTAMP());

