package ma.zs.univ.service.impl.admin.paiement;


import ma.zs.univ.bean.core.paiement.TypePaiement;
import ma.zs.univ.dao.criteria.core.paiement.TypePaiementCriteria;
import ma.zs.univ.dao.facade.core.paiement.TypePaiementDao;
import ma.zs.univ.dao.specification.core.paiement.TypePaiementSpecification;
import ma.zs.univ.service.facade.admin.paiement.TypePaiementAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePaiementAdminServiceImpl extends AbstractServiceImpl<TypePaiement, TypePaiementCriteria, TypePaiementDao> implements TypePaiementAdminService {






    public TypePaiement findByReferenceEntity(TypePaiement t){
        return  dao.findByCode(t.getCode());
    }


    public List<TypePaiement> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(TypePaiement.class, TypePaiementSpecification.class);
    }



    public TypePaiementAdminServiceImpl(TypePaiementDao dao) {
        super(dao);
    }

}
