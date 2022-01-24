package org.conan.test;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.conan.domain.MemberVO;
import org.conan.mapper.MemberMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class MemberMapperTest {
 
    @Setter(onMethod_ = @Autowired)
    private MemberMapper mapper;
    
    @Test
    public void testRead() {
        MemberVO vo = mapper.read("admin20");
 
        log.info(vo);
        
        vo.getAuthList().forEach(authVO -> log.info(authVO));
    }
}