package com.zte.anyservice.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zte.anyservice.bean.User;
public class UserDAOImpl  implements UserDAO{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		}
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction(); 
		session.save(user);
	      tx.commit();
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		// this.getHibernateTemplate().delete(this.getHibernateTemplate().get(User.class, id));
		Session session=sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction(); 
		Query query=session.createQuery("delete User as u where u.userid=?");
		  query.setInteger(0, id);
		  int inpactRow=query.executeUpdate();
		  System.out.println(inpactRow);
	      tx.commit();
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		 //this.getHibernateTemplate().saveOrUpdate(user);
	}

	@Override
	public List queryAll() {
		// TODO Auto-generated method stub
		// return this.getHibernateTemplate().find("from User");
		Session session=sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction(); 
		Query query=session.createQuery("from User");
		   List users=query.list();
		   
	      tx.commit();
	      return users;
		
	}

	@Override
	public User queryById(int id) {
		// TODO Auto-generated method stub
		//return (User)this.getHibernateTemplate().get(User.class, id);
		return null;
	}
 
}
