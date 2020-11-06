package ru.appline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.appline.logic.Degree;
import ru.appline.logic.Entity;
import ru.appline.logic.NewEntity;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {

    Entity entity = new Entity();
    NewEntity newEntity = new NewEntity();

    @PostMapping(value = "/postDiapazon", consumes = "application/json", produces = "application/json")
    public NewEntity setDiapazon(@RequestBody Entity entity){
        this.entity = entity;
        newEntity.setEastStart(Integer.parseInt(entity.getEast().substring(0, entity.getEast().indexOf("-"))));
        newEntity.setNorthWestStart(Integer.parseInt(entity.getNorthWest().substring(0, entity.getNorthWest().indexOf("-"))));
        newEntity.setNorthEastStart(Integer.parseInt(entity.getNorthEast().substring(0, entity.getNorthEast().indexOf("-"))));
        newEntity.setNorthStart(Integer.parseInt(entity.getNorth().substring(0, entity.getNorth().indexOf("-"))));
        newEntity.setVestStart(Integer.parseInt(entity.getVest().substring(0, entity.getVest().indexOf("-"))));
        newEntity.setSouthWestStart(Integer.parseInt(entity.getSouthWest().substring(0, entity.getSouthWest().indexOf("-"))));
        newEntity.setSouthEastStart(Integer.parseInt(entity.getSouthEast().substring(0, entity.getSouthEast().indexOf("-"))));
        newEntity.setSouthStart(Integer.parseInt(entity.getSouth().substring(0, entity.getSouth().indexOf("-"))));
        newEntity.setEastEnd(Integer.parseInt(entity.getEast().substring(entity.getEast().indexOf("-")+1)));
        newEntity.setNorthWestEnd(Integer.parseInt(entity.getNorthWest().substring(entity.getNorthWest().indexOf("-")+1)));
        newEntity.setNorthEastEnd(Integer.parseInt(entity.getNorthEast().substring(entity.getNorthEast().indexOf("-")+1)));
        newEntity.setNorthEnd(Integer.parseInt(entity.getNorth().substring(entity.getNorth().indexOf("-")+1)));
        newEntity.setVestEnd(Integer.parseInt(entity.getVest().substring(entity.getVest().indexOf("-")+1)));
        newEntity.setSouthWestEnd(Integer.parseInt(entity.getSouthWest().substring(entity.getSouthWest().indexOf("-")+1)));
        newEntity.setSouthEastEnd(Integer.parseInt(entity.getSouthEast().substring(entity.getSouthEast().indexOf("-")+1)));
        newEntity.setSouthEnd(Integer.parseInt(entity.getSouth().substring(entity.getSouth().indexOf("-")+1)));
        return newEntity;
    }

    @GetMapping(value = "/getDegree", consumes = "application/json")
    public String setDegree(@RequestBody Degree degree){
        if(degree.getDegree()>=newEntity.getEastStart()&&degree.getDegree()<=newEntity.getEastEnd()){
            return "East";
        } else if (degree.getDegree()>=newEntity.getNorthWestStart()&&degree.getDegree()<=newEntity.getNorthWestEnd()){
            return "NorthWest";
        } else if (degree.getDegree()>=newEntity.getNorthEastStart()&&degree.getDegree()<=newEntity.getNorthEastEnd()){
            return "NorthEast";
        } else if (degree.getDegree()>=newEntity.getNorthStart()&&degree.getDegree()<=newEntity.getNorthEnd()){
            return "North";
        } else if (degree.getDegree()>=newEntity.getVestStart()&&degree.getDegree()<=newEntity.getVestEnd()){
            return "Vest";
        } else if (degree.getDegree()>=newEntity.getSouthWestStart()&&degree.getDegree()<=newEntity.getSouthWestEnd()){
            return "SouthWest";
        } else if (degree.getDegree()>=newEntity.getSouthEastStart()&&degree.getDegree()<=newEntity.getSouthEastEnd()){
            return "SouthEast";
        } else{
            return "South";
        }
    }
}
