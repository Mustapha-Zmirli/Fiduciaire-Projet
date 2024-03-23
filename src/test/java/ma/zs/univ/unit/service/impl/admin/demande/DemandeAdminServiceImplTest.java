package ma.zs.univ.unit.service.impl.admin.demande;

import ma.zs.univ.bean.core.demande.Demande;
import ma.zs.univ.dao.facade.core.demande.DemandeDao;
import ma.zs.univ.service.impl.admin.demande.DemandeAdminServiceImpl;

import ma.zs.univ.bean.core.commun.Societe ;
import ma.zs.univ.bean.core.commun.Comptable ;
import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.time.LocalDateTime;



import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
class DemandeAdminServiceImplTest {

    @Mock
    private DemandeDao repository;
    private AutoCloseable autoCloseable;
    private DemandeAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new DemandeAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllDemande() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveDemande() {
        // Given
        Demande toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteDemande() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetDemandeById() {
        // Given
        Long idToRetrieve = 1L; // Example Demande ID to retrieve
        Demande expected = new Demande(); // You need to replace Demande with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        Demande result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private Demande constructSample(int i) {
		Demande given = new Demande();
        given.setId(id);
        given.setCode("code-"+i);
        given.setCode(code);
        given.setLibelle("libelle-"+i);
        given.setLibelle(libelle);
        given.setDateDemande(LocalDateTime.now());
        given.setDateDemande(dateDemande);
        given.setDateExigibilite(LocalDateTime.now());
        given.setDateExigibilite(dateExigibilite);
        given.setSociete(new Societe(1L));
        given.setSociete(societe);
        given.setTypeDemande("typeDemande-"+i);
        given.setTypeDemande(typeDemande);
        given.setEtatDemande("etatDemande-"+i);
        given.setEtatDemande(etatDemande);
        given.setDateValidation(LocalDateTime.now());
        given.setDateValidation(dateValidation);
        given.setDateTraitement(LocalDateTime.now());
        given.setDateTraitement(dateTraitement);
        given.setComptableTraitant(new Comptable(1L));
        given.setComptableTraitant(comptableTraitant);
        given.setComptableValidateur(new Comptable(1L));
        given.setComptableValidateur(comptableValidateur);
        return given;
    }

}
