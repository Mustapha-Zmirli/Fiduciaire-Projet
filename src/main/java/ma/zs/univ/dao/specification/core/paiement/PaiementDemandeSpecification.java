package  ma.zs.univ.dao.specification.core.paiement;

import ma.zs.univ.dao.criteria.core.paiement.PaiementDemandeCriteria;
import ma.zs.univ.bean.core.paiement.PaiementDemande;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class PaiementDemandeSpecification extends  AbstractSpecification<PaiementDemandeCriteria, PaiementDemande>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public PaiementDemandeSpecification(PaiementDemandeCriteria criteria) {
        super(criteria);
    }

    public PaiementDemandeSpecification(PaiementDemandeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
