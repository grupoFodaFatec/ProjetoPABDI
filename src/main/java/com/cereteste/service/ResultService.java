package com.cereteste.service;

import com.cereteste.pojo.Result;

import java.util.List;

public interface ResultService {
    public void addResult(Result result);
    public void updateResult(Result result);
    public Result getResult(int id);
    public List<Result> getResults();
}