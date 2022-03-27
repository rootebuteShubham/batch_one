elect * from lms.roles;
-- insert into lms.roles values (1,'ADMIN');
-- insert into lms.roles values (2,'USER');

-- Change encrypted value to the password that you want to use to login - https://bcrypt-generator.com/
select * from lms.users;
-- insert into lms.users values(1,'$2a$12$qtF72RicF7J8LEdkIuqVm.P3DpSGgovOLYKSQ1WH/9VHpJ.VJFz1u','admin');
-- insert into lms.users values(2,'$2a$12$Ddy9GIEwU4l24WyC7sc3o.dkJLzNCY60FP3aoSQzWysHavwxpX7me','s0j04vu');

select * from lms.users_roles;
-- insert into lms.users_roles values(1,1);
-- insert into lms.users_roles values(2,2);
