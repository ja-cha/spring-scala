package com.abt.controller

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
  * Created by jabt on 2/5/19.
  */
@Repository
trait UserRepository extends JpaRepository[User, Long]{



}
