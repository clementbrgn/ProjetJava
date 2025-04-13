package fr.cytech.gestiontrisellectif.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class ContratPartenariatTest {
    private ContratPartenariat contrat;

    @BeforeEach
    void setUp() {
        contrat = new ContratPartenariat(1, LocalDate.now().minusDays(1).toString(), LocalDate.now().plusDays(30).toString());
    }

    @Test
    void testConstructeur() {
        assertEquals(1, contrat.getIdContratPartenariat());
        assertNotNull(contrat.getDateDebut());
        assertNotNull(contrat.getDateFin());
        assertNotNull(contrat.getRegles());
        assertTrue(contrat.getRegles().isEmpty());
        assertEquals("", contrat.getConditionsUtilisation());
    }

    @Test
    void testAjouterRegle() {
        ReglePoints regle = new ReglePoints(10, "VERRE");
        contrat.ajouterRegle(regle);
        assertEquals(1, contrat.getRegles().size());
        assertTrue(contrat.getRegles().contains(regle));
    }

    @Test
    void testEstValide() {
        assertTrue(contrat.estValide(), "Le contrat devrait être valide car la date actuelle est entre dateDebut et dateFin");

        ContratPartenariat contratExpire = new ContratPartenariat(2, 
            LocalDate.now().minusDays(30).toString(), 
            LocalDate.now().minusDays(1).toString());
        assertFalse(contratExpire.estValide(), "Le contrat devrait être invalide car il a expiré");

        ContratPartenariat contratFutur = new ContratPartenariat(3,
            LocalDate.now().plusDays(1).toString(),
            LocalDate.now().plusDays(30).toString());
        assertFalse(contratFutur.estValide(), "Le contrat devrait être invalide car il n'a pas encore commencé");
    }

    @Test
    void testConditionsUtilisation() {
        String conditions = "Minimum d'achat: 50€";
        contrat.setConditionsUtilisation(conditions);
        assertEquals(conditions, contrat.getConditionsUtilisation());
    }
} 