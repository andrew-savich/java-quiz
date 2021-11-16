create table quizzes(
    id bigserial not null primary key,
    question varchar(250) not null unique
);
GO
