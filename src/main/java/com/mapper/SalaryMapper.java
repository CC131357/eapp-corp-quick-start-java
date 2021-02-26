package com.mapper;

import com.vo.Salary;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 调度任务信息 数据层
 * 
 * @author numberone
 */

@Repository
public interface SalaryMapper
{
    public Salary selectSalaryById(String userId);
    public Integer updateStatusSalaryById(@Param("signStatus") String signStatus,@Param("unusualContent") String unusualContent, @Param("userId")String userId);
}
