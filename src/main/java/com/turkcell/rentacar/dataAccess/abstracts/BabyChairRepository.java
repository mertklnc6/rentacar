package com.turkcell.rentacar.dataAccess.abstracts;

import com.turkcell.rentacar.entities.concretes.BabyChair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BabyChairRepository extends JpaRepository<BabyChair, Integer> {
}
