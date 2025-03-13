package backAgil.example.back.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String codeProduit;

    private String nomProduit;
    private String libelle;
    private double prix;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(length = 500)
    private String description;

    @ManyToOne
    @JoinColumn(name = "type_produit_id")
    @JsonBackReference
    private TypeProduit typeProduit;

    public Produit() {}

    public Produit(String codeProduit, String nomProduit, String libelle, double prix, Date date, String description , TypeProduit typeProduit) {
        this.codeProduit = codeProduit;
        this.nomProduit = nomProduit;
        this.libelle = libelle;
        this.prix = prix;
        this.date = date;
        this.description = description;
        this.typeProduit = typeProduit;

    }


    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCodeProduit() { return codeProduit; }
    public void setCodeProduit(String codeProduit) { this.codeProduit = codeProduit; }

    public String getNomProduit() { return nomProduit; }
    public void setNomProduit(String nomProduit) { this.nomProduit = nomProduit; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public TypeProduit getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(TypeProduit typeProduit) {
        this.typeProduit = typeProduit;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", codeProduit='" + codeProduit + '\'' +
                ", nomProduit='" + nomProduit + '\'' +
                ", libelle='" + libelle + '\'' +
                ", prix=" + prix +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", typeProduit=" + typeProduit +
                '}';
    }
}
