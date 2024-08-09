insert into question(question_id, title, text) values (1001,'title 1', 'text 1');
insert into question(question_id, title, text) values (1002, 'title 2', 'text 2');

insert into answer(text, correct, question_id) values('text 1', true, 1001);
insert into answer(text, correct, question_id) values('text 2', false, 1001);
insert into answer(text, correct, question_id) values('text 3', false, 1001);
insert into answer(text, correct, question_id) values('text 4', false, 1001);
insert into answer(text, correct, question_id) values('text 5', true, 1002);
insert into answer(text, correct, question_id) values('text 6', false, 1002);
insert into answer(text, correct, question_id) values('text 7', false, 1002);
insert into answer(text, correct, question_id) values('text 8', false, 1002);