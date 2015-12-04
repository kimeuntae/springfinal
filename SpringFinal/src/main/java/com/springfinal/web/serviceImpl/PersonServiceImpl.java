package com.springfinal.web.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springfinal.web.MemberController;
import com.springfinal.web.domain.Member;
import com.springfinal.web.mapper.PersonMapper;
import com.springfinal.web.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired
	private SqlSession sqlSession;
    
	@Override
	public List<Member> selectPersonDTO() {
		logger.info("PersonServiceImpl selectPersonDTO");
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
		return mapper.selectPersonDTO();
	}

}
