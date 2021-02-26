package com.service.impl;

import com.mapper.SalaryMapper;
import com.service.ISalaryService;
import com.vo.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements ISalaryService {
    @Autowired
    private SalaryMapper salaryMapper;
    @Override
    public Salary selectSalaryById(String userId) {
        if(null == userId || "".equals(userId)){
            return null;
        }
        return salaryMapper.selectSalaryById(userId);
    }

    @Override
    public Integer updateStatusSalaryById(String signStatus,String unusualContent, String userId) {
        if(null == userId || "".equals(userId)){
            return null;
        }
        return salaryMapper.updateStatusSalaryById(signStatus,unusualContent,userId);
    }
}
