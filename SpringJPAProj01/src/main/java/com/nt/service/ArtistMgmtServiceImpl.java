package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.repository.IArtistRepository;

@Service("artistService")
public class ArtistMgmtServiceImpl implements IArtistMgmtService {
	@Autowired
	private IArtistRepository artistrepo;

	@Override
	public String registerArtist(Artist artist) {
		//use repo
		Artist artist1 =   (Artist) artistrepo.save(artist);
	
		return artist1.getAid()==101?"Artist is saved(record inserted)":"Artist is not saved (record not insert)";
	}

}
