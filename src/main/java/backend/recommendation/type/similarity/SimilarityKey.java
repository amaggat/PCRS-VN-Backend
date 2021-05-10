package backend.recommendation.type.similarity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SimilarityKey implements Serializable {

    @Column(name = "item1id")
    private Integer item1CategoryId;

    @Column(name = "item2id")
    private Integer item2CategoryId;
}
