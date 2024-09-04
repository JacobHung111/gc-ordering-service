package com.jacobhung.gc.ordering.repository;

import com.jacobhung.gc.ordering.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
