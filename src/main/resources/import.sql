INSERT INTO tb_roles(authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_roles(authority) VALUES ('ROLE_USER');

INSERT INTO tb_users(email, nome, password, role_id) VALUES ('admin@admin.com','Admin','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG',  1);
INSERT INTO tb_users(email, nome, password, role_id) VALUES ('maria@gmail.com','Maria','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG',  2);


-- INSERT INTO tb_users(email) VALUES ('maria@gmail.com');
-- INSERT INTO tb_users(email) VALUES ('joao@gmail.com');
-- INSERT INTO tb_users(email) VALUES ('ana@gmail.com');
-- INSERT INTO tb_users(email) VALUES ('lucia@gmail.com');
-- INSERT INTO tb_users(email) VALUES ('joaquim@gmail.com');
--
-- INSERT INTO tb_animes(rating, count, title, image, description) VALUES (4.5, 2, 'Demon Slayer: Kimetsu no Yaiba', 'https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/f7adcedd1d7c53ae18d851003a3cfae4.jpeg', 'Japão, era Taisho. Tanjiro, um bondoso jovem que ganha a vida vendendo carvão, descobre que sua família foi massacrada por um demônio. E pra piorar, Nezuko, sua irmã mais nova e única sobrevivente, também foi transformada num demônio. Arrasado com esta sombria realidade, Tanjiro decide se tornar um matador de demônios para fazer sua irmã voltar a ser humana, e para matar o demônio que matou sua família. Um triste conto sobre dois irmãos, onde os destinos dos humanos e dos demônios se entrelaçam, começa agora.');
-- INSERT INTO tb_animes(rating, count, title, image, description) VALUES (3.3, 3, 'ORIENT', 'https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/18f146b8a59b3379c68c208e84b29235.jpeg', 'Durante a Era dos Reinos Combatentes na terra de Hinomoto, todos os generais foram derrotados um a um pelos demoníacos Kishin, pondo um fim ao domínio da humanidade. Por 150 anos, indivíduos continuaram a resistir aos Kishin e buscar a liberdade, formando as chamadas Tropas Bushi. Quando jovem, Musashi e Kojiro sonhavam em formar a Tropa Bushi mais forte de todas - mas numa vila que idolatrava os Kishin, Tropas Bushi eram consideradas tabu. Mesmo contra todas as possibilidades, Musashi e Kojiro se unem contra as forças opressoras para um dia realizar seu sonho!');
-- INSERT INTO tb_animes(rating, count, title, image, description) VALUES (3.3, 3, 'Attack on Titan', 'https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/9daa2f17d7ad2727d72fdeaae6e232de.jpeg', 'Eren Jaeger jurou eliminar todos os Titãs, mas em uma batalha desesperada ele se torna aquilo que mais odeia. Com seus novos poderes, ele luta pela liberdade da humanidade, combatendo os monstros que ameaçam seu lar. Mesmo depois de derrotar a Titã Fêmea, Eren não consegue descansar - uma horda de Titãs se aproximam da Muralha Rose e a batalha em nome da humanidade continua!');
-- INSERT INTO tb_animes(rating, count, title, image, description) VALUES (0, 0, 'Platinum End', 'https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/f94fdc0422beed08e6e543eaf13868ce.jpeg', 'Mirai Kakehashi perdeu os pais em um acidente e viveu em tristeza com os parentes que o adoraram. Tendo perdido a esperança, ele pulou do telhado de um prédio no dia da sua formatura. Foi aí que conheceu um anjo.');
-- INSERT INTO tb_animes(rating, count, title, image, description) VALUES (0, 0, 'The Strongest Sage With the Weakest Crest', 'https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/21c28c17d306f6ba2640f37a20f93490.jpeg', 'Apesar de ser o feiticeiro mais poderoso do mundo, o poder de Mathias é limitado graças ao brasão mágico com o qual nasceu. Convencido de que a única forma de se tornar ainda mais poderoso é reencarnando com o brasão correto, Mathias renasce no corpo de um jovem com o melhor dos brasões na primeira tentativa! Infelizmente, ele descobre que nasceu num mundo onde muito do conhecimento mágico se perdeu, e todos o consideram fadado ao fracasso. Caberá a Mathias provar que todos estão errados... na base da força bruta!');
-- INSERT INTO tb_animes(rating, count, title, image, description) VALUES (0, 0, 'Tokyo 24th Ward', 'https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/c9c0ed5bc3deb6b4fcbdb3eac7ae645b.jpeg', 'A Região Administrativa Especial do Extremo Oriente, também conhecida como 24º Distrito, é uma ilha artificial que flutua na Baía de Tóquio. Nascidos na ilha, os amigos Shuta, Ran e Koki sempre andavam juntos, até que um acidente os separou para sempre. Anos depois, o telefone dos três toca ao mesmo tempo, e alguém no outro lado da linha exige que eles tomem uma decisão sobre seu futuro. Agora, os três amigos terão de fazer o que acreditam ser necessário para proteger o 24º Distrito e seus habitantes.');
-- INSERT INTO tb_animes(rating, count, title, image, description) VALUES (3.3, 3, 'SABIKUI BISCO', 'https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/10c808d2548ed4dbb54f7cce4c1ea979.jpeg', 'O Japão foi devastado pelo Vento da Ferrugem, que enferruja a tudo e todos, corroendo tanto as cidadas quanto seus moradores. Para salvar seu mestre moribundo, um jovem chamado Bisco Akaboshi parte numa jornada para encontrar o milagroso Cogumelo Come-Ferrugem, capaz de eliminar todo tipo de ferrugem. No caminho, ele encontra um jovem doutor chamado Milo Nekoyanagi, que estuda uma maneira de curar a ferrugem que consome sua querida irmã mais velha.');
-- INSERT INTO tb_animes(rating, count, title, image, description) VALUES (0, 0, 'The Worlds Finest Assassin Gets Reincarnated in Another World as an Aristocrat', 'https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/0774ee81c127face1b288ef788bb51c8.jpeg', 'O assassino número um do mundo foi reencarnou como o filho mais velho de uma família de assassinos aristocratas. Em troca de reencarnar em outro mundo, uma deusa lhe impôs uma condição.');
-- INSERT INTO tb_animes(rating, count, title, image, description) VALUES (0, 0, 'Seirei Gensouki: Spirit Chronicles', 'https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/2b2f015ed1adf726347dd4df8bc41df3.jpeg', 'Sua vida passada e presente estão entremeadas - um jovem com memórias de duas vidas distintas enfrenta seu destino! Rio perdeu a sua mãe quando ainda era jovem, e foi obrigado a lutar pra sobreviver na favela. Certo dia, despertam nele as memórias de Haruto Amakawa, fazendo Rio perceber que reencarnou num mundo de espada e magia. E ao impedir por acaso o sequestro de uma princesa, ele acaba sendo matriculado numa renomada escola para os filhos da nobreza... Tentando galgar os degraus da hierarquia social, muitos encontros e despedidas aguardam Rio em sua luta para superar seu destino.');
-- INSERT INTO tb_animes(rating, count, title, image, description) VALUES (0, 0, 'Black Clover', 'https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/0273e80242d80b0218f640e038269c18.jpeg', 'Num mundo onde magia é tudo, Asta e Yuno são abandonados em uma igreja no mesmo dia. Enquanto Yuno possui poderes mágicos excepcionais, Asta é a única pessoa do mundo todo desprovida desse dom. Aos quinze anos, ambos recebem grimórios - livros mágicos que amplificam os poderes do detentor. Asta recebe um raro grimório de anti-magia, capaz de negar e repelir os feitiços do oponente. Dois opostos que nutrem uma rivalidade amigável, Yuno e Asta estão prontos para encarar os mais difíceis desafios para conquistar seu sonho em comum: tornar-se o Rei dos Feiticeiros. Desistir não é opção!');
-- INSERT INTO tb_animes(rating, count, title, image, description) VALUES (0, 0, 'The God of High School: A Guerra dos Clones', 'https://beta.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/f5507ec17b372d049a7d7d3e0634c31f.jpeg', 'Jin Mori diz a todos que é o colegial mais forte que existe. Sua vida muda quando é convidado a participar do "God of High School", um torneio que decidirá quem é o colegial mais forte de todos, e que garantirá ao vencedor a realização de qualquer desejo que ele tiver. Todos os participantes são poderosos guerreiros que lutarão com afinco para alcançar seus sonhos. Uma batalha caótica entre lutadores colegiais inacreditavelmente fortes está prestes a começar!');
--
--
--
-- INSERT INTO tb_ratings(anime_id, user_id, value) VALUES (1, 1, 5.0);
-- INSERT INTO tb_ratings(anime_id, user_id, value) VALUES (1, 2, 4.0);
-- INSERT INTO tb_ratings(anime_id, user_id, value) VALUES (2, 1, 3.0);
-- INSERT INTO tb_ratings(anime_id, user_id, value) VALUES (2, 2, 3.0);
-- INSERT INTO tb_ratings(anime_id, user_id, value) VALUES (2, 3, 4.0);