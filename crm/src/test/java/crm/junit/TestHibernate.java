package crm.junit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import crm.dao.ISysUserGroupDao;
import crm.domain.SysUserGroup;

public class TestHibernate {

	@Test
	public void testHibernateConf() {
		
		/*
		 * Configuration cf = new Configuration(); cf.configure("/hibernate.cfg.xml");
		 * 
		 * ServiceRegistry serviceRegistry = new
		 * ServiceRegistryBuilder().applySettings(cf.getProperties()).
		 * buildServiceRegistry(); SessionFactory factory =
		 * cf.buildSessionFactory(serviceRegistry); Session s = factory.openSession();
		 * 
		 * Transaction tx = s.beginTransaction(); SysUserGroup sys = new SysUserGroup();
		 * sys.setName("1"); sys.setPrincipal("1"); sys.setIncumbent("1"); s.save(sys);
		 * tx.commit(); s.close();
		 */
	}
	

	@Test
	public void testSpring() {
		ApplicationContext cx = new ClassPathXmlApplicationContext("/applicationContext.xml");
		ISysUserGroupDao d = (ISysUserGroupDao)cx.getBean(ISysUserGroupDao.service_name);
		SysUserGroup sys = new SysUserGroup();
		sys.setName("1");
		sys.setPrincipal("1");
		sys.setIncumbent("1");
		d.save(sys);
		
	
	
	
	}
	
}
