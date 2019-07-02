package kr.co.jhta.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	/*
	 *   /home.do url ��û�� ������ ����Ǵ� ��û �ڵ鷯 �޼ҵ� ����
	 *   - /home.do url ��û�� �����Ǹ� home()�� ����ȴ�.
	 *   - home()�� ��ȯ�ϴ� ���ڿ��� �̵��� jsp�������� �̸��̴�.
	 *   - spring mvc �����ӿ�ũ�� ��û�ڵ鷯 �޼ҵ尡 ��ȯ�ϴ� ���ڿ��� JSP�� �̸����� �����ϰ�, �ش� JSP�������� ��û�� �̵���Ų��.
	 *   - ��û�� ���� JSP�� �������� ������ HTML �������� �������� �����ȴ�.  
	 */
	
	@RequestMapping(value="/home.do")
	public String home(Model model) {
		
		model.addAttribute("message", "Ȩ�������� ���� ����Ǿ����ϴ�.");
		
		List<String> rankings = Arrays.asList("����ġ����", "��ȿ��", "�̿�", "������", "���ֳ�����");
		model.addAttribute("rankings", rankings);	
		
		return "main";
	}
	
	@RequestMapping("/about.do")
	public String about() {
		return "about";
	}
}
