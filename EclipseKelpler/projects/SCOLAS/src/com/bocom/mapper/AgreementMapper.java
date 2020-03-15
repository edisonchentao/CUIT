package com.bocom.mapper;
import java.util.List;

import com.bocom.entity.Agreement;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Repository;

@Repository
public interface AgreementMapper {
	public void addAgr(Agreement agreement);
	public Agreement deleteAgrByID(int id);
	public void updateAgr(Agreement agreement);
	public List<Agreement> list();
}
