INSERT INTO aeronave VALUES (1, 50.0, 'PR512', 1 , 700.0)
INSERT INTO aeronave VALUES (2, 100.0, 'PP1050', 2 , 1000.0)
INSERT INTO aeronave VALUES (3, 75.0, 'PT13', 3 ,950.0)

INSERT INTO aerovia VALUES (1, 'POA', 'FLO', 700)
INSERT INTO aerovia VALUES (2, 'FLO', 'POA', 700)
INSERT INTO aerovia VALUES (3, 'FLO', 'CWB', 300)
INSERT INTO aerovia VALUES (4, 'CWB', 'FLO', 300)
INSERT INTO aerovia VALUES (5, 'CWB', 'GRU', 400)
INSERT INTO aerovia VALUES (6, 'GRU', 'CWB', 400)
INSERT INTO aerovia VALUES (7, 'GRU', 'POA', 1120)
INSERT INTO aerovia VALUES (8, 'POA', 'GRU', 1120)

INSERT INTO aeroporto VALUES (1, 'POA')
INSERT INTO aeroporto VALUES (2, 'FLO')
INSERT INTO aeroporto VALUES (3, 'CWB')
INSERT INTO aeroporto VALUES (4, 'GRU')

INSERT INTO plano_de_voo VALUES (1, 3500, FALSE, TIMESTAMP '2023-01-25 10:00:00', TIMESTAMP '2023-01-25 12:00:00', 1, 1, 98989, ARRAY [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0])
INSERT INTO plano_de_voo VALUES (2, 5500, FALSE, TIMESTAMP '2023-02-10 09:00:00', TIMESTAMP '2023-02-10 11:00:00', 2, 2, 45454, ARRAY [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0])
INSERT INTO plano_de_voo VALUES (3, 10500, FALSE, TIMESTAMP '2023-05-15 10:00:00', TIMESTAMP '2023-05-15 15:00:00', 3, 3, 63633, ARRAY [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1])
INSERT INTO plano_de_voo VALUES (4, 15500, FALSE, TIMESTAMP '2023-02-07 23:00:00', TIMESTAMP '2023-02-08 01:00:00', 4, 4, 12345, ARRAY [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0])
INSERT INTO plano_de_voo VALUES (51, 23500, FALSE, TIMESTAMP '2023-06-30 20:00:00', TIMESTAMP '2023-06-30 21:00:00', 5, 5, 54321, ARRAY [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0])