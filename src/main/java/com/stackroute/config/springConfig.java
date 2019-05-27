package com.stackroute.config;
import com.stackroute.Actor;
import com.stackroute.Actor;
import com.stackroute.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class springConfig {

    //
//    public Actor getActor(){
//        return new Actor("Lohitha","female",56);
//    }
//    public Actor getActor2(){
//        return new Actor("Shailu","Female",12);
//    }
//    //@Scope("prototype")  -- The  output becomes false
    @Bean(name = "movie")
    public Movie getMovie() {

        Movie movie = new Movie();
        movie.setMovieId("123f");
        movie.setMovieName("sfgh");
        return movie;
    }

    @Bean(name = "actor")
    public Actor getActor() {

    Actor actor=new Actor();
    actor.setAge(20);
    actor.setGender("female");
    actor.setName("lohi");
    return actor;
    }
}
