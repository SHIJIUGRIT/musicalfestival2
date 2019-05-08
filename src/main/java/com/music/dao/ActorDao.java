package com.music.dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.music.entity.Actor;

public interface ActorDao {
			
	int insertActor(@Param("Actor")Actor actor);
	int modifiedActor(@Param("Actor")Actor actor);
	List<Actor> selectActorList();
	int deleteActor(@Param("id")int id);
	Actor selectActorById(@Param("id")int id);
}
