package cn.kk;

import java.util.Map;

import org.apache.catalina.startup.HomesUserDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.kk.model.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 定义接口
 * 
 * @author KK
 *
 */
@RestController
public class UserController {

	@Value("${kk.name}")
	private String name;

	// @RequestMapping annotation provides “routing” information
	@ApiOperation(value = "测试", notes = "测试连接")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		return " hi you! ";
	}

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "hello World!" + name;
	}
	
	

	// 测试 post, get，put, delete rest api,并区分这些类型的意义
	// 了结注解 @RequestParam @PathVariable @RequestBody 不同参数时的意义，调用方法
	@RequestMapping(value = "/param", method = RequestMethod.GET)
	public Object getFromParam(@RequestParam(value = "xid", defaultValue = "kk") String name) {
		return name;
	}

	@RequestMapping(value = "/var/{name}", method = RequestMethod.GET)
	public Object getFromVariable(@PathVariable String name) {
		return name;
	}

	/**
	 * 自动转换json为map或实例化对象
	 * 
	 * @param map
	 * 
	 *            or class
	 * @return
	 */
	@RequestMapping(value = "/body", method = RequestMethod.POST)
	public Object getFromBody(@RequestBody Map<String, String> map) {
		return map;
	}

	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public Object addUser(@RequestBody User user) {
		return user;
	}
	
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public Object getUser(@RequestBody User user) {
		return user;
	}
}
