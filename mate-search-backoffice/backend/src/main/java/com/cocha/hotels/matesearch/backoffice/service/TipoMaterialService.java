package com.cocha.hotels.matesearch.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cocha.hotels.matesearch.backoffice.model.tipo.TipoMaterial;
import com.cocha.hotels.matesearch.backoffice.repository.security.TipoMaterialRepository;
import com.cocha.hotels.matesearch.backoffice.service.exception.NotFoundException;

@Service
public class TipoMaterialService {

    @Autowired
    private TipoMaterialRepository tipoMaterialRepository;

    @Transactional
    public TipoMaterial createTipoMaterial(TipoMaterial tipoMaterial) {
        tipoMaterialRepository.create(tipoMaterial);
        return find(tipoMaterial.getId());
    }

    public List<TipoMaterial> getAll() {
        return tipoMaterialRepository.findAll();
    }

    @Transactional
    public TipoMaterial update(TipoMaterial tipoMaterial) {
        tipoMaterialRepository.update(tipoMaterial);
        return find(tipoMaterial.getId());
    }

    public TipoMaterial find(Long id) {
        TipoMaterial tipoMaterial = tipoMaterialRepository.findOne(id);
        if (tipoMaterial == null) {
            throw new NotFoundException();
        }
        return tipoMaterial;
    }

    public void delete(Long id) {
        TipoMaterial tipoMaterial = find(id);
        tipoMaterialRepository.delete(tipoMaterial);
    }

}
