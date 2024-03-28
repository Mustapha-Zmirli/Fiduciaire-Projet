package ma.zs.univ.ws.converter.paiement;

import ma.zs.univ.bean.core.paiement.TypePaiement;
import ma.zs.univ.ws.dto.paiement.TypePaiementDto;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class TypePaiementConverter extends AbstractConverter<TypePaiement, TypePaiementDto> {


    public TypePaiementConverter() {
        super(TypePaiement.class, TypePaiementDto.class);
    }

    @Override
    public TypePaiement toItem(TypePaiementDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypePaiement item = new TypePaiement();
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
    public TypePaiementDto toDto(TypePaiement item) {
        if (item == null) {
            return null;
        } else {
            TypePaiementDto dto = new TypePaiementDto();
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
