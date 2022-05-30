package ar.argentinaprograma.portafolio.filtros;

import ar.argentinaprograma.portafolio.modelo.Habilidad;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Component
public class HabilidadSpecification {

    public Specification<Habilidad> toSpec(String tipo) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if(tipo != null && !tipo.equals(""))
                predicates.add(criteriaBuilder.equal(root.get("tipo"), tipo));

            return criteriaBuilder.and(predicates.toArray(Predicate[]::new));
        };
    }
}
