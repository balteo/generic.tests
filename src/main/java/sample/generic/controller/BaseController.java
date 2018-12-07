package sample.generic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import sample.generic.dto.BaseDto;
import sample.generic.entity.BaseEntity;
import sample.generic.service.BaseService;

@RestController
public class BaseController<D extends BaseDto, E extends BaseEntity> {

    @Autowired
    private BaseService<D, E> service;

}
