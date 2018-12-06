package shiva;

import java.util.ArrayList;

public class VideoStore {
	Video arr[] = new Video[10];
	ArrayList<Video> movie = new ArrayList<Video>();
	movie.add(new Video (1,"Avengers",4.3));
	movie.add(new Video (2,"Thor",4.0));
	movie.add(new Video (3,"batman",3.8));
	movie.add(new Video (4,"superman",4.1));
	movie.add(new Video (5,"ironman",4.5));
	movie.add(new Video (6,"spiderman",3.9));
	movie.add(new Video (7,"blackpanther",4.0));
	movie.add(new Video (8,"the mask",4.0));
	movie.add(new Video (9,"pink panther",2.9));
	movie.add(new Video (10,"mr bean",5.0));
	
	addvideo()
	{
		System.out.println("which video dou u want to take");
		
	}

}
