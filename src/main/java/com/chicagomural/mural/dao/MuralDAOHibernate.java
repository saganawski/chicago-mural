package com.chicagomural.mural.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.chicagomural.mural.entity.Mural;
@Repository
public class MuralDAOHibernate implements MuralDAO {
	
	private EntityManager entityManager;
	
	public MuralDAOHibernate(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Mural findByRegestrationId(Integer muralRegestrationId) {
		final Session session = entityManager.unwrap(Session.class);

		@SuppressWarnings("unchecked")
		final Query<Mural> query = session.createQuery("from Mural where muralRegestrationId = :muralRegestrationId");
		query.setParameter("muralRegestrationId", muralRegestrationId);
		
		final Mural mural = query.getSingleResult();
		return mural;
	}

}
