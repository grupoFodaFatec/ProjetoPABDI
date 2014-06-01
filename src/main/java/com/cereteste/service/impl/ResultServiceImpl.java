package com.cereteste.service.impl;

import com.cereteste.dao.ResultDao;
import com.cereteste.dao.impl.ResultDaoImpl;
import com.cereteste.pojo.Result;
import com.cereteste.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    private ResultDao resultDao;

    public ResultServiceImpl() {
        resultDao = new ResultDaoImpl();
    }

    public void addResult(Result result) {
        resultDao.addOrUpdateResult(result);
    }

    public void updateResult(Result result) {
        resultDao.addOrUpdateResult(result);
    }

    public Result getResult(int id) {
        return resultDao.getResult(id);
    }

    public List<Result> getResults() {
        return resultDao.getResults();
    }
}