package be.vdab.strips.services;

import be.vdab.strips.domain.Figuur;
import be.vdab.strips.repositories.FiguurRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
class DefaultFiguurService implements FiguurService {
    private final FiguurRepository figuurRepository;

    public DefaultFiguurService(FiguurRepository figuurRepository) {
        this.figuurRepository = figuurRepository;
    }

    @Override
    public List<Figuur> findAll() {
        return figuurRepository.findAll();
    }
}
