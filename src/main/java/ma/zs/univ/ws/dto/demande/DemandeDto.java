package  ma.zs.univ.ws.dto.demande;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


import ma.zs.univ.ws.dto.commun.SocieteDto;
import ma.zs.univ.ws.dto.commun.ComptableDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DemandeDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;
    private String dateDemande ;
    private String dateExigibilite ;
    private String typeDemande  ;
    private String etatDemande  ;
    private String dateValidation ;
    private String dateTraitement ;

    private SocieteDto societe ;
    private ComptableDto comptableTraitant ;
    private ComptableDto comptableValidateur ;



    public DemandeDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDemande(){
        return this.dateDemande;
    }
    public void setDateDemande(String dateDemande){
        this.dateDemande = dateDemande;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateExigibilite(){
        return this.dateExigibilite;
    }
    public void setDateExigibilite(String dateExigibilite){
        this.dateExigibilite = dateExigibilite;
    }

    @Log
    public String getTypeDemande(){
        return this.typeDemande;
    }
    public void setTypeDemande(String typeDemande){
        this.typeDemande = typeDemande;
    }

    @Log
    public String getEtatDemande(){
        return this.etatDemande;
    }
    public void setEtatDemande(String etatDemande){
        this.etatDemande = etatDemande;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateValidation(){
        return this.dateValidation;
    }
    public void setDateValidation(String dateValidation){
        this.dateValidation = dateValidation;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateTraitement(){
        return this.dateTraitement;
    }
    public void setDateTraitement(String dateTraitement){
        this.dateTraitement = dateTraitement;
    }


    public SocieteDto getSociete(){
        return this.societe;
    }

    public void setSociete(SocieteDto societe){
        this.societe = societe;
    }
    public ComptableDto getComptableTraitant(){
        return this.comptableTraitant;
    }

    public void setComptableTraitant(ComptableDto comptableTraitant){
        this.comptableTraitant = comptableTraitant;
    }
    public ComptableDto getComptableValidateur(){
        return this.comptableValidateur;
    }

    public void setComptableValidateur(ComptableDto comptableValidateur){
        this.comptableValidateur = comptableValidateur;
    }






}
