package ma.zs.univ.bean.core.demande;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import ma.zs.univ.bean.core.commun.Societe;
import ma.zs.univ.bean.core.commun.Comptable;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "demande")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="demande_seq",sequenceName="demande_seq",allocationSize=1, initialValue = 1)
public class Demande   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    private LocalDateTime dateDemande ;
    private LocalDateTime dateExigibilite ;
    @Column(length = 500)
    private String typeDemande;
    @Column(length = 500)
    private String etatDemande;
    private LocalDateTime dateValidation ;
    private LocalDateTime dateTraitement ;

    private Societe societe ;
    private Comptable comptableTraitant ;
    private Comptable comptableValidateur ;


    public Demande(){
        super();
    }

    public Demande(Long id){
        this.id = id;
    }

    public Demande(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }
    public Demande(String libelle){
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="demande_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public LocalDateTime getDateDemande(){
        return this.dateDemande;
    }
    public void setDateDemande(LocalDateTime dateDemande){
        this.dateDemande = dateDemande;
    }
    public LocalDateTime getDateExigibilite(){
        return this.dateExigibilite;
    }
    public void setDateExigibilite(LocalDateTime dateExigibilite){
        this.dateExigibilite = dateExigibilite;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "societe")
    public Societe getSociete(){
        return this.societe;
    }
    public void setSociete(Societe societe){
        this.societe = societe;
    }
    public String getTypeDemande(){
        return this.typeDemande;
    }
    public void setTypeDemande(String typeDemande){
        this.typeDemande = typeDemande;
    }
    public String getEtatDemande(){
        return this.etatDemande;
    }
    public void setEtatDemande(String etatDemande){
        this.etatDemande = etatDemande;
    }
    public LocalDateTime getDateValidation(){
        return this.dateValidation;
    }
    public void setDateValidation(LocalDateTime dateValidation){
        this.dateValidation = dateValidation;
    }
    public LocalDateTime getDateTraitement(){
        return this.dateTraitement;
    }
    public void setDateTraitement(LocalDateTime dateTraitement){
        this.dateTraitement = dateTraitement;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comptable_traitant")
    public Comptable getComptableTraitant(){
        return this.comptableTraitant;
    }
    public void setComptableTraitant(Comptable comptableTraitant){
        this.comptableTraitant = comptableTraitant;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comptable_validateur")
    public Comptable getComptableValidateur(){
        return this.comptableValidateur;
    }
    public void setComptableValidateur(Comptable comptableValidateur){
        this.comptableValidateur = comptableValidateur;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demande demande = (Demande) o;
        return id != null && id.equals(demande.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

