package backend.recommendation.type.score;

import backend.recommendation.type.similarity.CategorySimilarity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Column(name= "type")
    private String type;

    @Column(name = "budget")
    private String budget;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany

    private List<CategorySimilarity> categorySimilarity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

//    public List<CategorySimilarity> getCategorySimilarity() {
//        return categorySimilarity;
//    }
//
//    public void setCategorySimilarity(List<CategorySimilarity> categorySimilarity) {
//        this.categorySimilarity = categorySimilarity;
//    }
}
