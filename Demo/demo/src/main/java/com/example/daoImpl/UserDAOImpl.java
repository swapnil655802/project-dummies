package com.example.daoImpl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.example.bean.User;
import com.example.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public String getNameById(int id) {

		Transaction tx = null;
		Configuration configuration = new Configuration();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(User.class);
		cr.add(Restrictions.eq("id", id));
		return (String) cr.uniqueResult();
	}

}
