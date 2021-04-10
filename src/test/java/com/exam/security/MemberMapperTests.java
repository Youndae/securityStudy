package com.exam.security;

import com.exam.security.domain.MemberVO;
import com.exam.security.mapper.MemberMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring-config/applicationContext.xml"})
@Log4j
public class MemberMapperTests {

    @Setter(onMethod_ = @Autowired)
    private MemberMapper memberMapper;

    @Test
    public void testRead(){
        MemberVO memberVO = memberMapper.read("admin99");

        log.info(memberVO);

        memberVO.getAuthList().forEach(autoVO-> log.info(autoVO));
    }

}
