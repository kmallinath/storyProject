package com.accenture.lkm.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.entity.StoryEntity;
import com.accenture.lkm.entity.UserEntity;

@RepositoryDefinition(idClass = Integer.class, domainClass = StoryEntity.class)
@Transactional(value = "txManager")
public interface StoryDAO {
	//@Query(name = "getCustomerByCompliantType")
	//StudentEntity getCustomerByCompliantType(String customerName, int compliantTypeId);
	StoryEntity save(StoryEntity storyEntity);
	List findAll();
	//@Query(name="getCompliantDetailsByDate")
	//List<StudentEntity> getCompliantDetailsByDate(Date fromDate,Date toDate);
}
