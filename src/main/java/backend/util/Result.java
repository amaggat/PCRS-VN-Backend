package backend.util;

import java.util.ArrayList;
import java.util.List;

public class Result {
    List<Recommender> result = new ArrayList<>();

    public Result() {
    }

    public List<Recommender> getResult() {
        return result;
    }

    public void setResult(List<Recommender> result) {
        this.result = result;
    }
}
