package com.jk.service.impl;

import com.jk.mapper.UserMapper;
import com.jk.model.Organization;
import com.jk.model.TreeModel;
import com.jk.model.User;
import com.jk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryList() throws Exception {
        return userMapper.queryList();
    }

    @Override
    public List<TreeModel> queryOrgTree() {
        return userMapper.queryOrgTree();
    }

    @Override
    public List<Organization> queryGridTree(String pid) throws Exception {
        return userMapper.queryGridTree(pid);
    }

    @Override
    public List<Organization> queryExportExcel() throws Exception {
        return userMapper.queryExportExcel();
    }

    @Override
    public void addImportExcel(Organization pzwp) throws Exception {
        userMapper.addImportExcel(pzwp);
    }

    @Override
    public int deleteOrganization(String id) {
        int i = userMapper.deleteOrganization(id);
        return i;
    }

    @Override
    public int saveOrganization(Organization organization) {
        organization.setId(UUID.randomUUID().toString());
      int i = userMapper.saveOrganization(organization);
        return i;
    }

    @Override
    public Organization queryOrganizationById(String id) {
        return userMapper.queryOrganizationById(id);
    }

    @Override
    public int updateOrganization(Organization organization) {
        int i = userMapper.updateOrganization(organization);
        return i;
    }


}
