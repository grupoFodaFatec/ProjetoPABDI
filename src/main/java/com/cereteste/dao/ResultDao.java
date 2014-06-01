package com.cereteste.dao;

import com.cereteste.pojo.Result;

import java.util.List;

public interface ResultDao {
    public void addOrUpdateResult(Result result);
    public Result getResult(int id);
    public List<Result> getResults();
}