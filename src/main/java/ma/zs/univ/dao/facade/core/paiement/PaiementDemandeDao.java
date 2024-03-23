package ma.zs.univ.dao.facade.core.paiement;

import org.springframework.data.jpa.repository.Query;
import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.paiement.PaiementDemande;
import org.springframework.stereotype.Repository;
import ma.zs.univ.bean.core.paiement.PaiementDemande;
import java.util.List;


@Repository
public interface PaiementDemandeDao extends AbstractRepository<PaiementDemande,Long>  {
    PaiementDemande findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW PaiementDemande(item.id,item.libelle) FROM PaiementDemande item")
    List<PaiementDemande> findAllOptimized();

}
