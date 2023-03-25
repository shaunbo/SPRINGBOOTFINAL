DROP TABLE IF EXISTS video_games;
DROP TABLE IF EXISTS consoles;
DROP TABLE IF EXISTS gamer_group;
DROP TABLE IF EXISTS game_group;
DROP TABLE IF EXISTS gamer;
CREATE TABLE gamer (
gamer_id Integer not null auto_increment,
gamer_name varchar(25) not null,
gamer_email varchar(45) not null,
gamer_age Integer not null,
PRIMARY KEY (gamer_id)
);
CREATE TABLE game_group (
group_id Integer not null auto_increment,
group_name varchar(40) not null,
group_size Integer not null,
group_notes varchar(500),
PRIMARY KEY (group_id)
);
CREATE TABLE gamer_group (
gamer_group_id Integer not null auto_increment,
group_id Integer not null,
gamer_id Integer not null,
PRIMARY KEY (gamer_group_id),
FOREIGN KEY (group_id) REFERENCES game_group (group_id) ON DELETE CASCADE,
FOREIGN KEY (gamer_id) REFERENCES gamer (gamer_id) ON DELETE CASCADE
);
CREATE TABLE consoles (
console_id Integer not null auto_increment,
console_brand varchar(20) not null,
console_name varchar(20) not null,
PRIMARY KEY (console_id)
);
CREATE TABLE video_games(
game_id Integer not null auto_increment,
game_name varchar(60) not null,
genre enum('RPG', 'SHOOTER','FIGHTING', 'PUZZLE', 'ACTION','HORROR') not null,
ESRB_rating varchar(4),
console_id Integer,
PRIMARY KEY (game_id),
FOREIGN KEY (console_id) REFERENCES consoles (console_id) ON DELETE CASCADE
);