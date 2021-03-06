package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

/**
 * 
 * @author lj
 * @date 2019.04.24
 * @Component - 스프링에게 해당 레스토랑 클래스가 스프링이 관리해야할 대상을 표시하는 것이고 Setter는 자동으로 setChef() 메소드를 컴파일시 생성
 * @Setter - value, onMethod, onParam 속성 부여 가능
 */
@Component
@Data
public class Restaurant {
	
	@Setter
	@Autowired
	private Chef chef;
}
