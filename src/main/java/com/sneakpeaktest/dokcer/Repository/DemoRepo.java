package com.sneakpeaktest.dokcer.Repository;

import com.sneakpeaktest.dokcer.Entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepo extends JpaRepository<DemoEntity,Integer> {
}
