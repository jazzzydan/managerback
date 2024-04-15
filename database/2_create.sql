-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2024-04-15 12:19:15.728

-- tables
-- Table: city
CREATE TABLE city
(
    id         serial       NOT NULL,
    country_id int          NOT NULL,
    name       varchar(255) NOT NULL,
    CONSTRAINT city_pk PRIMARY KEY (id)
);

-- Table: club
CREATE TABLE club
(
    id        serial       NOT NULL,
    league_id int          NOT NULL,
    city_id   int          NULL,
    name      varchar(255) NOT NULL,
    CONSTRAINT club_pk PRIMARY KEY (id)
);

-- Table: confederation
CREATE TABLE confederation
(
    id          serial       NOT NULL,
    name        varchar(255) NOT NULL,
    description varchar(255) NOT NULL,
    CONSTRAINT confederation_pk PRIMARY KEY (id)
);

-- Table: country
CREATE TABLE country
(
    id               serial       NOT NULL,
    confederation_id int          NOT NULL,
    name             varchar(255) NOT NULL,
    CONSTRAINT country_pk PRIMARY KEY (id)
);

-- Table: country_flag
CREATE TABLE country_flag
(
    id         serial NOT NULL,
    country_id int    NOT NULL,
    image_data bytea  NOT NULL,
    CONSTRAINT country_flag_pk PRIMARY KEY (id)
);

-- Table: game
CREATE TABLE game
(
    id           serial NOT NULL,
    home_club_id int    NOT NULL,
    date         date   NOT NULL,
    CONSTRAINT game_pk PRIMARY KEY (id)
);

-- Table: league
CREATE TABLE league
(
    id         serial       NOT NULL,
    country_id int          NOT NULL,
    name       varchar(255) NOT NULL,
    CONSTRAINT league_pk PRIMARY KEY (id)
);

-- Table: next_game
CREATE TABLE next_game
(
    id        serial  NOT NULL,
    player_id int     NOT NULL,
    game_id   int     NOT NULL,
    date      date    NOT NULL,
    status    char(1) NOT NULL,
    time      time    NOT NULL,
    CONSTRAINT next_game_pk PRIMARY KEY (id)
);

-- Table: observation_position
CREATE TABLE observation_position
(
    id                    serial NOT NULL,
    player_observation_id int    NOT NULL,
    position_id           int    NOT NULL,
    CONSTRAINT observation_position_pk PRIMARY KEY (id)
);

-- Table: player
CREATE TABLE player
(
    id      serial       NOT NULL,
    club_id int          NULL,
    name    varchar(255) NOT NULL,
    status  char(1)      NOT NULL,
    CONSTRAINT player_pk PRIMARY KEY (id)
);

-- Table: player_details
CREATE TABLE player_details
(
    id          serial     NOT NULL,
    player_id   int        NOT NULL,
    gender      char(1)    NOT NULL,
    age         int        NOT NULL,
    birth_date  date       NOT NULL,
    height      int        NOT NULL,
    weight      int        NOT NULL,
    nationality varchar(3) NOT NULL,
    best_foot   char(1)    NOT NULL,
    CONSTRAINT player_details_pk PRIMARY KEY (id)
);

-- Table: player_observation
CREATE TABLE player_observation
(
    id           serial NOT NULL,
    game_id      int    NOT NULL,
    user_id      int    NOT NULL,
    player_id    int    NOT NULL,
    date         date   NOT NULL,
    marking      int    NULL,
    set_pieces   int    NULL,
    technique    int    NULL,
    heading      int    NULL,
    passing      int    NULL,
    agression    int    NULL,
    decisions    int    NULL,
    teamwork     int    NULL,
    acceleration int    NULL,
    pace         int    NULL,
    stamina      int    NULL,
    strenght     int    NULL,
    goals        int    NULL,
    assists      int    NULL,
    cards        int    NULL,
    minutes      int    NULL,
    CONSTRAINT player_observation_pk PRIMARY KEY (id)
);

-- Table: position
CREATE TABLE position
(
    id   serial     NOT NULL,
    code varchar(4) NOT NULL,
    CONSTRAINT position_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role
(
    id   serial      NOT NULL,
    name varchar(20) NOT NULL,
    CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user"
(
    id       serial       NOT NULL,
    role_id  int          NOT NULL,
    username varchar(20)  NOT NULL,
    email    varchar(50)  NOT NULL,
    password varchar(120) NOT NULL,
    status   char(1)      NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: city_country (table: city)
ALTER TABLE city
    ADD CONSTRAINT city_country
        FOREIGN KEY (country_id)
            REFERENCES country (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: club_city (table: club)
ALTER TABLE club
    ADD CONSTRAINT club_city
        FOREIGN KEY (city_id)
            REFERENCES city (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: club_league (table: club)
ALTER TABLE club
    ADD CONSTRAINT club_league
        FOREIGN KEY (league_id)
            REFERENCES league (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: country_confederation (table: country)
ALTER TABLE country
    ADD CONSTRAINT country_confederation
        FOREIGN KEY (confederation_id)
            REFERENCES confederation (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: flag_country (table: country_flag)
ALTER TABLE country_flag
    ADD CONSTRAINT flag_country
        FOREIGN KEY (country_id)
            REFERENCES country (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: game_club_home (table: game)
ALTER TABLE game
    ADD CONSTRAINT game_club_home
        FOREIGN KEY (home_club_id)
            REFERENCES club (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: league_country (table: league)
ALTER TABLE league
    ADD CONSTRAINT league_country
        FOREIGN KEY (country_id)
            REFERENCES country (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: next_game_game (table: next_game)
ALTER TABLE next_game
    ADD CONSTRAINT next_game_game
        FOREIGN KEY (game_id)
            REFERENCES game (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: next_game_player (table: next_game)
ALTER TABLE next_game
    ADD CONSTRAINT next_game_player
        FOREIGN KEY (player_id)
            REFERENCES player (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: observation_position_player_observation (table: observation_position)
ALTER TABLE observation_position
    ADD CONSTRAINT observation_position_player_observation
        FOREIGN KEY (player_observation_id)
            REFERENCES player_observation (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: observation_position_position (table: observation_position)
ALTER TABLE observation_position
    ADD CONSTRAINT observation_position_position
        FOREIGN KEY (position_id)
            REFERENCES position (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: player_club (table: player)
ALTER TABLE player
    ADD CONSTRAINT player_club
        FOREIGN KEY (club_id)
            REFERENCES club (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: player_data_player (table: player_details)
ALTER TABLE player_details
    ADD CONSTRAINT player_data_player
        FOREIGN KEY (player_id)
            REFERENCES player (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: player_observation_game (table: player_observation)
ALTER TABLE player_observation
    ADD CONSTRAINT player_observation_game
        FOREIGN KEY (game_id)
            REFERENCES game (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: player_observation_user (table: player_observation)
ALTER TABLE player_observation
    ADD CONSTRAINT player_observation_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: player_statistics_player (table: player_observation)
ALTER TABLE player_observation
    ADD CONSTRAINT player_statistics_player
        FOREIGN KEY (player_id)
            REFERENCES player (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: user_role (table: user)
ALTER TABLE "user"
    ADD CONSTRAINT user_role
        FOREIGN KEY (role_id)
            REFERENCES role (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- End of file.

