package com.stackroute.keepnote.controller;

import com.stackroute.keepnote.model.Note;
import com.stackroute.keepnote.repository.NoteRepository;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class BeanConfig {
    @Bean
    @Scope("prototype")

    public Note note()
    {
        return new Note();
    }

    @Bean
    public NoteRepository noteRepository(){
        return new NoteRepository();
    }

}
