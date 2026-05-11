-----------bolnica -----------------------------------------------------

INSERT INTO bolnica(id, naziv, adresa, budzet)
VALUES
(1, 'Klinicki centar Vojvodine', 'Novi Sad', 5000000),
(2, 'Opsta bolnica Nis', 'Nis', 3000000);

----------- dijagnoza -----------------------------------------------------

INSERT INTO dijagnoza(id, naziv, opis, oznaka)
VALUES
(1, 'Hipertenzija', 'Povisen krvni pritisak', 'I10'),
(2, 'Dijabetes', 'Poremecaj nivoa secera u krvi', 'E11'),
(3, 'Bronhitis', 'Upala disajnih puteva', 'J20');

----------- odeljenje -----------------------------------------------------

INSERT INTO odeljenje(id, naziv, lokacija, bolnica_id)
VALUES
(1, 'Kardiologija', 'Prvi sprat', 1),
(2, 'Endokrinologija', 'Drugi sprat', 1),
(3, 'Pulmologija', 'Prizemlje', 2);

----------- pacijent -----------------------------------------------------

INSERT INTO pacijent(id, ime, prezime, zdr_osiguranje, datum_rodjenja, odeljenje_id, dijagnoza_id)
VALUES
(1, 'Marko', 'Markovic', true, '1999-05-10', 1, 1),
(2, 'Ana', 'Jovanovic', true, '2001-03-15', 2, 2),
(3, 'Petar', 'Petrovic', false, '1988-11-22', 3, 3);