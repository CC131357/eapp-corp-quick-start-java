package com.service;

import com.vo.Salary;

public interface ISalaryService {
    public Salary selectSalaryById(String userId);
    public Integer updateStatusSalaryById(String signStatus,String unusualContent, String userId);
}
