package  ma.zs.univ.ws.converter.demande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.univ.ws.converter.commun.SocieteConverter;
import ma.zs.univ.ws.converter.commun.ComptableConverter;



import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.demande.Demande;
import ma.zs.univ.ws.dto.demande.DemandeDto;

@Component
public class DemandeConverter extends AbstractConverter<Demande, DemandeDto> {

    @Autowired
    private SocieteConverter societeConverter ;
    @Autowired
    private ComptableConverter comptableConverter ;
    private boolean societe;
    private boolean comptableTraitant;
    private boolean comptableValidateur;

    public  DemandeConverter() {
        super(Demande.class, DemandeDto.class);
        init(true);
    }

    @Override
    public Demande toItem(DemandeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Demande item = new Demande();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDateDemande()))
                item.setDateDemande(DateUtil.stringEnToDate(dto.getDateDemande()));
            if(StringUtil.isNotEmpty(dto.getDateExigibilite()))
                item.setDateExigibilite(DateUtil.stringEnToDate(dto.getDateExigibilite()));
            if(StringUtil.isNotEmpty(dto.getTypeDemande()))
                item.setTypeDemande(dto.getTypeDemande());
            if(StringUtil.isNotEmpty(dto.getEtatDemande()))
                item.setEtatDemande(dto.getEtatDemande());
            if(StringUtil.isNotEmpty(dto.getDateValidation()))
                item.setDateValidation(DateUtil.stringEnToDate(dto.getDateValidation()));
            if(StringUtil.isNotEmpty(dto.getDateTraitement()))
                item.setDateTraitement(DateUtil.stringEnToDate(dto.getDateTraitement()));
            if(this.societe && dto.getSociete()!=null &&  dto.getSociete().getId() != null)
                item.setSociete(societeConverter.toItem(dto.getSociete())) ;

            if(this.comptableTraitant && dto.getComptableTraitant()!=null &&  dto.getComptableTraitant().getId() != null)
                item.setComptableTraitant(comptableConverter.toItem(dto.getComptableTraitant())) ;

            if(this.comptableValidateur && dto.getComptableValidateur()!=null &&  dto.getComptableValidateur().getId() != null)
                item.setComptableValidateur(comptableConverter.toItem(dto.getComptableValidateur())) ;




        return item;
        }
    }

    @Override
    public DemandeDto toDto(Demande item) {
        if (item == null) {
            return null;
        } else {
            DemandeDto dto = new DemandeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(item.getDateDemande()!=null)
                dto.setDateDemande(DateUtil.dateTimeToString(item.getDateDemande()));
            if(item.getDateExigibilite()!=null)
                dto.setDateExigibilite(DateUtil.dateTimeToString(item.getDateExigibilite()));
            if(StringUtil.isNotEmpty(item.getTypeDemande()))
                dto.setTypeDemande(item.getTypeDemande());
            if(StringUtil.isNotEmpty(item.getEtatDemande()))
                dto.setEtatDemande(item.getEtatDemande());
            if(item.getDateValidation()!=null)
                dto.setDateValidation(DateUtil.dateTimeToString(item.getDateValidation()));
            if(item.getDateTraitement()!=null)
                dto.setDateTraitement(DateUtil.dateTimeToString(item.getDateTraitement()));
            if(this.societe && item.getSociete()!=null) {
                dto.setSociete(societeConverter.toDto(item.getSociete())) ;

            }
            if(this.comptableTraitant && item.getComptableTraitant()!=null) {
                dto.setComptableTraitant(comptableConverter.toDto(item.getComptableTraitant())) ;

            }
            if(this.comptableValidateur && item.getComptableValidateur()!=null) {
                dto.setComptableValidateur(comptableConverter.toDto(item.getComptableValidateur())) ;

            }


        return dto;
        }
    }

    public void copy(DemandeDto dto, Demande t) {
    super.copy(dto, t);
    if (dto.getSociete() != null)
        societeConverter.copy(dto.getSociete(), t.getSociete());
    if (dto.getComptableTraitant() != null)
        comptableConverter.copy(dto.getComptableTraitant(), t.getComptableTraitant());
    if (dto.getComptableValidateur() != null)
        comptableConverter.copy(dto.getComptableValidateur(), t.getComptableValidateur());
    }



    public void initObject(boolean value) {
        this.societe = value;
        this.comptableTraitant = value;
        this.comptableValidateur = value;
    }


    public SocieteConverter getSocieteConverter(){
        return this.societeConverter;
    }
    public void setSocieteConverter(SocieteConverter societeConverter ){
        this.societeConverter = societeConverter;
    }
    public ComptableConverter getComptableConverter(){
        return this.comptableConverter;
    }
    public void setComptableConverter(ComptableConverter comptableConverter ){
        this.comptableConverter = comptableConverter;
    }
    public boolean  isSociete(){
        return this.societe;
    }
    public void  setSociete(boolean societe){
        this.societe = societe;
    }
    public boolean  isComptableTraitant(){
        return this.comptableTraitant;
    }
    public void  setComptableTraitant(boolean comptableTraitant){
        this.comptableTraitant = comptableTraitant;
    }
    public boolean  isComptableValidateur(){
        return this.comptableValidateur;
    }
    public void  setComptableValidateur(boolean comptableValidateur){
        this.comptableValidateur = comptableValidateur;
    }
}
