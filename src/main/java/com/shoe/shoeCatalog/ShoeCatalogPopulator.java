package com.shoe.shoeCatalog;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShoeCatalogPopulator implements CommandLineRunner{

	@Resource
	private ShoeRepository shoeRepo;
	
	@Resource
	private ShoeTypeRepository shoeTypeRepo;
	
	@Override
	public void run(String... args) throws Exception {
	
		//shoe objects created and saved to repo
		Shoe athletic = new Shoe("Athletic");
		shoeRepo.save(athletic);
		Shoe dress = new Shoe ("Dress");
		shoeRepo.save(dress);
		Shoe casual = new Shoe ("Casual");
		shoeRepo.save(casual);
		Shoe boot = new Shoe ("Boot");
		shoeRepo.save(boot);
		
		
		
	}

}
