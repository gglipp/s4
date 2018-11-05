package spring.data;


import spring.Result;

import java.util.List;

/**
 * @author gglip
 */
public interface SpringRepository {

    /**
     * find results
     * @return list of results
     */
    List<Result> findResults();
}
