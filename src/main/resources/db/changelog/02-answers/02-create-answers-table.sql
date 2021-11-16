create table answers(
    id bigserial not null primary key,
    answer_text varchar(250) not null,
    right_answer boolean not null,
    quiz_id bigint,

    constraint fk_quiz_id
       foreign key(quiz_id)
           references quizzes(id)
);
GO