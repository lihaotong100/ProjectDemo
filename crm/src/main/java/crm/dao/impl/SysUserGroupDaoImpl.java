package crm.dao.impl;

import org.springframework.stereotype.Repository;

import crm.dao.ISysUserGroupDao;
import crm.domain.SysUserGroup;

/*@Repository(value="userDao")

该注解是告诉Spring，让Spring创建一个名字叫“userDao”的UserDaoImpl实例。

当Service需要使用Spring创建的名字叫“userDao”的UserDaoImpl实例时，就可以使用@Resource(name = "userDao")注解告诉Spring，Spring把创建好的userDao注入给Service即可。
*/
@Repository(ISysUserGroupDao.service_name)
public class SysUserGroupDaoImpl extends CommonDaoImpl<SysUserGroup> implements ISysUserGroupDao {

	
}
