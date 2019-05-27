package com.stackroute.config;
import com.stackroute.Actor;
import com.stackroute.Movie;
import com.stackroute.awareinterface.applicationContextAwareDemo;
import com.stackroute.awareinterface.beanFactoryAwareDemo;
import com.stackroute.awareinterface.beanNameAwareDemo;
import com.stackroute.awareinterface.resourceLoaderAwareDemo;
import com.stackroute.BeanLifeCycle.BeanLifeCycle;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

    @Bean(name= "applicationContextAwareDemo")
    public ApplicationContextAware getApplicationContextAware() {
        return new applicationContextAwareDemo();
    }

        @Bean(name= "beanFactoryAwareDemo")
        public BeanFactoryAware getBeanFactoryAware(){
            return new beanFactoryAwareDemo();

    }

    @Bean(name= "beanNameAwareDemo")
    public BeanNameAware getBeanNameAware(){
        return new beanNameAwareDemo();

    }
    @Bean(name= "ResourceLoaderAwareDemo")
    public ResourceLoaderAware getResourceLoaderAwareDemo(){
        return new resourceLoaderAwareDemo();

    }

    @Bean(name = {"BeanLifeCycle"},initMethod = "customInit",destroyMethod = "CustomDestroy")
    public BeanLifeCycle getBeanLifeCycle(){
        return new BeanLifeCycle();
    }





}
