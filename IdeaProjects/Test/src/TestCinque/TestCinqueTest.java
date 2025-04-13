package TestCinque;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TestCinqueTest {

    @Test
    public void main() {

        OffsetDateTime dataEOra = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String annoVecchio = String.valueOf(dataEOra.getYear());
        String mese = String.valueOf(dataEOra.getMonth());

        assertNotNull(dataEOra);
        assertTrue(annoVecchio.contains("2023"));
        assertTrue(mese.contains("MARCH"));

        OffsetDateTime dataAggiornata = dataEOra.plusYears(1).minusMonths(1).plusDays(7);
        String annoPlus = String.valueOf(dataAggiornata.getYear());
        String meseMinus = String.valueOf(dataAggiornata.getMonth());
        String giornoPlus = String.valueOf(dataAggiornata.getDayOfWeek());

        assertNotNull(dataAggiornata);
        assertTrue(annoPlus.contains("2024"), "L'anno dovrebbe essere il 2024");
        assertTrue(meseMinus.contains("FEBRUARY") || meseMinus.contains("02"), "Il mese dovrebbere essere Febbraio");
        assertTrue(giornoPlus.contains("08") || giornoPlus.contains("8"), "Il giorno dovrebbere essere l'8");


    }
}