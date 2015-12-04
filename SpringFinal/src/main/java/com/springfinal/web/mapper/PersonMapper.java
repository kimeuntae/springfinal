package com.springfinal.web.mapper;

import java.util.List;

import com.springfinal.web.domain.Member;

public interface PersonMapper {
	public List<Member> selectPersonDTO();
}
