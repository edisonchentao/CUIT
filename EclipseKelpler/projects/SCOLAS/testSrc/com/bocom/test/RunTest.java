package com.bocom.test;

import java.util.List;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.*;

import com.bocom.entity.Agreement;
import com.bocom.mapper.AgreementMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RunTest {
	
	@Autowired
	private AgreementMapper agreementMapper;
	
	@Test
	//测试增加，根据配置文件自动寻找名字是AgreementMapper.xml中对应的Id是addAgr的sql语句
	public void testAdd(){
		Agreement agreement= new Agreement();
		agreement.setName("绵阳公积金");//实体对象赋值，只能通过对象传值，因为类中的对象为私有属性不能直接访问
		agreementMapper.addAgr(agreement);
		}
	@Test
	//测试输出list
	public void testList(){
		List<Agreement> as= agreementMapper.list();
		for(Agreement a : as){
			System.out.println(a.getCode()+a.getCode());
		}
		
		
	}
}
