import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lyh
 * @date: 2018/3/12
 * @description:
 */
@RestController
public class GetWeb {
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public void sayhello(){
        System.out.println( "hello " + name);
    }
}