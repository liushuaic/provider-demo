package com.jk.mapper;

import com.jk.model.Organization;
import com.jk.model.TreeModel;
import com.jk.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> queryList() throws Exception;

    List<TreeModel> queryOrgTree();

    List<Organization> queryGridTree(@Param("pid") String pid);

    List<Organization> queryExportExcel();

    void addImportExcel(Organization pzwp) throws Exception;

    int deleteOrganization(@Param("id") String id);

    int saveOrganization(Organization organization);

    Organization queryOrganizationById(@Param("id") String id);

    int updateOrganization(Organization organization);
}
