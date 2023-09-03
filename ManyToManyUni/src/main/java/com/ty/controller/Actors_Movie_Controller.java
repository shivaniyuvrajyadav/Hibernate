package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.dao.Actors_Movie_Dao;
import com.ty.dto.Actors;
import com.ty.dto.Movies;

public class Actors_Movie_Controller {
public static void main(String[] args) {
Actors 	actors = new Actors();
actors.setAge(25);
actors.setGender("male");
actors.setName("kartikaryan");

Actors 	actors1 = new Actors();
actors1.setAge(35);
actors1.setGender("male");
actors1.setName("ranvir");

Actors 	actors11 = new Actors();
actors11.setAge(45);
actors11.setGender("male");
actors11.setName("ak");


Movies movies = new Movies();
movies.setDuration(2.35);
movies.setLanguage("hindi");
movies.setName("sherni");

Movies movies1 = new Movies();
movies1.setDuration(2);
movies1.setLanguage("english");
movies1.setName("barbie");

Movies movies2 = new Movies();
movies2.setDuration(3);
movies2.setLanguage("hindi");
movies2.setName("gadar2");

List<Actors>list = new ArrayList<Actors>();
list .add(actors);
list.add(actors1);
list.add(actors11);


movies.setActor(list);
movies1.setActor(list);


Actors_Movie_Dao dao = new Actors_Movie_Dao();
dao.saveActors(movies2);
//dao.findAllActors(actors1);
//dao.findAllMovie(movies2);
//












}



























}
