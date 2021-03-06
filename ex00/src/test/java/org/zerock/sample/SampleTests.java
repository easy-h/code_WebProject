package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

/**
 * @date 2019.04.24
 * @author lj
 * 의존성 주입 테스트 
 * @Runwith는 현재 테스트코드가 스프링을 실행하는 역할을 한다는 의미
 * @ContextConfigue는 지정된 클래스나 문자열을 이용해 필요한 객체들을 스프링내에 객체로 등록(bean등록개념) 문자열은 file, classpath 사용 가능하여 생성된 root-context경로를 지정한다.
 * @Log4j는 log를 보기위한 logger 변수 선언
 * @Autowired는 해당 인스턴스의 변수가 스프링으로부터 자동 주입한다는 의미. 주입이 가능하다면 obj변수에 Restaurant 타입의 객체를 주입한다.
 * @Test는 JUnit에서 테스트대상을 표기하는 것을 의미
 * assertNotNull은 Null이면 테스트 실패 
 * 
 * @result 테스트 코드가 실행되기 위해 스프링 프레임워크가 동작, 필요한 객체들을 스프링 bean으로 등록했고 의존성 주입이 필요한 객체는 자동주입이 이루어져 Restaurant에 chef 클래스가 주입되어 사용할 수 있다는 점
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	//Autowired ressaurant 객체는 chef 객체가 필요한 의존성 관계 
	@Autowired
	@Setter
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("----------------------------");
		log.info(restaurant.getChef());
	}
}
