
INSERT INTO manager.role (id, name) VALUES (default, 'guest');
INSERT INTO manager.role (id, name) VALUES (default, 'scout');
INSERT INTO manager.role (id, name) VALUES (default, 'admin');
INSERT INTO manager.role (id, name) VALUES (default, 'coach');

INSERT INTO manager."user" (id, role_id, username, email, password, status) VALUES (default, 3, 'daniil', 'na', '123', 'A');
INSERT INTO manager."user" (id, role_id, username, email, password, status) VALUES (default, 2, 'kevin', 'na', '123', 'A');
INSERT INTO manager."user" (id, role_id, username, email, password, status) VALUES (default, 2, 'uve', 'na', '123', 'A');

INSERT INTO manager.confederation (id, name, description) VALUES (default, 'UEFA', 'Union of European Football Associations');
INSERT INTO manager.confederation (id, name, description) VALUES (default, 'CONCACAF', 'Confederation of North, Central American and Caribbean Association Football');
INSERT INTO manager.confederation (id, name, description) VALUES (default, 'CONMEBOL', 'Confederación Sudamericana de Fútbol');
INSERT INTO manager.confederation (id, name, description) VALUES (default, 'CAF', 'Confederation of African Football');
INSERT INTO manager.confederation (id, name, description) VALUES (default, 'AFC', 'Asian Football Confederation');
INSERT INTO manager.confederation (id, name, description) VALUES (default, 'OFC', 'Oceania Football Confederation');

