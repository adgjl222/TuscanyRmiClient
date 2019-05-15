package com.tian;
import com.tian.model.Student;
import com.tian.service.StudentService;
import com.tian.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class RMITest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService);
        /*System.out.println("studentService = " + studentService);

        List<Student> students = studentService.select();
        System.out.println("students = " + students);*/
        boolean login = false;
        try {
            login = userService.login("一加一", "123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //如果用户名和密码对应则保存cookie信息到客户端并跳转学员页面
        System.out.println(" 控制类 " + login);

    }

}
