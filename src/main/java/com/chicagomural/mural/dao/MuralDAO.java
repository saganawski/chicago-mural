package com.chicagomural.mural.dao;

import com.chicagomural.mural.entity.Mural;

public interface MuralDAO {

	Mural findByRegestrationId(Integer muralRegestrationId);

}