INSERT INTO manager.country (id, confederation_id, name) VALUES (1, 1, 'Albania');
INSERT INTO manager.country (id, confederation_id, name) VALUES (2, 1, 'Andorra');
INSERT INTO manager.country (id, confederation_id, name) VALUES (3, 1, 'Armenia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (4, 1, 'Austria');
INSERT INTO manager.country (id, confederation_id, name) VALUES (5, 1, 'Azerbaijan');
INSERT INTO manager.country (id, confederation_id, name) VALUES (6, 1, 'Belarus');
INSERT INTO manager.country (id, confederation_id, name) VALUES (7, 1, 'Belgium');
INSERT INTO manager.country (id, confederation_id, name) VALUES (8, 1, 'Bosnia and Herzegovina');
INSERT INTO manager.country (id, confederation_id, name) VALUES (9, 1, 'Bulgaria');
INSERT INTO manager.country (id, confederation_id, name) VALUES (10, 1, 'Croatia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (11, 1, 'Cyprus');
INSERT INTO manager.country (id, confederation_id, name) VALUES (12, 1, 'Czech Republic');
INSERT INTO manager.country (id, confederation_id, name) VALUES (13, 1, 'Denmark');
INSERT INTO manager.country (id, confederation_id, name) VALUES (14, 1, 'England');
INSERT INTO manager.country (id, confederation_id, name) VALUES (15, 1, 'Estonia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (16, 1, 'Faroe Islands');
INSERT INTO manager.country (id, confederation_id, name) VALUES (17, 1, 'Finland');
INSERT INTO manager.country (id, confederation_id, name) VALUES (18, 1, 'France');
INSERT INTO manager.country (id, confederation_id, name) VALUES (19, 1, 'Georgia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (20, 1, 'Germany');
INSERT INTO manager.country (id, confederation_id, name) VALUES (21, 1, 'Gibraltar');
INSERT INTO manager.country (id, confederation_id, name) VALUES (22, 1, 'Greece');
INSERT INTO manager.country (id, confederation_id, name) VALUES (23, 1, 'Hungary');
INSERT INTO manager.country (id, confederation_id, name) VALUES (24, 1, 'Iceland');
INSERT INTO manager.country (id, confederation_id, name) VALUES (25, 1, 'Republic of Ireland');
INSERT INTO manager.country (id, confederation_id, name) VALUES (26, 1, 'Israel');
INSERT INTO manager.country (id, confederation_id, name) VALUES (27, 1, 'Italy');
INSERT INTO manager.country (id, confederation_id, name) VALUES (28, 1, 'Kazakhstan');
INSERT INTO manager.country (id, confederation_id, name) VALUES (29, 1, 'Kosovo');
INSERT INTO manager.country (id, confederation_id, name) VALUES (30, 1, 'Latvia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (31, 1, 'Liechtenstein');
INSERT INTO manager.country (id, confederation_id, name) VALUES (32, 1, 'Lithuania');
INSERT INTO manager.country (id, confederation_id, name) VALUES (33, 1, 'Luxembourg');
INSERT INTO manager.country (id, confederation_id, name) VALUES (34, 1, 'Malta');
INSERT INTO manager.country (id, confederation_id, name) VALUES (35, 1, 'Moldova');
INSERT INTO manager.country (id, confederation_id, name) VALUES (36, 1, 'Montenegro');
INSERT INTO manager.country (id, confederation_id, name) VALUES (37, 1, 'Netherlands');
INSERT INTO manager.country (id, confederation_id, name) VALUES (38, 1, 'North Macedonia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (39, 1, 'Northern Ireland');
INSERT INTO manager.country (id, confederation_id, name) VALUES (40, 1, 'Norway');
INSERT INTO manager.country (id, confederation_id, name) VALUES (41, 1, 'Poland');
INSERT INTO manager.country (id, confederation_id, name) VALUES (42, 1, 'Portugal');
INSERT INTO manager.country (id, confederation_id, name) VALUES (43, 1, 'Romania');
INSERT INTO manager.country (id, confederation_id, name) VALUES (44, 1, 'Russia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (45, 1, 'San Marino');
INSERT INTO manager.country (id, confederation_id, name) VALUES (46, 1, 'Scotland');
INSERT INTO manager.country (id, confederation_id, name) VALUES (47, 1, 'Serbia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (48, 1, 'Slovakia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (49, 1, 'Slovenia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (50, 1, 'Spain');
INSERT INTO manager.country (id, confederation_id, name) VALUES (51, 1, 'Sweden');
INSERT INTO manager.country (id, confederation_id, name) VALUES (52, 1, 'Switzerland');
INSERT INTO manager.country (id, confederation_id, name) VALUES (53, 1, 'Turkey');
INSERT INTO manager.country (id, confederation_id, name) VALUES (54, 1, 'Ukraine');
INSERT INTO manager.country (id, confederation_id, name) VALUES (55, 1, 'Wales');
INSERT INTO manager.country (id, confederation_id, name) VALUES (56, 3, 'Argentina');
INSERT INTO manager.country (id, confederation_id, name) VALUES (57, 3, 'Bolivia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (58, 3, 'Brazil');
INSERT INTO manager.country (id, confederation_id, name) VALUES (59, 3, 'Chile');
INSERT INTO manager.country (id, confederation_id, name) VALUES (60, 3, 'Colombia');
INSERT INTO manager.country (id, confederation_id, name) VALUES (61, 3, 'Ecuador');
INSERT INTO manager.country (id, confederation_id, name) VALUES (62, 3, 'Paraguay');
INSERT INTO manager.country (id, confederation_id, name) VALUES (63, 3, 'Peru');
INSERT INTO manager.country (id, confederation_id, name) VALUES (64, 3, 'Uruguay');
INSERT INTO manager.country (id, confederation_id, name) VALUES (65, 3, 'Venezuela');


INSERT INTO manager.league (id, country_id, name) VALUES (default, 16, 'Meistriliiga');
INSERT INTO manager.league (id, country_id, name) VALUES (default, 16, 'Esiliiga');
INSERT INTO manager.league (id, country_id, name) VALUES (default, 16, 'Esiliiga B');
INSERT INTO manager.league (id, country_id, name) VALUES (default, 16, 'II liiga');
INSERT INTO manager.league (id, country_id, name) VALUES (default, 16, 'III liiga');
INSERT INTO manager.league (id, country_id, name) VALUES (default, 16, 'IV liiga');

INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 1, null, 'Tallinna FC Flora');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 1, null, 'FCI Tallinn');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 1, null, 'Tallinna FC Levadia');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 1, null, 'JK Narva Trans');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 1, null, 'Nõmme Kalju FC');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 1, null, 'Paide Linnameeskond');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 1, null, 'Pärnu JK Vaprus');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 1, null, 'JK Sillamäe Kalev');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 1, null, 'Tartu JK Tammeka');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 1, null, 'Viljandi JK Tulevik');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 2, null, 'Rakvere JK Tarvas');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 2, null, 'Maardu Linnameeskond');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 2, null, 'Tartu FC Santos');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 2, null, 'JK Tallinna Kalev');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 2, null, 'FCI Tallinn U21');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 2, null, 'Tallinna FC Levadia U21');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 2, null, 'Tallinna FC Flora U21');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 2, null, 'FC Elva');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 2, null, 'FC Kuressaare');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 2, null, 'Tartu JK Welco');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 3, null, 'JK Vändra Vaprus');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 3, null, 'Nõmme Kalju FC U21');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 3, null, 'Paide Linnameeskond U21');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 3, null, 'Kohtla-Järve JK Järve');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 3, null, 'Raasiku FC Joker');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 3, null, 'Tartu JK Tammeka U21');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 3, null, 'Viimsi JK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 3, null, 'JK Sillamäe Kalev U21');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 3, null, 'JK Tallinna Kalev U21');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 3, null, 'Keila JK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Tallinna JK Legion');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Võru FC Helios');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Jõgeva SK Noorus-96');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Tartu FC Merkuur');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Lasnamäe FC Ajax');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Tallinna FC Levadia III');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Narva United');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Tallinna JK Piraaja');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Tallinna JK Dünamo');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Maardu Linnameeskond II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Tartu FC Santos II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Maardu United');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'FC Ararat Tallinn');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Kohtla-Järve JK Järve II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'FC Nõmme United');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Pärnu JK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Saue JK Laagri');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Viljandi JK Tulevik U21');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'JK Tabasalu');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'JK Ganvix Türi');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Raplamaa JK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Tallinna FC Flora U19');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'FC Otepää');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'FC Kuressaare II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Tõrva JK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Pärnu JK Vaprus II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'SK Imavere');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 4, null, 'Viimsi JK II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Põhja-Tallinna JK Volta');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna FC Hell Hunt');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'JK Tallinna Kalev III');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'JK Retro');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna FC Eston Villa');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Rumori Calcio Tallinn');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Pirita Reliikvia');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Harju JK Laagri');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Saku Sporting');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Nõmme Kalju FC III');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Kristiine JK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna KSK FC Štrommi');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tartu JK Welco II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Tarvastu');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Vastseliina');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'SK Tääksi');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Tartu');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tartu JK Tammeka U19');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Viljandi JK Tulevik III');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Jõgeva Wolves');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Suure-Jaani United');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'EMÜ SK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tartu Ülikool Fauna');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Navi Vutiselts');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Paide Linnameeskond III');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FCI Tallinn III');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'JK Väätsa Vald');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Järva-Jaani');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Raasiku FC Joker II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Koeru JK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Ambla Vallameeskond');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'JK Loo');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Kuusalu JK Rada');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Helios Tartu');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Lasnamäe FC Ajax II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna JK Augur');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Pärnu JK Poseidon');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna FC Castovanni Eagles');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Lihula JK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Kärdla Linnameeskond');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Läänemaa JK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Zenit Tallinn');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Rummu Dünamo');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Kose');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'JK Kernu Kadakas');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Lelle');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Raplamaa JK II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Pakri SK Alexela');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna FC Zapoos');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna Depoo');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna FC Olympic Olybet');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Anija JK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna JK Piraaja II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Maardu Aliens');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Rakvere JK Tarvas II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna JK Jalgpallihaigla');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Haapsalu JK');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Kohila Püsivus');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna FC Soccernet');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Maarjamäe FC Igiliikur');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna FC Transferwise');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Toompea');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Keila JK II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Põhja-Tallinna JK Volta II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna FC Reaal');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tallinna Majandusmagistri Jalgpalliselts');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Valga FC Warrior');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Võru FC Helios II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Pärnu JK Poseidon II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Elva II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Põlva FC Lootos');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FCP Pärnu');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'FC Jõgeva Wolves II');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Viljandi JK Tulevik IV');
INSERT INTO manager.club (id, league_id, city_id, name) VALUES (default, 5, null, 'Tõrva JK II');

INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 1, 'Lionel Messi', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 2, 'Cristiano Ronaldo', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 3, 'Robert Lewandowski', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 4, 'Kevin De Bruyne', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 5, 'Kylian Mbappe', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 6, 'Neymar Jr.', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 7, 'Mohamed Salah', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 8, 'Virgil van Dijk', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 9, 'Manuel Neuer', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 10, 'Luka Modric', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 11, 'Sergio Aguero', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 12, 'Luis Suarez', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 13, 'Erling Haaland', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 14, 'Gianluigi Donnarumma', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 15, 'Gareth Bale', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 16, 'Sergio Ramos', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 17, 'Harry Kane', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 18, 'Bruno Fernandes', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 19, 'Eden Hazard', 'A');
INSERT INTO manager.player (id, club_id, name, status) VALUES (default, 20, 'Sadio Mane', 'A');

INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 1, 'M', 34, '1987-06-24', 170, 72, 'ARG', 'L');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 2, 'M', 37, '1985-02-05', 187, 83, 'POR', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 3, 'M', 33, '1988-08-21', 185, 81, 'POL', 'B');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 4, 'M', 30, '1991-06-28', 181, 70, 'BEL', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 5, 'M', 23, '1998-12-20', 178, 73, 'FRA', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 6, 'M', 30, '1992-02-05', 175, 68, 'BRA', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 7, 'M', 29, '1992-06-15', 175, 71, 'EGY', 'L');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 8, 'M', 21, '2000-07-21', 194, 88, 'NED', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 9, 'M', 34, '1987-12-19', 185, 81, 'GER', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 10, 'M', 31, '1990-06-24', 180, 68, 'CRO', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 11, 'M', 30, '1992-05-02', 168, 70, 'ARG', 'L');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 12, 'M', 33, '1988-03-24', 170, 75, 'URY', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 13, 'M', 26, '1995-03-20', 177, 73, 'NOR', 'L');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 14, 'M', 29, '1992-07-21', 173, 68, 'ITA', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 15, 'M', 32, '1989-06-11', 170, 72, 'WAL', 'L');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 16, 'M', 34, '1987-10-19', 169, 70, 'ESP', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 17, 'M', 25, '1996-02-11', 180, 77, 'ENG', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 18, 'M', 27, '1994-07-11', 174, 71, 'POR', 'R');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 19, 'M', 28, '1993-01-24', 185, 80, 'BEL', 'L');
INSERT INTO manager.player_details (id, player_id, gender, age, birth_date, height, weight, nationality, best_foot) VALUES (default, 20, 'M', 29, '1992-04-15', 182, 78, 'SEN', 'R');
