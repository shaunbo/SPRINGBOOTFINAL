-- gamer
INSERT INTO gamer (gamer_name, gamer_email, gamer_age) VALUES('Chandler', 'chandler@gmail.com', '26');
INSERT INTO gamer (gamer_name, gamer_email, gamer_age) VALUES('Shaun', 'shaun@gmail.com', '26');
INSERT INTO gamer (gamer_name, gamer_email, gamer_age) VALUES('Jesse', 'jesse@gmail.com', '27');
INSERT INTO gamer (gamer_name, gamer_email, gamer_age) VALUES('Darin', 'darin@gmail.com', '12');
INSERT INTO gamer (gamer_name, gamer_email, gamer_age) VALUES('Trevor', 'trevor@gmail.com', '26');
INSERT INTO gamer (gamer_name, gamer_email, gamer_age) VALUES('Mat', 'mat@gmail.com', '50');
INSERT INTO gamer (gamer_name, gamer_email, gamer_age) VALUES('Jonny', 'jonny@gmail.com', '28');
INSERT INTO gamer (gamer_name, gamer_email, gamer_age) VALUES('Sean', 'sean@gmail.com', '26');
INSERT INTO gamer (gamer_name, gamer_email, gamer_age) VALUES('Nick', 'nick@gmail.com', '24');
INSERT INTO gamer (gamer_name, gamer_email, gamer_age) VALUES('Taylor', 'taylor@gmail.com', '21');


-- consoles
INSERT INTO consoles (console_brand, console_name) VALUES('Sony', 'Playstation');
INSERT INTO consoles (console_brand, console_name) VALUES('Microsoft', 'Xbox');
INSERT INTO consoles (console_brand, console_name) VALUES('PC', 'PC');
INSERT INTO consoles (console_brand, console_name) VALUES('Nintendo', 'Switch');


-- video_games
INSERT INTO video_games (game_name, genre, ESRB_rating) VALUES('Call of Duty', 'SHOOTER', 'M');
INSERT INTO video_games (game_name, genre, ESRB_rating) VALUES('Halo', 'SHOOTER', 'M');
INSERT INTO video_games (game_name, genre, ESRB_rating) VALUES('League of Legends', 'ACTION', 'T');
INSERT INTO video_games (game_name, genre, ESRB_rating) VALUES('Valorant', 'SHOOTER', 'T');
INSERT INTO video_games (game_name, genre, ESRB_rating) VALUES('Overwatch', 'SHOOTER', 'T');
INSERT INTO video_games (game_name, genre, ESRB_rating) VALUES('Super Smash Bros', 'FIGHTING', 'E');
INSERT INTO video_games (game_name, genre, ESRB_rating) VALUES('Warzone', 'SHOOTER', 'M');


-- game_group
INSERT INTO game_group (group_name, group_size, group_notes) VALUES('Slayers', '4', 'Lets have fun');
INSERT INTO game_group (group_name, group_size, group_notes) VALUES('Billy Bobs', '8', 'Meet at 7pm PST');
INSERT INTO game_group (group_name, group_size, group_notes) VALUES('Juicers', '6', 'Kid friendly');
INSERT INTO game_group (group_name, group_size, group_notes) VALUES('Rockies', '5', 'Lets meet up for food after');
INSERT INTO game_group (group_name, group_size, group_notes) VALUES('Pokemon', '2', 'Time to catch them all');

-- gamer_group
INSERT INTO gamer_group (group_id, gamer_id) VALUES('', '');
INSERT INTO gamer_group (group_id, gamer_id) VALUES('', '');
INSERT INTO gamer_group (group_id, gamer_id) VALUES('', '');
INSERT INTO gamer_group (group_id, gamer_id) VALUES('', '');
INSERT INTO gamer_group (group_id, gamer_id) VALUES('', '');
