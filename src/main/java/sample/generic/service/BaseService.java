package sample.generic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.generic.dto.BaseDto;
import sample.generic.entity.BaseEntity;
import sample.generic.repository.BaseRepository;

import java.util.List;

@Service
public class BaseService<D extends BaseDto, E extends BaseEntity> {

    @Autowired
    private BaseRepository<E> repository;

    public List<E> findAll() {
        return repository.findAll();
    }

}
