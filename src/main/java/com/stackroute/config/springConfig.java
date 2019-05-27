package com.stackroute.config;
import com.stackroute.Actor;
import com.stackroute.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration

public class springConfig {


    public Actor getActor(){
        return new Actor("Lohitha","female",56);
    }
    public Actor getActor2(){
        return new Actor("Shailu","Female",12);
    }
    @Bean(name="movie")
    public Movie getMovie(){

        return new Movie("Sky is Pink","rty^&&YU",getActor());
    }
    @Bean(name="movie1")
    public Movie getMovie1(){

        return new Movie("Sky high","TY67*(&",getActor());
    }

}
