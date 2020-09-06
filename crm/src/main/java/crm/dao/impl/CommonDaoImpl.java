package crm.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.metamodel.domain.Superclass;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import crm.dao.ICommonDAO;

@Transactional(readOnly=false)
public class CommonDaoImpl<T> extends HibernateDaoSupport implements ICommonDAO<T> {

	public void save(T entity) {
		this.getHibernateTemplate().save(entity);
	}
	
	@Resource(name="sessionFactory")
	public  void setSessionFactoryDI(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
}
