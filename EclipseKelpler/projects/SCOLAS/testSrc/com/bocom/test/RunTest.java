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
	//�������ӣ����������ļ��Զ�Ѱ��������AgreementMapper.xml�ж�Ӧ��Id��addAgr��sql���
	public void testAdd(){
		Agreement agreement= new Agreement();
		agreement.setName("����������");//ʵ�����ֵ��ֻ��ͨ������ֵ����Ϊ���еĶ���Ϊ˽�����Բ���ֱ�ӷ���
		agreementMapper.addAgr(agreement);
		}
	@Test
	//�������list
	public void testList(){
		List<Agreement> as= agreementMapper.list();
		for(Agreement a : as){
			System.out.println(a.getCode()+a.getCode());
		}
		
		
	}
}
