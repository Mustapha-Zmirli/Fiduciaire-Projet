package ma.zs.univ.service.impl.admin.paiement;


import ma.zs.univ.bean.core.paiement.PaiementDemande;
import ma.zs.univ.dao.criteria.core.paiement.PaiementDemandeCriteria;
import ma.zs.univ.dao.facade.core.paiement.PaiementDemandeDao;
import ma.zs.univ.dao.specification.core.paiement.PaiementDemandeSpecification;
import ma.zs.univ.service.facade.admin.paiement.PaiementDemandeAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class PaiementDemandeAdminServiceImpl extends AbstractServiceImpl<PaiementDemande, PaiementDemandeCriteria, PaiementDemandeDao> implements PaiementDemandeAdminService {






    public PaiementDemande findByReferenceEntity(PaiementDemande t){
        return  dao.findByCode(t.getCode());
    }


    public List<PaiementDemande> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(PaiementDemande.class, PaiementDemandeSpecification.class);
    }



    public PaiementDemandeAdminServiceImpl(PaiementDemandeDao dao) {
        super(dao);
    }

}
