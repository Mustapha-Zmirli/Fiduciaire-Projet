package ma.zs.univ.service.impl.admin.demande;


import ma.zs.univ.bean.core.demande.Demande;
import ma.zs.univ.dao.criteria.core.demande.DemandeCriteria;
import ma.zs.univ.dao.facade.core.demande.DemandeDao;
import ma.zs.univ.dao.specification.core.demande.DemandeSpecification;
import ma.zs.univ.service.facade.admin.demande.DemandeAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.univ.service.facade.admin.commun.SocieteAdminService ;
import ma.zs.univ.bean.core.commun.Societe ;
import ma.zs.univ.service.facade.admin.commun.ComptableAdminService ;
import ma.zs.univ.bean.core.commun.Comptable ;

import java.util.List;
@Service
public class DemandeAdminServiceImpl extends AbstractServiceImpl<Demande, DemandeCriteria, DemandeDao> implements DemandeAdminService {






    public Demande findByReferenceEntity(Demande t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(Demande t){
        if( t != null) {
            t.setSociete(societeService.findOrSave(t.getSociete()));
            t.setComptableTraitant(comptableService.findOrSave(t.getComptableTraitant()));
            t.setComptableValidateur(comptableService.findOrSave(t.getComptableValidateur()));
        }
    }

    public List<Demande> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }
    public long countBySocieteCode(String code){
        return dao.countBySocieteCode(code);
    }
    public List<Demande> findByComptableTraitantId(Long id){
        return dao.findByComptableTraitantId(id);
    }
    public int deleteByComptableTraitantId(Long id){
        return dao.deleteByComptableTraitantId(id);
    }
    public long countByComptableTraitantCin(String cin){
        return dao.countByComptableTraitantCin(cin);
    }
    public List<Demande> findByComptableValidateurId(Long id){
        return dao.findByComptableValidateurId(id);
    }
    public int deleteByComptableValidateurId(Long id){
        return dao.deleteByComptableValidateurId(id);
    }
    public long countByComptableValidateurCin(String cin){
        return dao.countByComptableValidateurCin(cin);
    }

    public List<Demande> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(Demande.class, DemandeSpecification.class);
    }


    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private ComptableAdminService comptableService ;

    public DemandeAdminServiceImpl(DemandeDao dao) {
        super(dao);
    }

}
