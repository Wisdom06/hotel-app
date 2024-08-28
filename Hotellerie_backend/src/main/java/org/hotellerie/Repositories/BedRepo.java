package org.hotellerie.Repositories;

import org.hotellerie.Entities.Bed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedRepo extends JpaRepository<Bed,Long> {

}
