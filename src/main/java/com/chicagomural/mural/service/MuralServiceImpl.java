package com.chicagomural.mural.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chicagomural.mural.dao.MuralDAO;
import com.chicagomural.mural.entity.Mural;
import com.chicagomural.mural.view.MuralDetailsView;
@Service
@Transactional
public class MuralServiceImpl implements MuralService {
	
	private MuralDAO muralDAO;
	@Autowired
	public MuralServiceImpl(MuralDAO muralDAO) {
		this.muralDAO = muralDAO;
	}

	@Override
	public MuralDetailsView getMural(Integer muralRegestrationId) {
		final Mural mural = muralDAO.findByRegestrationId(muralRegestrationId);
		
		final String title = Optional.ofNullable(mural.getArtworkTitle()).orElse("N/A");
		final String artist = Optional.ofNullable(mural.getArtistCredit()).orElse("N/A");
		final String commissioned = Optional.ofNullable(mural.getAffiliatedOrCommissioning()).orElse("N/A");
		final String description = Optional.ofNullable(mural.getDescriptionOfArtWork()).orElse("N/A");
		final String address = Optional.ofNullable(mural.getStreetAddress()).orElse("N/A");
		
		final MuralDetailsView mdv = new MuralDetailsView();
		mdv.setArtworkTitle(title);
		mdv.setArtistCredit(artist);
		mdv.setAffiliatedOrCommissioning(commissioned);
		mdv.setDescriptionOfArtWork(description);
		mdv.setStreetAddress(address);
		
		return mdv;
	}

}
