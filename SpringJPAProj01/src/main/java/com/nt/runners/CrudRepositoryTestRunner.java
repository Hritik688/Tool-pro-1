package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;
import com.nt.service.IArtistMgmtService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {

    @Autowired
    private IArtistMgmtService artistService;

    @Override
    public void run(String... args) throws Exception {
        //Artist artist = new Artist();
       Artist artist = new Artist(101, "ritik", "gen", 50000.0);
        

        try {
            String msg = artistService.registerArtist(artist);
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
