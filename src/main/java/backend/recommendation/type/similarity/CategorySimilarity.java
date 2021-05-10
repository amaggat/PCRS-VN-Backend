package backend.recommendation.type.similarity;

import backend.recommendation.type.score.Category;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "itemcategory")
public class CategorySimilarity {

    @ManyToOne
    @MapsId("item1CategoryId")
    @JoinColumn(name = "item1id")
    private Category item1Category;

    @ManyToOne
    @MapsId("item2CategoryId")
    @JoinColumn(name = "item2id")
    private Category Item2Category;

    @Column(name = "similarity")
    private double similarity;

    @EmbeddedId
    private SimilarityKey id;

    public Category getItem1Category() {
        return item1Category;
    }

    public void setItem1Category(Category item1Category) {
        this.item1Category = item1Category;
    }

    public Category getItem2Category() {
        return Item2Category;
    }

    public void setItem2Category(Category item2Category) {
        this.Item2Category = item2Category;
    }

    public double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(double similarity) {
        this.similarity = similarity;
    }
}
