package ma.zs.univ.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.commun.Societe;
import org.springframework.stereotype.Repository;
import ma.zs.univ.bean.core.commun.Societe;
import java.util.List;


@Repository
public interface SocieteDao extends AbstractRepository<Societe,Long>  {
    Societe findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Societe(item.id,item.code) FROM Societe item")
    List<Societe> findAllOptimized();

}
