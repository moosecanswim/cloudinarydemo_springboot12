package me.moosecanswim.cloudinarydemo.repository;

import me.moosecanswim.cloudinarydemo.model.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor,Long> {

}
