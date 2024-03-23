package  ma.zs.univ.ws.converter.paiement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.paiement.PaiementDemande;
import ma.zs.univ.ws.dto.paiement.PaiementDemandeDto;

@Component
public class PaiementDemandeConverter extends AbstractConverter<PaiementDemande, PaiementDemandeDto> {


    public  PaiementDemandeConverter() {
        super(PaiementDemande.class, PaiementDemandeDto.class);
    }

    @Override
    public PaiementDemande toItem(PaiementDemandeDto dto) {
        if (dto == null) {
            return null;
        } else {
        PaiementDemande item = new PaiementDemande();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());



        return item;
        }
    }

    @Override
    public PaiementDemandeDto toDto(PaiementDemande item) {
        if (item == null) {
            return null;
        } else {
            PaiementDemandeDto dto = new PaiementDemandeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
