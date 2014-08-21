package com.scaleset.search;

import com.scaleset.search.Query;
import com.scaleset.search.Results;

public interface GenericSearchDao<T, KEY> {

    void delete(T entity) throws Exception;

    void deleteByKey(KEY id) throws Exception;

    void deleteByQuery(Query query) throws Exception;

    boolean exists(KEY id) throws Exception;

    Results<T> search(Query query) throws Exception;

    long count(String q) throws Exception;

    T findById(KEY id) throws Exception;

    T save(T entity) throws Exception;

}