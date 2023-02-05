package example.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="GreetingView")
@SessionScoped
public class GreetingView implements Serializable {

  private static final long serialVersionUID = 1L;

  public static String getMsg() {
    return "Hello World";
  }
}
