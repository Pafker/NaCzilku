package pl.naczilku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.naczilku.model.Donor;

@Repository
public interface DonorRepository extends JpaRepository<Donor, Long> {

}
