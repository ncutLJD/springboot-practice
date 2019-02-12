import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-practice
 * @description: springboot 启动类
 * @author: lijd
 * @create: 2019-02-12 17:26
 */

/**
 * @description:
 * - @RestController是一个原型注解，它给阅读Spring编写代码提供了提示，提示类扮演特定的角色
 * 在本例中，我们的类是一个@Controller，因此Spring在处理传入的web请求时考虑它。
 *
 * - @RequestMapping注释提供“路由”信息。它告诉Spring任何带有 / path的HTTP请求都应该映射到home方法。
 * - @RestController注释告诉Spring将结果字符串直接呈现回调用者
 *
 * - @EnableAutoConfiguration 注解告诉SpringBoot根据你添加的jar依赖项“猜测”你希望如何配置Spring
 * 由于Spring-boot-starter-web添加了Tomcat和Spring MVC, 因此自动配置假定你正在开发web应用程序，并且相应地设置Spring
 *
 * 应用程序的最后一部分是主方法，这只是遵循应用程序入口点Java约定的标准方法。我们的主要方法通过调用run委托给Spring Boot的
 * SpringApplication类。SpringApplication引导我们的应用程序启动Spring，而Spring又启动自动配置的Tomcat web服务器。我们需要将Example.class
 * 作为参数传递给run方法，以告诉SpringApplication哪个是主要的Spring组件。args数组还可以用于公开任何命令行参数。
 * */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}