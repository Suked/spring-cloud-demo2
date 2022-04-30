package net.biancheng.c.service.impl;

import net.biancheng.c.entity.Dept;
import net.biancheng.c.mapper.DeptMapper;
import net.biancheng.c.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    /**
      * @Description 根据主键id获取dept信息
      * @author kt
      * @param deptNo
      * @return net.biancheng.c.entity.Dept
      * @date 2022/4/30 19:23
      */
    @Override
    public Dept get(Integer deptNo) {
        return deptMapper.selectByPrimaryKey(deptNo);
    }

    /**
      * @Description 获取所有dept信息
      * @author kt
      * @param
      * @return java.util.List<net.biancheng.c.entity.Dept>
      * @date 2022/4/30 19:24
      */
    @Override
    public List<Dept> selectAll() {
        return deptMapper.GetAll();
    }
}