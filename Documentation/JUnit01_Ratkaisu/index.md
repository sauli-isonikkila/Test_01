# Kirja -luokka:
Kirja luokka, johon voi sijoittaa kirjan tietoja.


![Esimerkkiajo](./Kuva_01.PNG)<br>
Kuva 1. Tietorakenne

# Ominaisuudet:
String nimi
String tekija
int julkaisuVuosi


# Metodit:

# boolean setJulkaisuVuosi(int julkaisuVuosi)
Kirjan julkaisuvuoden asettamiseen tarkoitettu metodi. Tarkastaa, ettei julkaisuVuodeksi ole annettu negatiivista kokonaisnumeroa.

Algoritmit:
![Esimerkkiajo](./Kuva_02.PNG)<br>
Kuva 2. Vuokaavio

Esimerkki 1:

Kirja kija1 = new Kirja();
boolean onkoJulkaisuVuosiOk = setJulkaisuVuosi(-10);

Palauttaa arvon false

Esimerkki 2:

Kirja kija1 = new Kirja();
boolean onkoJulkaisuVuosiOk = setJulkaisuVuosi(2023);

Palauttaa arvon true

