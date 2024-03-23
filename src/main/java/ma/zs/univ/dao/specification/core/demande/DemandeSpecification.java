package  ma.zs.univ.dao.specification.core.demande;

import ma.zs.univ.dao.criteria.core.demande.DemandeCriteria;
import ma.zs.univ.bean.core.demande.Demande;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class DemandeSpecification extends  AbstractSpecification<DemandeCriteria, Demande>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("dateDemande", criteria.getDateDemande(), criteria.getDateDemandeFrom(), criteria.getDateDemandeTo());
        addPredicate("dateExigibilite", criteria.getDateExigibilite(), criteria.getDateExigibiliteFrom(), criteria.getDateExigibiliteTo());
        addPredicate("typeDemande", criteria.getTypeDemande(),criteria.getTypeDemandeLike());
        addPredicate("etatDemande", criteria.getEtatDemande(),criteria.getEtatDemandeLike());
        addPredicate("dateValidation", criteria.getDateValidation(), criteria.getDateValidationFrom(), criteria.getDateValidationTo());
        addPredicate("dateTraitement", criteria.getDateTraitement(), criteria.getDateTraitementFrom(), criteria.getDateTraitementTo());
        addPredicateFk("societe","id", criteria.getSociete()==null?null:criteria.getSociete().getId());
        addPredicateFk("societe","id", criteria.getSocietes());
        addPredicateFk("societe","code", criteria.getSociete()==null?null:criteria.getSociete().getCode());
        addPredicateFk("comptableTraitant","id", criteria.getComptableTraitant()==null?null:criteria.getComptableTraitant().getId());
        addPredicateFk("comptableTraitant","id", criteria.getComptableTraitants());
        addPredicateFk("comptableTraitant","cin", criteria.getComptableTraitant()==null?null:criteria.getComptableTraitant().getCin());
        addPredicateFk("comptableValidateur","id", criteria.getComptableValidateur()==null?null:criteria.getComptableValidateur().getId());
        addPredicateFk("comptableValidateur","id", criteria.getComptableValidateurs());
        addPredicateFk("comptableValidateur","cin", criteria.getComptableValidateur()==null?null:criteria.getComptableValidateur().getCin());
    }

    public DemandeSpecification(DemandeCriteria criteria) {
        super(criteria);
    }

    public DemandeSpecification(DemandeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
